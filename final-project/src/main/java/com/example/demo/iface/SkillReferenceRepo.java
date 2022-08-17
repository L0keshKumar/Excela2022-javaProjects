package com.example.demo.iface;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.SkillReference;

public interface SkillReferenceRepo extends JpaRepository<SkillReference, Integer>{

	//@Query(value = "from SkillReference skillName=:name")
	Optional<SkillReference> findBySkillName(String name);
}
