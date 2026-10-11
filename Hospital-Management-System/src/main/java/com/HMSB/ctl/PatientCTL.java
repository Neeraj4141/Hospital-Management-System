package com.HMSB.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSB.entity.Patient;
import com.HMSB.repositery.PatientRepository;

@RestController
@RequestMapping("/api/v1")
public class PatientCTL {

	PatientRepository patientRepository;

	public PatientCTL(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	@PostMapping("/insert")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	
	@GetMapping
	public List<Patient>getAllParient(){
		return patientRepository.findAll();
	}

}
