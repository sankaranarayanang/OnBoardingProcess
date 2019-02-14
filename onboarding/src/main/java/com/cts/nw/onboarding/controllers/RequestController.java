/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.service.RequesterService;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/")
public class RequestController {

	@Autowired
	RequesterService resourceRequestService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		return "welcome";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerEmp() {
		return new ModelAndView("registerForm", "command", new ResourceDetail());
	}

	@RequestMapping(value = "/addResource", method = RequestMethod.POST)
	public void addResource(@ModelAttribute("resource") ResourceDetail resource,
			ModelMap model) {
		resourceRequestService.createResource(resource);
	}
	
	@RequestMapping(value = "/getResources", method = RequestMethod.GET)
	public ModelAndView getResource(@ModelAttribute("resource") ResourceDetail resource,
			ModelMap model) {

		List<ResourceDetail> resourceList = resourceRequestService.findAllResources(resource);
		ModelAndView mv = new ModelAndView("result");
		model.addAllAttributes(resourceList);
		return mv;
		
	}
}
