package com.example.demo.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping(path = "/api/v1/skills")
public class EmployeeSkillController {
	
	@Autowired
	private EmployeeSkillService service;
	
	@PostMapping(path = "/add")
	public EmployeeSkill addSkill(@RequestBody EmployeeSkill entity) {
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/findall")
	public List<EmployeeSkill> getAllSkills(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/approve/{name}")
	public List<EmployeeSkill> findByApprove(@PathVariable("name") String approve) {
		return this.service.findByApprovedBy(approve);
	}
	
	@GetMapping(path = "/status/{status}")
	public List<EmployeeSkill> findSkillStatus(@PathVariable("status") String status) {
		return this.service.findByStatus(status);
	}
	
	@GetMapping(path = "/skill/{skill}")
	public List<EmployeeSkill> findSkillBySkillName(@PathVariable("skill") String skill) {
		return this.service.findBySkillName(skill);
	}
	
	@GetMapping(path = "/experience/{experience}")
	public List<EmployeeSkill> findSkillsByApprove(@PathVariable("name") int experience) {
		return this.service.findByExperience(experience);
	}
	
	@GetMapping(path = "/skills/{skill}/{experience}")
	public List<EmployeeSkill> findEmpBySkillAndExp(@PathVariable("skill")String skill,@PathVariable("experience")int experience){
		return this.service.findBySkillNameAndExperience(skill, experience);
	}
	
	
}
