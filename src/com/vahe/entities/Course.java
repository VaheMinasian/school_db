package com.vahe.entities;

import java.util.Date; 
import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * creates Course objects by the properties represented by class variables.
 * represents course entity in school_db relational database. Mapped by hibernate.
 * @author vmjc
 *
 */
@Entity
public class Course {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	@Column(nullable = false)
	private String courseName;
	
	@OneToMany(targetEntity=SubTchCrs.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="courseId")
	private List<SubTchCrs> subTchCrs;

	@OneToMany(targetEntity=Student.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="courseId")
	private List<Student> students;
	
	
	public Course() {}
	public Course(String name) {
		this.setCourseName(name);
	}
	
	//GETTERS AND SETTERS

	/**
	 * gets the SubTchCrs list associated with the given Course object.
	 * @return returns the SubTchCrs associated with given Course.
	 * @author vmjc
	 */
	public List<SubTchCrs> getSubTchCrs() {
		return subTchCrs;
	}
	
	/**
	 * sets the SubTchCrs list to the given Course object.
	 * @param subTchCrs the SubTchCrs list to be assigned to given Course object.
	 * @author vmjc
	 */
	public void setSubTchCrs(List<SubTchCrs> subTchCrs) {
		this.subTchCrs = subTchCrs;
	}

	/**
	 * gets the list of students for the given Course.
	 * @return the student list for the given Course.
	 * @author vmjc
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * sets student list to the current Course.
	 * @param students the student list to be assigned to current Course.
	 * @author vmjc
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * gets the course id for the Course object called for.
	 * @return returns the course id of given Course.
	 * @author vmjc
	 */
	public int getCourseId() {
		return courseId;
	}
	
	/**
	 * sets course id for given Course object.
	 * @param courseId the id to be assigned to the Course object called.
	 * @author vmjc
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	/**
	 * gets the course name for the Course object called for.
	 * @return returns course name of given Course object.
	 * @author vmjc
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * sets the course name for given Course object
	 * @param courseName the name to be assigned to the Course object called.
	 * @author vmjc
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}