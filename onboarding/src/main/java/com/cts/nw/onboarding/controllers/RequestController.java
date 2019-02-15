/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.serviceImpl.RequesterServiceImpl;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	RequesterServiceImpl resourceRequestService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registerEmp() {
		return new ModelAndView("register", "command", new ResourceDetail());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addResource(@ModelAttribute("resource") ResourceDetail resource,
			ModelMap model) {
		resourceRequestService.createResource(resource);
	}
	
}
