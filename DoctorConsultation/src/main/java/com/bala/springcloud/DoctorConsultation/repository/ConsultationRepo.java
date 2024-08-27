package com.bala.springcloud.DoctorConsultation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.springcloud.DoctorConsultation.entities.Consultation;

public interface ConsultationRepo extends JpaRepository<Consultation, Integer> {
	
	public List<Consultation> findByPatientid(int patientid);
}
