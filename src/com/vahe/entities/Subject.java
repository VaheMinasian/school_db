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
 * creates Subject objects with the properties represented by it's variables.
 * represents subject entity in school_db relational database. Mapped by Hibernate.
 * @author vmjc
 */
@Entity
public class Subject {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subjectId;
	@Column(nullable = false)
	private String subjectName;
	
	@OneToMany(targetEntity=SubTchCrs.class, mappedBy="subject", cascade=CascadeType.ALL) 
	//@JoinColumn(name="subjectId")
	private List<SubTchCrs> subTchCrs;
	
	@OneToMany(targetEntity=Mark.class, mappedBy="subject", cascade=CascadeType.ALL) 
	//@JoinColumn(name="subjectId")
	private List<Mark> marks;
	
	public Subject() {}
	public Subject(String name) {
		this.setSubjectName(name);
	}
	
	//GETTERS AND SETTERS
	/**
	 * gets a list of subTchCrs for the given Subject object.
	 * @return returns the subTchCrs list associated with the given Subject object.
	 * @author vmjc
	 */
	public List<SubTchCrs> getSubTchCrs() {
		return subTchCrs;
	}

	/**
	 * sets the Subject_Teacher list for the given Subject object.
	 * @param sub_tch_crs Subject_Teacher list to be assigned to given Subject object.
	 * @author vmjc
	 */
	public void setSub_tch(List<SubTchCrs> subTchCrs) {
		this.subTchCrs = subTchCrs;
	}

	/**
	 * gets a list of Marks object for the given Subject object.
	 * @return returns the Mark list associated with the given Subject object.
	 * @author vmjc
	 */
	public List<Mark> getMark() {
		return marks;
	}

	/**
	 * sets the Mark list for the given Subject object.
	 * @param marks the Mark list to be assigned to given Subject object.
	 * @author vmjc
	 */
	public void setMark(List<Mark> marks) {
		this.marks = marks;
	}
	
	/**
	 * gets the id for the Subject object it's called for.
	 * @author vmjc
	 * @return returns the Id of given Subject object.
	 */
	public int getSubjectId() {
		return subjectId;
	}
	
	/**
	 * sets the id property for the given Subject object.
	 * @author vmjc
	 * @param subjectId the id number to be assigned to the given Subject object.
	 */
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	/**
	 * gets the name for the Subject object it's called for.
	 * @author vmjc
	 * @return returns the name of the given Subject object.
	 */
	public String getSubjectName() {
		return subjectName;
	}
	
	/**
	 * sets the name of the Subject object called for
	 * @author vmjc
	 * @param subjectName the name to be assigned to the given Subject object.
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
