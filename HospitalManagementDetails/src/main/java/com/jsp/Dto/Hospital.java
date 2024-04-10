package com.jsp.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hos_id;
	private String hName;
	private String hAddress;
	private String hCity;
	
	@OneToMany
	List<Doctor> ld;
	
	@OneToMany
	List<Patient> lp;

	public int getHos_id() {
		return hos_id;
	}

	public void setHos_id(int hos_id) {
		this.hos_id = hos_id;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethAddress() {
		return hAddress;
	}

	public void sethAddress(String hAddress) {
		this.hAddress = hAddress;
	}

	public String gethCity() {
		return hCity;
	}

	public void sethCity(String hCity) {
		this.hCity = hCity;
	}

	public List<Doctor> getLd() {
		return ld;
	}

	public void setLd(List<Doctor> ld) {
		this.ld = ld;
	}

	public List<Patient> getLp() {
		return lp;
	}

	public void setLp(List<Patient> lp) {
		this.lp = lp;
	}
	
	
}
