package com.jsp.Controller;

import com.jsp.Dao.PatientDao;
import com.jsp.Dto.Patient;

public class PatientController
{

	PatientDao pd=new PatientDao();
	
	public void createPatient(Patient p,int id)
	{
		pd.createPatient(id, p);
	}
	
	public void removePatient(Patient p)
	{
		pd.removePatient(p);
	}
	
	public void viewPatientDetailsByName(String name)
	{
		pd.viewPatientDetailsByName(name);
	}
	
	public void displayAllPatientDetails()
	{
		pd.patientAllDetails();
	}
}

