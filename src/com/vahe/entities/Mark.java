package com.vahe.entities;

import java.util.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 * creates Mark objects with the properties represented by it's variables.
 * represents Marks entity in school_db relational database, mapped by Hibernate.
 * @author vmjc
 *
 */
@Entity
public class Mark {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int markId;
	private int mark=-1;
	private Date date;
	
	@ManyToOne @JoinColumn(name="studentId")
	private Student student;

	@ManyToOne @JoinColumn(name="subjectId")
	private Subject subject;
	
	public Mark() {}
	public Mark(Student student, Subject subject, int mark) {
		this.setStudent(student);
		this.setSubject(subject);
		this.setMark(mark);
		this.setDate();
	}
	//GETTERS AND SETTERS
	/**
	 * gets the Subject object for given Mark object.
	 * @return returns the Subject object associated with given Mark object.
	 * @author vmjc
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * sets the Subject object for the given Mark object.
	 * @param subject the Subject to be assigned to the given Mark object.
	 * @author vmjc
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	/**
	 * gets the student who earned the current mark of Mark object.
	 * @return returns the student who got the given Mark object.
	 * @author vmjc
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * sets the student for the given Mark object.
	 * @param student the Student who earned the mark of given Mark object.
	 * @author vmjc
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * gets the mark id for the mark object the method is called for.
	 * @author vmjc
	 * @return returns id for the given mark object/row.
	 */
	public int getMarkId() {
		return markId;
	}
	
	/**
	 * sets the id for the Mark object the method is called for.
	 * @author vmjc
	 * @param markId the id to be assigned to the given Mark object.
	 */
	public void setMark_id(int markId) {
		this.markId = markId;
	}
	
	/**
	 * gets the mark for the mark object the method is called for.
	 * @author vmjc
	 * @return returns the mark for the given Mark object.
	 */
	public int getMark() {
		return mark;
	}
	
	/**
	 * sets the mark for mark object the method is called for.
	 * @author vmjc
	 * @param mark the mark to set for the given mark object.
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	/**
	 * gets the date set for the mark object the method is called for.
	 * @author vmjc
	 * @return returns the set date for the mark the method is called for.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * registers the date for the set mark for the mark object the method is called for.
	 * @author vmjc
	 */
	public void setDate() {
		this.date = new Date();
	}
}