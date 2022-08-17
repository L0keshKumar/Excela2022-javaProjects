package com.example.demo.iface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.*;

public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkill, String> {

	public List<EmployeeSkill> findByApprovedBy(String aprBy);
	public List<EmployeeSkill> findBySkillExperience(int experience);
	public List<EmployeeSkill> findBySkillName(String skill);
	public List<EmployeeSkill> findByStatus(String status);
	@Query(nativeQuery = true,value = "from EmployeeSkill where skillName=:skill and skillExperience=:experience")
	public List<EmployeeSkill> getByNameAndExperience(@Param("skill")String skill,@Param("experience")int experience);
	
	

}
