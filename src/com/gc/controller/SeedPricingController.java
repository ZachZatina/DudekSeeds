package com.gc.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gc.model.SeedPriceDTO;
import com.gc.utils.HibernateUtil;

@Controller
public class SeedPricingController {
	
	@RequestMapping("/SeedPricing")
	public ModelAndView showPricing(Model model) {
		ArrayList<SeedPriceDTO> pList = listSeedPrices();
		double[] dPrice = getDiscountPrice(pList);
		System.out.println(dPrice[1]);
		System.out.println(pList.get(1).getType().toString());
		System.out.println("the stuff should be above this");
		
		return new ModelAndView("SeedPricing", "priceList", pList);
		
	}
	
	public ArrayList<SeedPriceDTO> listSeedPrices() {
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session sess = sessFact.openSession();
		Transaction tx = sess.beginTransaction();
		Criteria crit = sess.createCriteria(SeedPriceDTO.class);
		ArrayList<SeedPriceDTO> priceList = (ArrayList<SeedPriceDTO>) crit.list();
		tx.commit();
		sess.close();
		return priceList;
	}
	
	public double[] getDiscountPrice(ArrayList<SeedPriceDTO> pList) {
		
		double[] dPrice = new double[pList.size()];
		
		for(int i = 0; i < pList.size(); i++) {
			double value = pList.get(i).getPrice() - pList.get(i).getDiscount();
			dPrice[i] = value;
		}
		
		return dPrice;
	}
	
}
