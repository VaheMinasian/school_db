package com.vahe.entities;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.vahe.util.StackInterface;

/**
 * creates Teacher objects with the properties represented by it's private variables.
 * represents teacher entity in school_db relational database. Mapped by Hibernate.
 * @author vmjc
 */
@Entity
public class Teacher {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacherId;
	@Column(nullable = false)
	private String fName;
	@Column(nullable = false)
	private String lName;
	
	@OneToMany(targetEntity=Sub_Tch_Crs.class, mappedBy="teacher", cascade=CascadeType.ALL) 
	//@JoinColumn(name="teacher_id")
	private List<Sub_Tch_Crs> sub_tch;
	

	//GETTERS AND SETTERS
	
	/**
	 * gets the subject_teacher list associated with the given Teacher object.
	 * @return returns the subject_teacher list.
	 * @author vmjc
	 */
	public List<Sub_Tch_Crs> getSub_tch() {
		return sub_tch;
	}

	/**
	 * sets the subject_teacher list associated with the given Teacher object.
	 * @param sub_tch the subject_teacher list to be associated to the given Teacher object.
	 * @author vmjc
	 */
	public void setSub_tch(List<Sub_Tch_Crs> sub_tch) {
		this.sub_tch = sub_tch;
	}

	/**
	 * gets id for the given teacher object
	 * @author vmjc
	 * @return returns the id of requested teacher object
	 */
	public int getTeacherId() {
		return teacherId;
	}
	
	/**
	 * method sets id for given Teacher object.
	 * @param teacherId id to be assigned to Teacher object.
	 * @author vmjc
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	/**
	 * gets the first name of given teacher
	 * @author vmjc
	 * @return returns first name of given teacher object
	 */
	public String getfName() {
		return fName;
	}
	
	/**
	 * sets the first name for teacher objects
	 * @author vmjc
	 * @param fName the first name to be assigned to the given teacher
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * gets the last name of given teacher
	 * @author vmjc
	 * @return returns last name of given teacher object
	 */
	public String getlName() {
		return lName;
	}
	
	/**
	 * sets the second name for teacher objects
	 * @param lName the last name to be assigned for the given teacher.
	 * @author vmjc
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
}