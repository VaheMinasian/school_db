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
 * creates Subject objects with the properties represented by it's variables.
 * represents subject entity in school_db relational database. Mapped by Hibernate.
 * @author vmjc
 */
@Entity
public class Subject {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subject_Id;
	private String subject_name;
	
	@OneToMany(targetEntity=Subject_Teacher.class, mappedBy="subject", cascade=CascadeType.ALL) 
	//@JoinColumn(name="subject_id")
	private List<Subject_Teacher> sub_tch;
	
	@OneToMany(targetEntity=Mark.class, mappedBy="subject", cascade=CascadeType.ALL) 
	//@JoinColumn(name="subject_id")
	private List<Mark> marks;
	
	
	//GETTERS AND SETTERS
	/**
	 * gets a list of Subject_Teacher for the given Subject object.
	 * @return returns the Subject_Teacher list associated with the given Subject object.
	 * @author vmjc
	 */
	public List<Subject_Teacher> getSub_tch() {
		return sub_tch;
	}

	/**
	 * sets the Subject_Teacher list for the given Subject object.
	 * @param sub_tch Subject_Teacher list to be assigned to given Subject object.
	 * @author vmjc
	 */
	public void setSub_tch(List<Subject_Teacher> sub_tch) {
		this.sub_tch = sub_tch;
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
	 * @param mark the Mark list to be assigned to given Subject object.
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
		return subject_Id;
	}
	
	/**
	 * sets the id property for the given Subject object.
	 * @author vmjc
	 * @param subjectId the id number to be assigned to the given Subject object.
	 */
	public void setSubjectId(int subjectId) {
		this.subject_Id = subjectId;
	}
	
	/**
	 * gets the name for the Subject object it's called for.
	 * @author vmjc
	 * @return returns the name of the given Subject object.
	 */
	public String getSubject_name() {
		return subject_name;
	}
	
	/**
	 * sets the name of the Subject object called for
	 * @author vmjc
	 * @param subject_name the name to be assigned to the given Subject object.
	 */
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
}
