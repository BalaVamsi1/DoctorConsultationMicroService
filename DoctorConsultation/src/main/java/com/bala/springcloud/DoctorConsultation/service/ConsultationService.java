package com.bala.springcloud.DoctorConsultation.service;

import java.util.List;

import com.bala.springcloud.DoctorConsultation.entities.Consultation;

public interface ConsultationService {
	public Consultation saveConsultation(Consultation consultation);
	public Consultation updateConsultation(Consultation consultation);
	public void deleteConsultation(Consultation consultation);
	public Consultation findById(int id);
	public List<Consultation> findAll();
	public List<Consultation> findByPatientid(int patientid);
}
