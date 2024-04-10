package com.jsp;

import java.util.Scanner;

import com.jsp.Controller.MedicalRecordController;
import com.jsp.Controller.PatientController;
import com.jsp.Dto.MedicalRecord;
import com.jsp.Dto.Patient;

public class MedicalRecordMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		MedicalRecord m=new MedicalRecord();
		MedicalRecordController mrc=new MedicalRecordController();
		boolean b=true;
		while(b)
		{
		System.out.println("Enter 1 for create medical record \nEnter 2 for Removing medical record \nEnter 3 for updateMedicalRecord date of examination  \nEnter 4 for display medical record for particular patient \nEnter 5 for stop loop");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter pat_id for checking patient is present or not");
			int id=sc.nextInt();
			m.setProblem("Cardiac");
			m.setDateOfExamination("08-04-2024");
			mrc.createMedical(id, m);
			break;
		}
		case 2:
		{
			mrc.deleteMedicalRecord(m);
			break;
		}
		case 3:
		{
			System.out.println("Enter date of examination to update");
			String dateOfExamination=sc.next();
			System.out.println("Enter id for medical record is present or not");
			int m_id=sc.nextInt();
			mrc.updateMedicalRecord(m_id, dateOfExamination);
			break;
		}
		case 4:
		{
			System.out.println("Enter patient id for checking patient is present or not");
			int p_id=sc.nextInt();
			mrc.viewMedicalRecord(p_id);
			break;
		}
		case 5:
		{
			b=false;
		}
		default:
		{
			System.out.println("invalid case");
		}
		}
	}
	}
}
