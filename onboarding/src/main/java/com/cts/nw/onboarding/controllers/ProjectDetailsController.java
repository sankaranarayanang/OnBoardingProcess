/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.bo.ProjectDetail;
import com.cts.nw.onboarding.service.ProjectService;

/**
 * @author 616550
 *
 */
@Controller
@RequestMapping("/project")
public class ProjectDetailsController {

	@Autowired
	ProjectService projectService;
	
	/**
	 * Index Method redirects to Projects List Page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:project/list";
	}

	/**
	 * List the Projects available in Database.
	 * 
	 * @param resource
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listAllResources(@ModelAttribute("projects") ProjectDetail project, ModelMap model) {
		model.addAttribute("projects", projectService.findAllProjects(project));
		return "projectList";
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public @ResponseBody ProjectDetail index(@RequestParam("name") String projName,@ModelAttribute("projects") ProjectDetail project) {
		ProjectDetail projectDetail  =  projectService.findProject(project,projName);
		return projectDetail;
	}
	
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public @ResponseBody List<ProjectDetail> projNames(@ModelAttribute("projects") ProjectDetail project) {
		List<ProjectDetail> projectDetail  =  projectService.findAllProjects(project);
		return projectDetail;
	}
	
	/**
	 * Displays the Update Form.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@ModelAttribute("project") ProjectDetail project, @PathVariable("id") int id,
			Model model) {
		return new ModelAndView("projectUpdate", "project", projectService.findProjectwithID(project, id));
	}
	
	/**
	 * Updates the Resource Details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateResource(@Valid @ModelAttribute("project") ProjectDetail project,
			BindingResult result) {
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("projectUpdate");
			return modelAndView;
		} else {
			projectService.updateProject(project);
			modelAndView = new ModelAndView("projectList");
		    modelAndView.addObject("projects", projectService.findAllProjects(project));
			return modelAndView;
		}
	}
	
	/**
	 * Deletes the Resource details.
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteResource(@ModelAttribute("project") ProjectDetail project, @PathVariable("id") int id,
			Model model) {
		projectService.deleteProject(project,id);
		return "redirect:/project/list";
	}
	
	/**
	 * Displays the New Resource OnBoarding form
	 * 
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		return new ModelAndView("projectRegister", "project", new ProjectDetail());
	}

	/**
	 * Save the Resource
	 * 
	 * @param resource
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addResource(@Valid @ModelAttribute("project") ProjectDetail project,
			BindingResult result) {
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("projectUpdate");
			return modelAndView;
		} else {
			projectService.createProject(project);
			modelAndView = new ModelAndView("projectList");
		    modelAndView.addObject("projects", projectService.findAllProjects(project));
			return modelAndView;
		}
	}


	
}
