package com.jsp.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Dto.Hospital;
import com.jsp.Dto.Patient;

public class PatientDao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("naveen");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void createPatient(int id,Patient p)
	{
		Hospital h=em.find(Hospital.class, id);
		if(h!=null)
		{
			List<Patient> lp=new ArrayList<Patient>();
			lp.add(p);
			et.begin();
			h.setLp(lp);
			p.setH(h);
			em.persist(p);
			et.commit();
			System.err.println("successfully stored the patient");
		}
		else
		{
			System.err.println("hospital not found");
		}
	}
	
	public void removePatient(Patient p)
	{
		et.begin();
		em.remove(p);
		et.commit();
	}

	public void viewPatientDetailsByName(String name)
	{
		Query q=em.createQuery("select p from Patient p where pName=?1");
		q.setParameter(1, name);
		
		List<Patient> lp=q.getResultList();
		
		for(Patient p:lp)
		{
			System.err.println(p.getPat_id()+" "+p.getpName()+" "+p.getpDiagonsis()+" "+p.getpAddress());
		}
	}
	
	public void patientAllDetails()
	{
		Query q=em.createQuery("select p from Patient p");
		List<Patient> lp=q.getResultList();
		
		for(Patient p:lp)
		{
			System.err.println(p.getPat_id()+" "+p.getpName()+" "+p.getpDiagonsis()+" "+p.getpAddress());
		}
		
	}
}
