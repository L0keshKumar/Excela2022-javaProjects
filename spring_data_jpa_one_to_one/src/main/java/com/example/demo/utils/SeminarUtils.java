package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {

	@Autowired
	Seminar sem;
	
	@Autowired
	SeminarRepository repo;
	
	@Autowired
	Speaker spkr;
	
	public void create() {
		sem.setSpeaker(spkr);
		Seminar added=repo.save(sem);
		if(added!=null) {
			System.out.println("One Record Added");
		}
	}
	public void findAll() {
		System.out.println(sem);
	}
}
