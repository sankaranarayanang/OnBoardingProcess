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
import com.cts.nw.onboarding.serviceImpl.RequesterServiceImpl;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/list")
public class ListController {
	@Autowired
	RequesterServiceImpl resourceRequestService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getResource(@ModelAttribute("resource") ResourceDetail resource,
			ModelMap model) {

		List<ResourceDetail> resourceList = resourceRequestService.findAllResources(resource);
		System.out.println("In List:" + resourceList.size());
		for(ResourceDetail rd : resourceList){
			System.out.println("Name:" + rd.getEmpFullName());
		}
		System.out.println("List Completed");
		ModelAndView mv = new ModelAndView("resourceList");
		model.addAllAttributes(resourceList);
		return mv;
		
	}
	
}
