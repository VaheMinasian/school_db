/**
 * 
 */
package com.vahe.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author vmjc
 *
 */
public class MySessionFactory {
	
		private static SessionFactory singletonSessionFactory = null;

		public static SessionFactory getInstance(){

			if (singletonSessionFactory==null) {
				singletonSessionFactory = new Configuration().configure().buildSessionFactory();
			}
		
			return singletonSessionFactory;
		}
		
		public MySessionFactory() {}
}
	
	

