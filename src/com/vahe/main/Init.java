package com.vahe.main;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vahe.entities.Course;
import com.vahe.entities.Mark;
import com.vahe.entities.Student;
import com.vahe.entities.Subject;
import com.vahe.entities.SubTchCrs;
import com.vahe.entities.Teacher;
import com.vahe.util.MySessionFactory;

/**
 * This class creates the classes and tables in relational database 
 * and fills the tables with initial values. 
 * @author vmjc
 *
 */
public class Init {

	/**
	 * this method creates the objects and the relational database.
	 * @author vmjc
	 */
	void initialize() {
		
		//Creating Entity objects
		
		//Teacher objects
		Teacher teacher1 = new Teacher("Jose Luis", "Alonso");
		Teacher teacher2 = new Teacher("Kevin", "Jung");
		Teacher teacher3 = new Teacher("Amanda", "Björk");
		Teacher teacher4 = new Teacher("Teresa", "Karlsson");
		
		// Course objects
		Course course1 = new Course("science");
		Course course2 = new Course("arts");
		Course course3 = new Course("technique");
		
		//Subject objects
		Subject sbj1 = new Subject("music");
		Subject sbj2 = new Subject("painting");
		Subject sbj3 = new Subject("chemistry");
		Subject sbj4 = new Subject("phisics");
		Subject sbj5 = new Subject("mathematics");
		Subject sbj6 = new Subject("constructions");
		Subject sbj7 = new Subject("home reparations");
		
		//Student objects
		Student student1 = new Student("George", "Moore",course1);
		Student student2 = new Student("Jan", "Fredrikson", course3);
		Student student3 = new Student("Hans", "Larsson", course2);
		Student student4 = new Student("Julia", "Simons",course1);
		Student student5 = new Student("Robert", "Black", course3);
		Student student6 = new Student("Cassandra", "Ramires",course2);
		Student student7 = new Student("Solomon", "Davids",course2);
		Student student8 = new Student("Viveka", "Walin",course1);
		Student student9 = new Student("Tao", "Lin",course2);
		Student student10 = new Student("Anastassia", "Bloom",course2);
		
		//Mark objects
		Mark m1 = new Mark(student3, sbj3, 8);
		Mark m2 = new Mark(student3, sbj4, 8);
		Mark m3 = new Mark(student3, sbj5, 6);
		Mark m4 = new Mark(student7, sbj3, 9);
		Mark m5 = new Mark(student7, sbj5, 10);
		Mark m6 = new Mark(student7, sbj4, 7);
		Mark m7 = new Mark(student10, sbj4, 9);
		Mark m8 = new Mark(student10, sbj5, 7);
		Mark m9 = new Mark(student10, sbj3, 7);
		Mark m10 = new Mark(student1, sbj1, 9);
		Mark m11 = new Mark(student1, sbj2, 8);
		Mark m12 = new Mark(student2, sbj1, 9);
		Mark m13 = new Mark(student2, sbj2, 7);
		Mark m14 = new Mark(student4, sbj1, 8);
		Mark m15 = new Mark(student4, sbj2, 9);
		Mark m16 = new Mark(student5, sbj1, 9);
		Mark m17 = new Mark(student5, sbj2, 8);
		Mark m18 = new Mark(student8, sbj2, 8);
		Mark m19 = new Mark(student8, sbj1, 8);
		Mark m20 = new Mark(student6, sbj6, 7);
		Mark m21 = new Mark(student6, sbj7, 8);
		Mark m22 = new Mark(student9, sbj6, 9);
		Mark m23 = new Mark(student9, sbj7, 10);
		
		// subject_teacher objects
		SubTchCrs stc1 = new SubTchCrs(sbj3, teacher2, course1);
		SubTchCrs stc2 = new SubTchCrs(sbj4, teacher2, course1);
		SubTchCrs stc3 = new SubTchCrs(sbj5, teacher2, course1);
		SubTchCrs stc4 = new SubTchCrs(sbj1, teacher1, course2);
		SubTchCrs stc5 = new SubTchCrs(sbj2, teacher3, course2);
		SubTchCrs stc6 = new SubTchCrs(sbj6, teacher4, course3);
		SubTchCrs stc7 = new SubTchCrs(sbj7, teacher4, course3);
		
		Session session = MySessionFactory.getInstance().openSession();
		session.beginTransaction();
		
		session.save(teacher1); session.save(teacher2); session.save(teacher3); session.save(teacher4);
		
		session.save(course1);session.save(course2);session.save(course3);
		
		session.save(sbj1); session.save(sbj2); session.save(sbj3); session.save(sbj4); session.save(sbj5);
		session.save(sbj6); session.save(sbj7);
		
		session.save(student1);session.save(student2);session.save(student3);session.save(student4);
		session.save(student5);session.save(student6);session.save(student7);session.save(student8);
		session.save(student9);session.save(student10);

		session.save(m1);session.save(m2);session.save(m3);session.save(m4);session.save(m5);session.save(m6);
		session.save(m7);session.save(m8);session.save(m9);session.save(m10);session.save(m11);session.save(m12);
		session.save(m13);session.save(m14);session.save(m15);session.save(m16);session.save(m17);session.save(m18);
		session.save(m19);session.save(m20);session.save(m21);session.save(m22);session.save(m23);
		
		session.save(stc1);session.save(stc2);session.save(stc3);session.save(stc4);session.save(stc5);
		session.save(stc6);session.save(stc7);
		
		
		
		session.getTransaction().commit();
		session.close();
		
		/*
		System.out.println("\nperforming CRUD operations...");
		
		System.out.println("\nselecting an attribute...");
		System.out.println("Course with id 2 is: " + session.get(Course.class, 2).getCourse_name());

		System.out.println("\ndeleting a row/object...");
		session.delete(student9);
		
		System.out.println("\nupdating an attribute...");
		teacher2.setlName("Alonso");
		session.update(teacher2);
		*/		
	}
}
