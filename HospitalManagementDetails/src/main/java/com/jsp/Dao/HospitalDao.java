package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Dto.Hospital;

public class HospitalDao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("naveen");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	public void createHospital(Hospital h)
	{
		if(h!=null)
		{
		et.begin();
		h.sethName("Government Hospital");
		h.sethAddress("ramnagar");
		h.sethCity("Ananthapur");
		em.persist(h);
		et.commit();
		}
		else
		{
			System.err.println("hospital is not there");
		}
	}
	
	public void updateHospitalName(int id,String name)
	{
		Hospital q=em.find(Hospital.class, id);
		if(q!=null)
		{
			et.begin();
			q.sethName(name);
			em.merge(q);
			et.commit();
			System.err.println("successfully updated hospital name");
		}
		else
		{
			System.err.println("id not found");
		}
	}
	
	public void removeHospital(int id)
	{
		Hospital h=em.find(Hospital.class, id);
		if(h!=null)
		{
			et.begin();
			em.remove(h);
			et.commit();
			System.err.println("successfully removed");
		}
		else
		{
			System.err.println("id not found");
			
		}
	}
	
	public void displayHospitalDetails(String name)
	{
		
		Query q=em.createQuery("select h from Hospital h where h.hName=?1");
		q.setParameter(1, name);
			if(q!=null)
			{
			List<Hospital> lh=q.getResultList();
			for(Hospital h:lh)
			{
				System.err.println(h.getHos_id()+" "+h.gethName()+" "+h.gethAddress()+" "+h.gethCity());
			}
			}
			else
			{
				System.out.println("Invalid details");
			}
	}
	
	public void allDetails()
	{
		Query q=em.createQuery("select h from Hospital h");
		List<Hospital> lh=q.getResultList();
		for(Hospital h:lh)
		{
		System.err.println(h.getHos_id()+" "+h.gethName()+" "+h.gethAddress()+" "+h.gethCity());
		}
	}
}
