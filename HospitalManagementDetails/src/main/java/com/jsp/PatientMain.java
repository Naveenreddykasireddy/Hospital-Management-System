package com.jsp;

import java.util.Scanner;

import com.jsp.Controller.PatientController;
import com.jsp.Dto.Patient;

public class PatientMain
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Patient p=new Patient();
		PatientController pc=new PatientController();
		boolean b=true;
		while(b)
		{
		System.out.println("Enter 1 for create patient \nEnter 2 for Removing patient \nEnter 3 for view patients by using Name \nEnter 4 for display all patient details \nEnter 5 for stop the loop");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter id for checking hospital is present or not");
			int id=sc.nextInt();
			p.setpName("rahel");
			p.setpAddress("nandikottukuru");
			p.setpDiagonsis("card1ic");
			pc.createPatient(p, id);
			break;
		}
		case 2:
		{
			pc.removePatient(p);
			break;
		}
		case 3:
		{
			System.out.println("Enter patient name to display patients");
			String name=sc.next();
			pc.viewPatientDetailsByName(name);
			break;
		}
		case 4:
		{
			pc.displayAllPatientDetails();
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
