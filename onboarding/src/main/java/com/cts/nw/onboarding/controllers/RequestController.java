/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	/**
	 * Index Method redirects to Resources List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:request/list";
	}

	/**
	 * List the resources available in Database.
	 * @param resource
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getResource(@ModelAttribute("resources") ResourceDetail resource,
			ModelMap model) {
		model.addAttribute("resources", resourceRequestService.findAllResources(resource));
		return "list";
	}
	
	/**
	 * Displays the New Resource OnBoarding form
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView registerEmp() {
		return new ModelAndView("registerForm", "command", new ResourceDetail());
	}

	/**
	 * Save or Update the Resource
	 * @param resource
	 * @param model
	 * @return 
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addResource(@ModelAttribute("resource") ResourceDetail resource,
			ModelMap model) {
		resourceRequestService.createResource(resource);
		return "redirect:list";
	}
	
}
