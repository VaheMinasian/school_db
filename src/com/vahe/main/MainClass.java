package com.vahe.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vahe.entities.Teacher;

/**
 * The main class for the school_db application includes the main method.
 * @author vmjc
 *
 */
public class MainClass {

	/**
	 * 
	 * The main method for the school_db application
	 * @param args parameters which can be passed to main method.
	 * @author vmjc
	 */
	public static void main(String[] args) {

		Init init = new Init();
		init.initialize();
		
	}

}
