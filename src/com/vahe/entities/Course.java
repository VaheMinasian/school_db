package com.vahe.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * creates Group objects by the properties represented by class variables.
 * represents group entity in school_db relational database. Mapped by hibernate.
 * @author vmjc
 *
 */
@Entity
public class Course {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int course_id;
	private String course_name;
	
	@OneToMany(targetEntity=Subject_Teacher.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="group_id")
	private List<Subject_Teacher> sub_tch;

	@OneToMany(targetEntity=Student.class, mappedBy="course", cascade=CascadeType.ALL) 
	//@JoinColumn(name="group_id")
	private List<Student> students;
	
	
	//GETTERS AND SETTERS

	/**
	 * gets the Subject_Teacher list associated with the given Group object.
	 * @return returns the Subject_Teacher list associated with given Group.
	 * @author vmjc
	 */
	public List<Subject_Teacher> getSub_tch() {
		return sub_tch;
	}
	
	/**
	 * sets the Subject_Teacher list to the given Group object.
	 * @param sub_t the Subject_Teacher list to be assigned to given Group object.
	 * @author vmjc
	 */
	public void setSub_tch(List<Subject_Teacher> sub_tch) {
		this.sub_tch = sub_tch;
	}

	/**
	 * gets the list of students for the given group.
	 * @return the student list for the given group.
	 * @author vmjc
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * sets student list to the current group.
	 * @param students the student list to be assigned to current group.
	 * @author vmjc
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * gets the group id for the Group object called for.
	 * @return returns the groupd id of given Group.
	 * @author vmjc
	 */
	public int getGroup_id() {
		return course_id;
	}
	
	/**
	 * sets groupd id for given Group object.
	 * @param group_id the id to be assigned to the Group object called.
	 * @author vmjc
	 */
	public void setCourse_id(int group_id) {
		this.course_id = course_id;
	}
	
	/**
	 * gets the group name for the Group object called for.
	 * @return returns group name of given Group object.
	 * @author vmjc
	 */
	public String getCourse_name() {
		return course_name;
	}
	
	/**
	 * sets the group name for given Group object
	 * @param group_name the name to be assigned to the Group object called.
	 * @author vmjc
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
}