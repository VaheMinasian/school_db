package com.vahe.entities;

import java.util.Date; 
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
public class Student{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	@Column(nullable = false)
	private String fName;
	@Column(nullable = false)
	private String lName;

	@ManyToOne @JoinColumn(name="courseId")
	private Course course;
	
	@OneToMany(targetEntity=Mark.class, mappedBy="student", cascade=CascadeType.ALL) 
	//@JoinColumn(name="studentId")
	private List<Mark> marks;
	
	public Student() {}
	public Student(String fName, String lName, Course course) {
		this.setFName(fName);
		this.setLName(lName);
		this.setCourse(course);
	}
	
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
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * sets the student id for the given Student object.
	 * @param studentId the id to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * gets the first name for the Student object called for.
	 * @return returns first name for the given Student object.
	 * @author vmjc
	 */
	public String getFName() {
		return fName;
	}
	
	/**
	 * sets the student first name for the given Student object.
	 * @param fName the first name to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setFName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * gets the last name for the Student object called for.
	 * @return returns last nameid for the given Student object.
	 * @author vmjc
	 */
	public String getLName() {
		return lName;
	}

	/**
	 * sets the student last name for the given Student object.
	 * @param lName the last name to be assigned to the given Student object.
	 * @author vmjc
	 */
	public void setLName(String lName) {
		this.lName = lName;
	}
}