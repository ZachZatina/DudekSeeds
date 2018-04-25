package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Antonella Solomon
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/")
	public String registerForm() {

		return "index";
	}

}