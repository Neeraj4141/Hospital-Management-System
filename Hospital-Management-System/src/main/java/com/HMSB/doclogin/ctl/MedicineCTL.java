package com.HMSB.doclogin.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSB.doclogin.entity.Medicine;
import com.HMSB.doclogin.repository.MedicineRepository;

@RestController
@RequestMapping("/api/v3")
public class MedicineCTL {

	private MedicineRepository medicineRepository;

	public MedicineCTL(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}

	@PostMapping("/insert")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	@GetMapping
	public List<Medicine> getAllMedicines() {
		return medicineRepository.findAll();
	}
}
