/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:request/list";
	}

	/**
	 * List the resources available in Database.
	 * 
	 * @param resource
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listAllResources(@ModelAttribute("resources") ResourceDetail resource, ModelMap model) {
		model.addAttribute("resources", resourceRequestService.findAllResources(resource));
		return "listResources";
	}

	/**
	 * Displays Single Resource.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public String showResource(@ModelAttribute("resource") ResourceDetail resource, @PathVariable("id") int id,
			Model model) {
		model.addAttribute("resource", resourceRequestService.findResource(resource, id));
		return "showResource";

	}

	/**
	 * Displays the Update Form.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@ModelAttribute("resource") ResourceDetail resource, @PathVariable("id") int id,
			Model model) {
		return new ModelAndView("updateForm", "command", resourceRequestService.findResource(resource, id));
	}
	
	/**
	 * Updates the Resource Details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateResource(@ModelAttribute("resource") ResourceDetail resource,
			Model model) {
		resourceRequestService.updateResource(resource);
		return "redirect:/request/list";
	}
	
	/**
	 * Deletes the Resource details.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteResource(@ModelAttribute("resource") ResourceDetail resource, @PathVariable("id") int id,
			Model model) {
		resourceRequestService.deleteResource(resource,id);
		return "redirect:/request/list";
	}
	
	/**
	 * Displays the New Resource OnBoarding form
	 * 
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		return new ModelAndView("registerForm", "command", new ResourceDetail());
	}

	/**
	 * Save or Update the Resource
	 * 
	 * @param resource
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addResource(@ModelAttribute("resource") ResourceDetail resource, ModelMap model) {
		resourceRequestService.createResource(resource);
		return "redirect:list";
	}

}
