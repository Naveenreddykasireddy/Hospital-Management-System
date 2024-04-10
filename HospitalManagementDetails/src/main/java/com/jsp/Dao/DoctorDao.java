package com.jsp.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.Dto.Doctor;
import com.jsp.Dto.Hospital;

public class DoctorDao 
{

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("naveen");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public void createDoctor(Doctor d,int id)
	{
		Hospital q=em.find(Hospital.class, id);
		if(q!=null)
		{
			List<Doctor> ld=new ArrayList<Doctor>();
			ld.add(d);
			et.begin();
			q.setLd(ld);
			d.setH(q);
			em.persist(d);
			System.err.println("welcome Dr."+d.getdName()+" to "+q.gethName());
			et.commit();
		}
		else
		{
			System.err.println("hospital not found");
		}
		
	}
	
	public void updateDoctorSalary(int id,double salary)
	{
		Doctor d=em.find(Doctor.class,id);
		if(d!=null)
		{
			et.begin();
			d.setSalary(salary);
			em.merge(d);
			et.commit();
		}
		else
		{
			System.err.println("id not found");
		}
	}
	
	public void removeDoctor(Doctor d)
	{
		et.begin();
		em.remove(d);
		et.commit();
	}
	
	public void displayDoctorDetails(String name)
	{
		Query q=em.createQuery("select d from Doctor d where dName=?1");
		q.setParameter(1, name);
		List<Doctor> ld=q.getResultList();
		for(Doctor d:ld)
		{
			System.err.println(d.getDoc_id()+" "+d.getdName()+" "+d.getQualification()+" "+d.getSalary());
		
		}
	}
	
	public void displayAllDoctorDetails(int hid)
	{
		Hospital h=em.find(Hospital.class, hid);
		if(h!=null)
		{
		List<Doctor> ld=h.getLd();
		
		for(Doctor d:ld)
		{
			System.err.println(d.getDoc_id()+" "+d.getdName()+" "+d.getQualification()+" "+d.getSalary());
		}
		
	}
}
}
