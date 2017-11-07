package com.vahe.entities;

import java.util.Date;  

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Creates a SubTchCrs object with the given properties.
 * represents a link table between Subject and Teacher and Course tables in the school_db relational database.
 * mapped by Hibernate.
 * @author vmjc
 */
@Entity
public class SubTchCrs {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne @JoinColumn(name="teacherId")
	private Teacher teacher;
	
	@ManyToOne @JoinColumn(name="subjectId")
	private Subject subject;
	
	@ManyToOne @JoinColumn(name="courseId")
	private Course course;

	public SubTchCrs() {}
	public SubTchCrs(Subject subject, Teacher teacher, Course course) {
		this.setSubject(subject);
		this.setTeacher(teacher);
		this.setCourse(course);
	}
	
	//GETTERS AND SETTERS
	
	/**
	 * gets the id for the given SubTchCrs object.
	 * @return returns the id number for the given SubTchCrs object
	 * @author vmjc
	 */
	public int getStcId() {
		return id;
	}

	/**
	 * sets the id for the SubTchCrs object
	 * @param stcId id to be set for the SubTchCrs object
	 * @author vmjc
	 */
	public void setStc_id(int stcId) {
		this.id = id;
	}	
	
	/**
	 * gets the Teacher object for the current SubTchCrs object.
	 * @return returns the Teacher object for the current SubTchCrs object.
	 * @author vmjc
	 */
	public Teacher getTeacher() {
		return teacher;
	}
	
	/**
	 * sets the Teacher attribute for the current SubTchCrs object.
	 * @param teacher the Teacher object to be assigned to given SubTchCrs object.
	 * @author vmjc
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * gets the Subject object for the current SubTchCrs object.
	 * @return returns the Subject object for the current SubTchCrs object.
	 * @author vmjc
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * sets the Subject attribute for the current SubTchCrs object.
	 * @param subject the Subject object to be assigned to given SubTchCrs object.
	 * @author vmjc
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * gets the course object for the current SubTchCrs object.
	 * @return returns the course object for the current SubTchCrs object.
	 * @author vmjc
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * sets the course attribute for the current SubTchCrs object.
	 * @param course the course object to be assigned to given SubTchCrs object.
	 * @author vmjc
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
}