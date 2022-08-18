package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SkillReference;
import com.example.demo.iface.SkillReferenceRepo;
@Service
public class SkillReferenceService {

	@Autowired
	private SkillReferenceRepo repo;
	
	public Object add(SkillReference entity) {
		Optional<SkillReference> optiona=this.repo.findBySkillName(entity.getSkillName());
		if(optiona.isPresent())
			return "Skill Name is already exist";
		return this.repo.save(entity);
		
	}
	public List<SkillReference> findall(){
		return this.repo.findAll();
	}
	
}
