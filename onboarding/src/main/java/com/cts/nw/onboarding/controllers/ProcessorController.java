/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.bo.ResourceDetail;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/approve")
public class ProcessorController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registerEmp() {
		return new ModelAndView("process", "command", new ResourceDetail());
	}
	
}
