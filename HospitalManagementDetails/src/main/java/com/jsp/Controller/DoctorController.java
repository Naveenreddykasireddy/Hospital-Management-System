package com.jsp.Controller;

import com.jsp.Dao.DoctorDao;
import com.jsp.Dto.Doctor;

public class DoctorController 
{
	DoctorDao dd=new DoctorDao();
	public void createDoctor(int id,Doctor d)
	{
		dd.createDoctor(d, id);
	}
	
	public void removeDoctor(Doctor d)
	{
		dd.removeDoctor(d);
	}
	
	public void updateDoctorSalary(double salary,int id)
	{
		dd.updateDoctorSalary(id, salary);
	}
	
	public void displayDoctorDetails(String name)
	{
		dd.displayDoctorDetails(name);
	}
	
	public void displayAllDoctorDetails(int id)
	{
		dd.displayAllDoctorDetails(id);
	}
}
