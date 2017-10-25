package com.vahe.entities;

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
	private int course_id;
	@Column(nullable = false)
	private String course_name;
	
	@OneToMany(targetEntity=Sub_Tch_Crs.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="course_id")
	private List<Sub_Tch_Crs> sub_tch;

	@OneToMany(targetEntity=Student.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="course_id")
	private List<Student> students;
	
	
	//GETTERS AND SETTERS

	/**
	 * gets the Subject_Teacher list associated with the given Course object.
	 * @return returns the Subject_Teacher list associated with given Course.
	 * @author vmjc
	 */
	public List<Sub_Tch_Crs> getSub_tch() {
		return sub_tch;
	}
	
	/**
	 * sets the Subject_Teacher list to the given Course object.
	 * @param sub_tch the Subject_Teacher list to be assigned to given Course object.
	 * @author vmjc
	 */
	public void setSub_tch(List<Sub_Tch_Crs> sub_tch) {
		this.sub_tch = sub_tch;
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
	public int getCourse_id() {
		return course_id;
	}
	
	/**
	 * sets course id for given Course object.
	 * @param course_id the id to be assigned to the Course object called.
	 * @author vmjc
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	/**
	 * gets the course name for the Course object called for.
	 * @return returns course name of given Course object.
	 * @author vmjc
	 */
	public String getCourse_name() {
		return course_name;
	}
	
	/**
	 * sets the course name for given Course object
	 * @param course_name the name to be assigned to the Course object called.
	 * @author vmjc
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
}