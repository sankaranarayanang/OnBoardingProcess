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
import com.cts.nw.onboarding.serviceImpl.ResourceServiceImpl;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	ResourceServiceImpl resourceService;

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
		model.addAttribute("resources", resourceService.findAllResources(resource));
		return "requestList";
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
		model.addAttribute("resource", resourceService.findResource(resource, id));
		return "resourceShow";

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
		return new ModelAndView("requestUpdate", "command", resourceService.findResource(resource, id));
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
		resourceService.updateResource(resource);
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
		resourceService.deleteResource(resource,id);
		return "redirect:/request/list";
	}
	
	/**
	 * Displays the New Resource OnBoarding form
	 * 
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		return new ModelAndView("resourceRegister", "command", new ResourceDetail());
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
		resourceService.createResource(resource);
		return "redirect:list";
	}

}
