package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private Product enity;
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product",method = RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Product");
		model.addAttribute("command",enity);
		return "addProduct";
		
	}
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		try {
			this.repo.add(entity);
			return "success";
		}catch(Exception e) {
			return "failure";
		}
		
		//for understanding
//		this.repo.add(entity);
//		return "addProduct";
	}
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public String findById(Model model) {
		model.addAttribute("checkifthere","Search Product");
		return "searchId";
		
	}
	@RequestMapping(value = "/find",method = RequestMethod.POST)
	public String submitFindId(@RequestParam("id")int id,Model model) {
		model.addAttribute("found",repo.findById(id));
		return "showSearchId";
		
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public String deleteById(Model model) {
		model.addAttribute("checkifthere","Delete Product");
		return "deleteId";
	}
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleteFindId(@RequestParam("id")int id,Model model) {
		model.addAttribute("delete",repo.deleteById(id));
		return "deleteForm";
		
	}
}
