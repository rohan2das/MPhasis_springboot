package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.entity.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/userform")
	public String registerForm(Model model, User user) {
		
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("/userregister")
	public String SubmitUserForm(
			@Valid 
			@ModelAttribute("user") User user, 
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "register";
		}
		return "success";
	}
}
