package com.bala.springcloud.DoctorConsultation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.springcloud.DoctorConsultation.DTO.Patient;
import com.bala.springcloud.DoctorConsultation.entities.Consultation;
import com.bala.springcloud.DoctorConsultation.restclient.PatientRegRestClient;
import com.bala.springcloud.DoctorConsultation.service.ConsultationService;

@RestController
@RequestMapping("/consulations")
public class ConsultationController {
	@Autowired
	private ConsultationService consultationService;
	@Autowired
	private PatientRegRestClient patientRegRestClient;
	
	@GetMapping("/{id}")
	public Consultation getConsultation(@PathVariable("id") int id) {
	Consultation consultation=consultationService.findById(id);
		return consultation;
}
	@GetMapping("/")
	public List<Consultation> findAllConsultation() {
	List<Consultation> consultations=consultationService.findAll();
		return consultations;
}
	
	@PostMapping("/")
	public Consultation saveConsultationDetails(@RequestBody Consultation consultation)
	{
		Patient patient=patientRegRestClient.getPatient(consultation.getPatientid());
		System.out.println("patient detaisl:\n" +patient);
		Consultation savedConsultation=consultationService.saveConsultation(consultation);
		return savedConsultation;
	}
	@PutMapping("/{id}")
	public Consultation updateConsultationDetails(@RequestBody Consultation Consultation) {
		Consultation updatedConsultation=consultationService.updateConsultation(Consultation);
		return updatedConsultation;
		
	}
	@DeleteMapping("/{id}")
	public void deleteMapping(@PathVariable("id") int id) {
		Consultation Consultation=consultationService.findById(id);
		consultationService.deleteConsultation(Consultation);
	}

	

}
