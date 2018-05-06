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

	@RequestMapping("/Agronomics")
	public String agronomics() {
		return "Agronomics";
	}

//	@RequestMapping("/SeedPricing")
//	public String seedPricing() {
//		return "SeedPricing";
//	}

	@RequestMapping("/HerbicideUsage")
	public String herbicideUsage() {
		return "HerbicideUsage";
	}

	@RequestMapping("/Videos")
	public String videos() {
		return "Videos";
	}

	@RequestMapping("/ContactUs")
	public String contactUs() {
		return "ContactUs";
	}

	@RequestMapping("/Guestbook")
	public String geustbook() {
		return "Guestbook";
	}

}