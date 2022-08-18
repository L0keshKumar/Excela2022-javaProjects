package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillReference;
import com.example.demo.service.SkillReferenceService;

@RestController
@RequestMapping("/api/v1/reference")
public class SkillReferenceController {

	@Autowired
	private SkillReferenceService service;
	
	@PostMapping(path = "/add")
	public Object add(@RequestBody SkillReference entity) {
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/findall")
	public List<SkillReference> findall(){
		return this.service.findall();
	}
}
