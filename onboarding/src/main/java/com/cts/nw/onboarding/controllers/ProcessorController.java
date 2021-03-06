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
import com.cts.nw.onboarding.service.ProcessService;
import com.cts.nw.onboarding.util.Employee;
import com.cts.nw.onboarding.util.LDAPUtil;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/process")
public class ProcessorController extends AbstractController{
	
	@Autowired
	ProcessService processService;

	/**
	 * Index Method redirects to Resources List Page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:process/list";
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
		String processor = System.getProperty("user.name");
		Employee employee = new LDAPUtil().getEmployee("sAMAccountName", processor);
		model.addAttribute("resources", processService.findAllResources(resource,employee.getName()) );
		return "processList";
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
		model.addAttribute("resource", processService.findResource(resource, id));
		return "resourceShow";

	}

	/**
	 * Displays the Update Form.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/approve/{id}", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@ModelAttribute("resource") ResourceDetail resource, @PathVariable("id") int id,
			Model model) {
		return new ModelAndView("processUpdate", "resource", processService.findResource(resource, id));
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
		processService.updateResource(resource);
		return "redirect:/process/list";
	}*/
	/**
	 * Updates the Resource Details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateResource(@Valid @ModelAttribute("resource") ResourceDetail resource,
			BindingResult result) {
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("processUpdate");
			return modelAndView;
		} else {
			processService.updateResource(resource);
			modelAndView = new ModelAndView("detailsSaved");
		    modelAndView.addObject("resource", processService.findResource(resource, resource.getEmpId()));
			return modelAndView;
		}
	}
	
}
