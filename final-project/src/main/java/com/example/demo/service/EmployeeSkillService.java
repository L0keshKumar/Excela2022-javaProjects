package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeSkill;
import com.example.demo.iface.EmployeeSkillRepo;

@Service
public class EmployeeSkillService {
	
	@Autowired
	private EmployeeSkillRepo repo;
	
	public EmployeeSkill add(EmployeeSkill entity) {
		return this.repo.save(entity);
	}
	
	public List<EmployeeSkill> findAll() {
		return this.repo.findAll();
	}
	
	public List<EmployeeSkill> findByApprovedBy(String approve){
		return this.repo.findByApprovedBy(approve);
	}
	
	public List<EmployeeSkill> findByStatus(String status){
		return this.repo.findByStatus(status);
	}
	public List<EmployeeSkill> findByExperience(int exp){
		return this.repo.findBySkillExperience(exp);
	}
	public List<EmployeeSkill> findBySkillName(String skill){
		return this.repo.findBySkillName(skill);
	}
	
	public List<EmployeeSkill> findBySkillNameAndExperience(String skill, int experience) {
		return this.repo.getByNameAndExperience(skill, experience);
	}
}
