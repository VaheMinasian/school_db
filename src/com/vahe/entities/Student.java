package com.vahe.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * creates Student objects with the properties represented by it's variables.
 * represents Student entity in school_db relational database, mapped by Hibernate.
 * @author vmjc
 *
 */
@Entity
public class Student {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_id;
	@Column(nullable = false)
	private String f_name;
	@Column(nullable = false)
	private String l_name;

	@ManyToOne @JoinColumn(name="course_id")
	private Course course;
	
	@OneToMany(targetEntity=Mark.class, mappedBy="student", cascade=CascadeType.ALL) 
	//@JoinColumn(name="student_id")
	private List<Mark> marks;
	
	/**
	 * get the marks for the Student object called for.
	 * @return returns the marks for the given Student object.
	 * @author vmjc
	 */
	public List<Mark> getMarks() {
		return marks;
	}

	/**
	 * sets the marks for the current Student object.
	 * @param marks the marks to be set for the current Student object.
	 * @author vmjc
	 */
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	/**
	 * gets the course for the current Student object.
	 * @return returns the course of current Student object.
	 * @author vmjc
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * sets the course for the current student object.
	 * @param course the course to be assigned to current object.
	 * @author vmjc
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	
	/**
	 * gets the student id for the Student object called for.
	 * @return returns id for the given Student object.
	 * @author vmjc
	 */
	public int getStudent_id() {
		return student_id;
	}
	
	/**
	 * sets the student id for the given Student object.
	 * @param student_id the id to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	/**
	 * gets the first name for the Student object called for.
	 * @return returns first name for the given Student object.
	 * @author vmjc
	 */
	public String getF_name() {
		return f_name;
	}
	
	/**
	 * sets the student first name for the given Student object.
	 * @param f_name the first name to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	
	/**
	 * gets the last name for the Student object called for.
	 * @return returns last nameid for the given Student object.
	 * @author vmjc
	 */
	public String getL_name() {
		return l_name;
	}

	/**
	 * sets the student last name for the given Student object.
	 * @param l_name the last name to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
}