package com.alozta.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

	@Value("${rate}")	//make sure to get values from configuration
	String rate;
	
	@Value("${workingDays}")
	String workingDays;
	
	@Value("${workingHours}")
	String workingHours;
	
	@RequestMapping("/rateviewer")
	public String getRate(Model m) {

		m.addAttribute("rateAmount", rate);
		m.addAttribute("workingDays", workingDays);
		m.addAttribute("workingHours", workingHours);
		
		return "rateviewer";	//name of the view
	}
}
