/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView homePage(ModelMap model) {
		String userName = "Suresh!!!";
		ModelAndView modelAndView = null;
		
		modelAndView = new ModelAndView("homePage");
		modelAndView.addObject("user",userName);
		return modelAndView;
	}
}
