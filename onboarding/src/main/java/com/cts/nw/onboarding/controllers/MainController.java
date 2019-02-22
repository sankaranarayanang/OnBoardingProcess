/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.nw.onboarding.service.MailService;
import com.cts.nw.onboarding.serviceImpl.MailServiceImpl;
import com.cts.nw.onboarding.util.Employee;
import com.cts.nw.onboarding.util.LDAPUtil;

/**
 * @author 656579
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView homePage(ModelMap model) {
		String userName = System.getProperty("user.name");
		Employee employee = new LDAPUtil().getEmployee("sAMAccountName", userName);
		
		ModelAndView
		modelAndView = null;
		
		modelAndView = new ModelAndView("homePage");
		modelAndView.addObject("user",employee.getName());
		return modelAndView;
	}
	
	@RequestMapping(value = "/sendemail", method = RequestMethod.GET)
	public ModelAndView sendEmail(ModelMap model) {
		ModelAndView modelAndView = null;
		MailService mail = new MailServiceImpl();
		mail.sendEmail("Email From App sent successfully...");
		modelAndView = new ModelAndView("sendemail");
		return modelAndView;
	}
}
