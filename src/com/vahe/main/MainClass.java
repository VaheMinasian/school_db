package com.vahe.main;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import com.vahe.entities.Course;
import com.vahe.entities.SubTchCrs;
import com.vahe.entities.Subject;
import com.vahe.entities.Teacher;
import com.vahe.util.MySessionFactory;


/**
 * The main class for the school_db application includes the main method.
 * @author vmjc
 *
 */
public class MainClass {

	private static boolean continueProgram = true; 
	private static String crud;
	static Scanner choose;

	
	/**
	 * 
	 * The main method for the school_db application
	 * @param args parameters which can be passed to main method.
	 * @author vmjc
	 */
	public static void main(String[] args) {

		Init init = new Init();
		init.initialize();
		
		try {	
	 choose = new Scanner(System.in);
	//public static void main(String[]args) {
			EntityManager em;

	
			while(continueProgram) {
				System.out.print("\n type CRUD operation you wish to perform\n'1' for 'select all' |");
				System.out.print(" '2' for 'create entry'  |");
				System.out.print(" '3' for 'update entry' |");
				System.out.print(" '4' for 'delete entry' |");
				System.out.println(" '0' to Exit program");
				if(choose.hasNextLine()) {
				crud = choose.nextLine();
					switch (crud) {
						case "0": 
							choose.close();
							continueProgram=false;
							System.out.println("Good bye");
							
						break;
						
						case "1": 
							System.out.println("write table name and column name separated with ','");
							crud=choose.nextLine();
							Session session = MySessionFactory.getInstance().openSession();
							String[] input = crud.split(",");
							
							if (input.length==2) {
								Query query = session.createQuery("select " + input[1] + " from " + input[0]);		
								System.out.println(((org.hibernate.query.Query) query).list()); 
							}
							else if (input.length==1) 
								System.out.println("Please give Table name and column name."); 
						break;	
						
						case "2": 
							System.out.println("choose one of following tables to insert into 'teacher', 'subject', 'course'");
							String table = choose.nextLine();
							System.out.println("write all parameters for the given table separated by ','");
							crud =choose.nextLine();
							String[] input1 = crud.split(",");
							Session session1 = MySessionFactory.getInstance().openSession();
							session1.beginTransaction();
							if ( (table.equalsIgnoreCase("Teacher")) && (input1.length!=2)) {
								System.out.println("you have input wrong number of parameter or types.");
								return;
							}else if ((table.equalsIgnoreCase("Teacher"))) {
								Teacher teacher = new Teacher(input1[0], input1[1]);
								session1.save(teacher);
							}else if (table.equalsIgnoreCase("Subject")) {
								Subject subject = new Subject(input1[0]);
								session1.save(subject);
							}else if (table.equalsIgnoreCase("course")) {
								Course course = new Course(input1[0]);
								session1.save(course);
							}
							session1.getTransaction().commit();
							session1.close();
						break;	
						
						case "3": 
							System.out.println("write 'table name', 'column to set', 'new value', 'key column', 'key value' separated by ','.");
							crud=choose.nextLine();
							Session session2 = MySessionFactory.getInstance().openSession();
							session2.beginTransaction();

							String[] input2 = crud.split(",");
							Query query1 = session2.createQuery("update " + input2[0] + " set " + input2[1] + "='" +input2[2]+ 
									"' where " + input2[3] + "='" + input2[4]+"'");
							
							int result = query1.executeUpdate();
							System.out.println("Number of records effected due to update query = "+result);
							session2.getTransaction().commit();
							session2.close();
						break;	
						
						case "4": 
							System.out.println("write 'table name', 'key column', 'key value' separated by ','.");
							crud=choose.nextLine();
							Session session3 = MySessionFactory.getInstance().openSession();
							
							session3.beginTransaction();
							
							String[] input3 = crud.split(",");
							
							Query query2 = session3.createQuery("delete " + input3[0] + " where" + input3[1] + "='"+input3[2].trim()+"'");
							int result1 = query2.executeUpdate();
							System.out.println("Number of records effected due to update query = "+result1);
							
							session3.getTransaction().commit();
							session3.close();
						break;	
						
						default: System.out.println("Invalid input, try again.");
						break;
					}  
				} 		
			}		
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}		
}