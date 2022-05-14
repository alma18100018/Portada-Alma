package com.Alma.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/demo/")
	public String portada()
	{
		return "demo/portada";
	}
}
