package com.bala.springcloud.DoctorConsultation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.springcloud.DoctorConsultation.entities.Consultation;
import com.bala.springcloud.DoctorConsultation.repository.ConsultationRepo;
@Service
public class ConsultationServiceImpl implements ConsultationService {
	@Autowired
	private ConsultationRepo consultationRepo;
	
	@Override
	public Consultation saveConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		return consultationRepo.save(consultation);
	}

	@Override
	public Consultation updateConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		return consultationRepo.save(consultation);
	}

	@Override
	public void deleteConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		consultationRepo.delete(consultation);
	}

	@Override
	public Consultation findById(int id) {
		// TODO Auto-generated method stub
		return consultationRepo.findById(id).get();
	}

	@Override
	public List<Consultation> findAll() {
		// TODO Auto-generated method stub
		return consultationRepo.findAll();
	}

	@Override
	public List<Consultation> findByPatientid(int patientid) {
		// TODO Auto-generated method stub
		return consultationRepo.findByPatientid(patientid);
	}

}
