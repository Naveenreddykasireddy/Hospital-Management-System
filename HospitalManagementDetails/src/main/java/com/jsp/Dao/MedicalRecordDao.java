package com.jsp.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Dto.MedicalRecord;
import com.jsp.Dto.Patient;

public class MedicalRecordDao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("naveen");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void createMedicalRecord(int id,MedicalRecord mr)
	{
		Patient p=em.find(Patient.class, id);
		if(p!=null)
		{
			List<MedicalRecord> lmr=new ArrayList<MedicalRecord>();
			lmr.add(mr);
			et.begin();
			p.setLm(lmr);
			mr.setP(p);
			em.persist(mr);
			et.commit();
			System.err.println("successfully stored the medicalRecord");
		}
		else
		{
			System.err.println("patient not found");
		}
	}
	
	public void removePatient(MedicalRecord mr)
	{
		et.begin();
		em.remove(mr);
		et.commit();
		System.err.println("Successfully removed medical record");
	}
	
	public void updateMedicalRecordDateOfExamination(int id,String DateOfExamination)
	{
		MedicalRecord mr=em.find(MedicalRecord.class, id);
		if(mr!=null)
		{
			et.begin();
			mr.setDateOfExamination(DateOfExamination);
			em.merge(mr);
			et.commit();
			System.err.println("successfully updated Date Of Examination");
		}
		else
		{
			System.err.println("id not found");
		}
	}
	
	public void viewMedicalRecordsOfParticularPatient(int pid)
	{
		Patient p=em.find(Patient.class, pid);
		
		if(p!=null)
		{
			List<MedicalRecord> lp=p.getLm();
			for(MedicalRecord m:lp)
			{
				System.err.println(m.getP().getpName()+" "+m.getpRecord_id()+" "+m.getProblem()+" "+m.getDateOfExamination());
			}
			
		}
		
	}
}
