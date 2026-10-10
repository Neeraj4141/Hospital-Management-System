package com.HMSB.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMSB.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
