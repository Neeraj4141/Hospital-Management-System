package com.HMSB.doclogin.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSB.doclogin.entity.Appointment;
import com.HMSB.doclogin.repository.AppointmentRepository;

@RestController
@RequestMapping("/api/v2")
public class AppointmentCTL {

	private AppointmentRepository appointmentRepository;

	public AppointmentCTL(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}

	@PostMapping("/insert")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@GetMapping
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

}
