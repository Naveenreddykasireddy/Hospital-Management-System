package com.jsp.Controller;

import com.jsp.Dao.MedicalRecordDao;
import com.jsp.Dto.MedicalRecord;
public class MedicalRecordController 
{
	MedicalRecordDao mrd=new MedicalRecordDao();
	
	public void createMedical(int id,MedicalRecord mr)
	{
		mrd.createMedicalRecord(id, mr);
	}
	
	public void deleteMedicalRecord(MedicalRecord mr)
	{
		mrd.removePatient(mr);
	}
	
	public void updateMedicalRecord(int id,String DateOfExamination)
	{
		mrd.updateMedicalRecordDateOfExamination(id, DateOfExamination);
	}
	
	public void viewMedicalRecord(int id)
	{
		mrd.viewMedicalRecordsOfParticularPatient(id);
	}

}
