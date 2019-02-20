/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.nw.onboarding.bo.ProjectDetail;
import com.cts.nw.onboarding.service.ProjectService;

/**
 * @author 616550
 *
 */
@Controller
@RequestMapping("/projectdetails")
public class ProjectDetailsController {

	@Autowired
	ProjectService projectService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ProjectDetail index(@RequestParam("name") String projName,@ModelAttribute("projects") ProjectDetail project) {
		ProjectDetail projectDetail  =  projectService.findProject(project,projName);
		return projectDetail;
	}
	
}
