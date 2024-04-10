package com.jsp.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pat_id;
	private String pName;
	private String pDiagonsis;
	private String pAddress;
	
	@ManyToOne
	Hospital h;
	
	@OneToMany
	List<MedicalRecord> lm;

	public int getPat_id() {
		return pat_id;
	}

	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDiagonsis() {
		return pDiagonsis;
	}

	public void setpDiagonsis(String pDiagonsis) {
		this.pDiagonsis = pDiagonsis;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public Hospital getH() {
		return h;
	}

	public void setH(Hospital h) {
		this.h = h;
	}

	public List<MedicalRecord> getLm() {
		return lm;
	}

	public void setLm(List<MedicalRecord> lm) {
		this.lm = lm;
	}
	
	

}
