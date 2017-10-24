package com.vahe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Creates a Subject_Teacher object with the given properties.
 * represents a link table between Subject and Teacher tables in the school_db relational database.
 * mapped by Hibernate.
 * @author vmjc
 */
@Entity
public class Subject_Teacher {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int st_id;
	
	@ManyToOne @JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	@ManyToOne @JoinColumn(name="subject_id")
	private Subject subject;
	
	@ManyToOne @JoinColumn(name="course_id")
	private Course course;

	//GETTERS AND SETTERS
	
	/**
	 * gets the id for the given Subject_Teacher object.
	 * @return returns the id number for the given Subject_Teacher object
	 * @author vmjc
	 */
	public int getSt_id() {
		return st_id;
	}

	/**
	 * sets the id for the Subject_Teacher object
	 * @param st_id id for to be set for the st_id object
	 * @author vmjc
	 */
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}	
	
	/**
	 * gets the Teacher object for the current Subject_Teacher object.
	 * @return returns the Teacher object for the current Subject_Teacher object.
	 * @author vmjc
	 */
	public Teacher getTeacher() {
		return teacher;
	}
	
	/**
	 * sets the Teacher attribute for the current Subject_Teacher object.
	 * @param teacher the Teacher object to be assigned to given Subject_Teacher object.
	 * @author vmjc
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * gets the Subject object for the current Subject_Teacher object.
	 * @return returns the Subject object for the current Subject_Teacher object.
	 * @author vmjc
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * sets the Subject attribute for the current Subject_Teacher object.
	 * @param subject the Subject object to be assigned to given Subject_Teacher object.
	 * @author vmjc
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * gets the course object for the current Subject_Teacher object.
	 * @return returns the course object for the current Subject_Teacher object.
	 * @author vmjc
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * sets the course attribute for the current Subject_Teacher object.
	 * @param course the course object to be assigned to given Subject_Teacher object.
	 * @author vmjc
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
}