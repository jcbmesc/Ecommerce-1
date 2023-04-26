package com.Ecomerce.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class admin {
	@GetMapping("")
	public String Home() {
		return "admin/home";
}
}
