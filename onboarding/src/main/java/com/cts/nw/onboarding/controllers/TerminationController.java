/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.service.TerminateService;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/terminate")
public class TerminationController extends AbstractController{
	
	@Autowired
	TerminateService terminateService;

	/**
	 * Index Method redirects to Resources List Page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:terminate/list";
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
		model.addAttribute("resources", terminateService.findAllResources(resource));
		return "terminateList";
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
		model.addAttribute("resource", terminateService.findResource(resource, id));
		return "resourceShow";

	}

	/**
	 * Displays the Update Form.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/terminate/{id}", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@ModelAttribute("resource") ResourceDetail resource, @PathVariable("id") int id,
			Model model) {
		return new ModelAndView("terminateUpdate", "resource", terminateService.findResource(resource, id));
	}
	
	/**
	 * Updates the Resource Details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	/*@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateResource(@ModelAttribute("resource") ResourceDetail resource,
			Model model) {
		terminateService.updateResource(resource);
		return "redirect:/terminate/list";
	}*/
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateResource(@Valid @ModelAttribute("resource") ResourceDetail resource,
			BindingResult result) {
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("terminateUpdate");
			return modelAndView;
		} else {
			terminateService.updateResource(resource);
			modelAndView = new ModelAndView("detailsSaved");
		    modelAndView.addObject("resource", terminateService.findResource(resource, resource.getEmpId()));
			return modelAndView;
		}
	}
}
