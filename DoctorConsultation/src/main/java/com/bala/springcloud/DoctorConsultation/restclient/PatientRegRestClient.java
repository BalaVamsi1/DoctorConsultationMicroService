package com.bala.springcloud.DoctorConsultation.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bala.springcloud.DoctorConsultation.DTO.Patient;


@FeignClient("api-gateway-service")
public interface PatientRegRestClient {
	

	@GetMapping("/patientregapp/patient/{id}")
	 Patient getPatient(@PathVariable("id") int id);
}