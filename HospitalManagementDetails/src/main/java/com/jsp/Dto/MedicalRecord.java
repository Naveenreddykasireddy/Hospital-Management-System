package com.jsp.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class MedicalRecord
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pRecord_id;
	private String problem;
	private String dateOfExamination;
	
	
	@ManyToOne
	Patient p;


	public int getpRecord_id() {
		return pRecord_id;
	}


	public void setpRecord_id(int pRecord_id) {
		this.pRecord_id = pRecord_id;
	}


	public String getProblem() {
		return problem;
	}


	public void setProblem(String problem) {
		this.problem = problem;
	}


	public String getDateOfExamination() {
		return dateOfExamination;
	}


	public void setDateOfExamination(String dateOfExamination) {
		this.dateOfExamination = dateOfExamination;
	}


	public Patient getP() {
		return p;
	}


	public void setP(Patient p) {
		this.p = p;
	}
	
	
	
	
}