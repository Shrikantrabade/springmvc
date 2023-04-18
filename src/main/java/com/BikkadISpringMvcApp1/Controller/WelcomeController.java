package com.BikkadISpringMvcApp1.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {
@GetMapping("/welcomeMessage")
	public String welcome(Model model) {
		
		String welMsg="welcome to Bikkad It";
		model.addAttribute("msg", welMsg);
		return "wel";
		
	}
	
	
}
