package com.jlcindia.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String showIndexPage() {
		System.out.println("---------showIndexPage 1---------");
		return "index";
	}
}
