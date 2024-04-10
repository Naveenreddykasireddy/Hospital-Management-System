package com.jsp;

import java.util.Scanner;

import com.jsp.Controller.HospitalContoller;
import com.jsp.Dto.Hospital;

public class HospitalMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Hospital h=new Hospital();
		HospitalContoller hc=new HospitalContoller();
		
		boolean b=true;
		while(b)
		{
		System.out.println("Enter 1 for create hospital \nEnter 2 for Removing hospital \nEnter 3 for update Hospital Name \nEnter 4 for display details by name \nEnter 5 for display all hospital details\nEnter 6 for stop the loop");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
//			h.sethName("Government Hospital");
//			h.sethAddress("ramnagar");
//			h.sethCity("Ananthapur");	
			hc.createHospital(h);
			break;
		}
		case 2:
		{
			System.out.println("Enter hospital id to remove hospital");
			int id=sc.nextInt();
			hc.removeHospitall(id);
			break;
		}
		case 3:
		{
			System.out.println("Enter Hospital id to find the hospital");
			int hos_id=sc.nextInt();
			System.out.println("Enter Hospital name to update hospital name");
			String name=sc.next();
			hc.updateHospitalNamel(hos_id, name);
			break;
		}
		case 4:
		{
			System.out.println("Enter Hospital name to display the hospital");
			String hos_name=sc.next();
			hc.displayHospitalDetailsByName(hos_name);
			break;
		}
		case 5:
		{
			hc.displayAllHospitals();
			break;
		}
		case 6:
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
