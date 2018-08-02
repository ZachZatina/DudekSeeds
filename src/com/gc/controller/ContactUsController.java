package com.gc.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.time.*;
import java.util.ArrayList;

import com.gc.model.ContactListDTO;
import com.gc.utils.HibernateUtil;

@Controller
public class ContactUsController {

	@RequestMapping("/checkinfo")
	public ModelAndView guestbookPage(@RequestParam("input") String[] info, Model model) {
		if (info != null) {
			addToGuestBook(info);
		}
		ArrayList<ContactListDTO> contactList = createContactList();
		
		return new ModelAndView("ContactUs", "contactList", contactList);
	}
	
	@RequestMapping("/ContactUs")
	public ModelAndView contactUsPage(Model model) {
		ArrayList<ContactListDTO> contactList = createContactList();
		return new ModelAndView("ContactUs", "contactList", contactList);
	}
	
	private ArrayList<ContactListDTO> createContactList() {
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session sess = sessFact.openSession();
		Transaction tx = sess.beginTransaction();
		Criteria crit = sess.createCriteria(ContactListDTO.class);
		ArrayList<ContactListDTO> contactList = (ArrayList<ContactListDTO>) crit.list();
		System.out.println(contactList.size());
		tx.commit();
		sess.close();
		return contactList;
	}
	
	private void addToGuestBook(String[] info) {
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session sess = sessFact.openSession();
		Transaction tx = sess.beginTransaction();

		String date = getCurrentDate();
		ContactListDTO contactList = new ContactListDTO();
		contactList.setVisitor_Name(info[0]);
		contactList.setVisitor_Email(info[1]);
		contactList.setVisitor_Comment(info[2]);
		contactList.setVisit_Date(date);

		sess.save(contactList);
		tx.commit();
		sess.close();
	}

	private String getCurrentDate() {
		String date = LocalDate.now().toString();
		String[] dateSplit = date.split("-");
		String dateFormat = dateSplit[1] + "-" + dateSplit[2] + "-" + dateSplit[0];
		return dateFormat;
	}
}
