package com.vahe.main;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vahe.entities.Course;
import com.vahe.entities.Mark;
import com.vahe.entities.Student;
import com.vahe.entities.Subject;
import com.vahe.entities.Sub_Tch_Crs;
import com.vahe.entities.Teacher;

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
		Teacher teacher1 = new Teacher();
		teacher1.setfName("Jose Luis");
		teacher1.setlName("Alonso");
		
		Teacher teacher2 = new Teacher();
		teacher2.setfName("Kevin");
		teacher2.setlName("Jung");

		Teacher teacher3 = new Teacher();
		teacher3.setfName("Amanda");
		teacher3.setlName("Björk");
		
		Teacher teacher4 = new Teacher();
		teacher4.setfName("Teresa");
		teacher4.setlName("Karlsson");
		
		//////////////
		
		// Group objects
		
		Course course1 = new Course();
		course1.setCourse_name("science");
		
		Course course2 = new Course();
		course2.setCourse_name("arts");
		
		Course course3 = new Course();
		course3.setCourse_name("technique");
		
		//////////////
		
		//Subject objects
		
		Subject sbj1 = new Subject();
		sbj1.setSubject_name("music");

		Subject sbj2 = new Subject();
		sbj2.setSubject_name("painting");

		Subject sbj3 = new Subject();
		sbj3.setSubject_name("chemistry");

		Subject sbj4 = new Subject();
		sbj4.setSubject_name("phisics");

		Subject sbj5 = new Subject();
		sbj5.setSubject_name("mathematics");

		Subject sbj6 = new Subject();
		sbj6.setSubject_name("constructions");
		
		Subject sbj7 = new Subject();
		sbj7.setSubject_name("home reparations");
		
		///////////////////
		
		//Student objects
		
		Student student1 = new Student();
		student1.setF_name("George");
		student1.setL_name("Moore");
		student1.setCourse(course1);
		
		Student student2 = new Student();
		student2.setF_name("Jan");
		student2.setL_name("Fredrikson");
		student2.setCourse(course3);
		
		Student student3 = new Student();
		student3.setF_name("Hans");
		student3.setL_name("Larsson");
		student3.setCourse(course2);

		Student student4 = new Student();
		student4.setF_name("Julia");
		student4.setL_name("Simons");
		student4.setCourse(course1);
		
		Student student5 = new Student();
		student5.setF_name("Robert");
		student5.setL_name("Black");
		student5.setCourse(course3);
		
		Student student6 = new Student();
		student6.setF_name("Cassandra");
		student6.setL_name("Ramires");
		student6.setCourse(course2);
		
		Student student7 = new Student();
		student7.setF_name("Solomon");
		student7.setL_name("Davids");
		student7.setCourse(course2);
		
		Student student8 = new Student();
		student8.setF_name("Viveka");
		student8.setL_name("Walin");
		student8.setCourse(course1);
		
		Student student9 = new Student();
		student9.setF_name("Tao");
		student9.setL_name("Lin");
		student9.setCourse(course2);

		Student student10 = new Student();
		student10.setF_name("Anastassia");
		student10.setL_name("Bloom");
		student10.setCourse(course2);
		
		//Mark objects
		
		Mark m1 = new Mark();
		m1.setStudent(student3);
		m1.setSubject(sbj3);
		m1.setMark(8);//
		m1.setDate();
		
		Mark m2 = new Mark();
		m2.setStudent(student3);
		m2.setSubject(sbj4);
		m2.setMark(8);
		m2.setDate();
		
		Mark m3 = new Mark();
		m3.setStudent(student3);
		m3.setSubject(sbj5);
		m3.setMark(6);
		m3.setDate();
		
		Mark m4 = new Mark();
		m4.setStudent(student7);
		m4.setSubject(sbj3);
		m4.setMark(9);
		m4.setDate();
		
		Mark m5 = new Mark();
		m5.setStudent(student7);
		m5.setSubject(sbj5);
		//m5.setMark(10);
		//m5.setDate();
		
		Mark m6 = new Mark();
		m6.setStudent(student7);
		m6.setSubject(sbj4);
		m6.setMark(7);
		m6.setDate();
		
		Mark m7 = new Mark();
		m7.setStudent(student10);
		m7.setSubject(sbj4);
		m7.setMark(9);
		m7.setDate();
		
		Mark m8 = new Mark();
		m8.setStudent(student10);
		m8.setSubject(sbj5);
		m8.setMark(7);
		m8.setDate();
		
		Mark m9 = new Mark();
		m9.setStudent(student10);
		m9.setSubject(sbj3);
		m9.setMark(7);
		m9.setDate();
		
		Mark m10 = new Mark();
		m10.setStudent(student1);
		m10.setSubject(sbj1);
		m10.setMark(9);
		m10.setDate();
		
		Mark m11 = new Mark();
		m11.setStudent(student1);
		m11.setSubject(sbj2);
		m11.setMark(8);
		m11.setDate();
		
		Mark m12 = new Mark();
		m12.setStudent(student2);
		m12.setSubject(sbj1);
		//m12.setMark(9);
		//m12.setDate();
		
		Mark m13 = new Mark();
		m13.setStudent(student2);
		m13.setSubject(sbj2);
		m13.setMark(7);
		m13.setDate();
		
		Mark m14 = new Mark();
		m14.setStudent(student4);
		m14.setSubject(sbj1);
		m14.setMark(8);
		m14.setDate();
		
		Mark m15 = new Mark();
		m15.setStudent(student4);
		m15.setSubject(sbj2);
		//m15.setMark(9);
		//m15.setDate();
		
		Mark m16 = new Mark();
		m16.setStudent(student5);
		m16.setSubject(sbj1);
		m16.setMark(9);
		m16.setDate();
		
		Mark m17 = new Mark();
		m17.setStudent(student5);
		m17.setSubject(sbj2);
		m17.setMark(8);
		m17.setDate();
		
		Mark m18 = new Mark();
		m18.setStudent(student8);
		m18.setSubject(sbj2);
		m18.setMark(8);
		m18.setDate();
		
		Mark m19 = new Mark();
		m19.setStudent(student8);
		m19.setSubject(sbj1);
		//m19.setMark(8);
		//m19.setDate();
		
		Mark m20 = new Mark();
		m20.setStudent(student6);
		m20.setSubject(sbj6);
		m20.setMark(7);
		m20.setDate();
		
		Mark m21 = new Mark();
		m21.setStudent(student6);
		m21.setSubject(sbj7);
		m21.setMark(8);
		m21.setDate();
		
		Mark m22 = new Mark();
		m22.setStudent(student9);
		m22.setSubject(sbj6);
		//m22.setMark(9);
		//m22.setDate();
		
		Mark m23 = new Mark();
		m23.setStudent(student9);
		m23.setSubject(sbj7);
		m23.setMark(10);
		m23.setDate();
		
		///////////////////
		
		// subject_teacher objects
		
		Sub_Tch_Crs stc1 = new Sub_Tch_Crs();
		stc1.setCourse(course1);
		stc1.setSubject(sbj3);
		stc1.setTeacher(teacher2);
		
		Sub_Tch_Crs stc2 = new Sub_Tch_Crs();
		stc2.setCourse(course1);
		stc2.setSubject(sbj4);
		stc2.setTeacher(teacher2);
		
		Sub_Tch_Crs stc3 = new Sub_Tch_Crs();
		stc3.setCourse(course1);
		stc3.setSubject(sbj5);
		stc3.setTeacher(teacher2);
		
		Sub_Tch_Crs stc4 = new Sub_Tch_Crs();
		stc4.setCourse(course2);
		stc4.setSubject(sbj1);
		stc4.setTeacher(teacher1);
		
		Sub_Tch_Crs stc5 = new Sub_Tch_Crs();
		stc5.setCourse(course2);
		stc5.setSubject(sbj2);
		stc5.setTeacher(teacher3);
		
		Sub_Tch_Crs stc6 = new Sub_Tch_Crs();
		stc6.setCourse(course3);
		stc6.setSubject(sbj6);
		stc6.setTeacher(teacher4);
		
		Sub_Tch_Crs stc7 = new Sub_Tch_Crs();
		stc7.setCourse(course3);
		stc7.setSubject(sbj7);
		stc7.setTeacher(teacher4);
		
		////////////////////
		//getting objects  Classname x = (Classname) session.get(Classname.class, 6);
		//deleting session.delete(x)
		//updating x.setUserName("updted user"); session.update(x);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
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
		
		
		System.out.println("\nperforming CRUD operations...");
		
		System.out.println("\nselecting an attribute...");
		System.out.println("Course with id 2 is: " + session.get(Course.class, 2).getCourse_name());

		System.out.println("\ndeleting a row/object...");
		session.delete(student9);
		
		System.out.println("\nupdating an attribute...");
		teacher2.setlName("Alonso");
		session.update(teacher2);
		
		session.getTransaction().commit();
		session.close();
		
				
	}
}
