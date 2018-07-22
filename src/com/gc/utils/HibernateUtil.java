package com.gc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory = buildSessionFactory();
	
	private HibernateUtil() {
	}
	
	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			return cfg.configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
