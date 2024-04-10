package com.jsp.Controller;

import com.jsp.Dao.HospitalDao;
import com.jsp.Dto.Hospital;

public class HospitalContoller 
{
	
	HospitalDao hd=new HospitalDao();
	

	public void createHospital(Hospital h)
	{
		hd.createHospital(h);
		
	}
	public void updateHospitalNamel(int id,String name)
	{
		hd.updateHospitalName(id, name);
	}

	public void removeHospitall(int id)
	{
		hd.removeHospital(id);
	}
	
	public void displayHospitalDetailsByName(String name)
	{
		hd.displayHospitalDetails(name);
	}
	
	public void displayAllHospitals()
	{
		hd.allDetails();
	}
}
