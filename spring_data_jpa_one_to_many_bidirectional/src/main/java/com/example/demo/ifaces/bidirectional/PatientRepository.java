package com.example.demo.ifaces.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirectional.*;
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
