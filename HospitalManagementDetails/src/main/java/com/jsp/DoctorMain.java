package com.jsp;

import java.util.Scanner;
import com.jsp.Controller.DoctorController;
import com.jsp.Dto.Doctor;

public class DoctorMain 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Doctor d=new Doctor();
		
		DoctorController dc=new DoctorController();
		boolean b=true;
		while(b)
		{
		System.out.println("Enter 1 for create Doctor \nEnter 2 for Removing Doctor \nEnter 3 for update Doctor Name \nEnter 4 for display Doctor details by name \nEnter 5 for display all Doctor details \nEnter 6 stop the loop");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter id for checking hospital is present or not");
			int id=sc.nextInt();
			d.setdName("pooja");
			d.setQualification("MBBS FRCS");
			d.setSalary(60000);
			dc.createDoctor(id, d);
			break;
		}
		case 2:
		{
			dc.removeDoctor(d);
			break;
		}
		case 3:
		{
			System.out.println("Enter doctor id to find the doctor");
			int doc_id=sc.nextInt();
			System.out.println("Enter salary to update doctor salary");
			double doc_sal=sc.nextDouble();
			dc.updateDoctorSalary(doc_sal, doc_id);
			break;
		}
		case 4:
		{
			System.out.println("Enter Doctor name to display the Doctor");
			String doc_name=sc.next();
			
			dc.displayDoctorDetails(doc_name);
			break;
		}
		case 5:
		{
			System.out.println("Enter id for hospital is present or not");
			int id=sc.nextInt();
			dc.displayAllDoctorDetails(id);
			break;
		}
		case 6:
		{
			b=false;
			break;
		}
		default:
		{
			System.out.println("invalid case");
		}
		}
		}
	}
}
