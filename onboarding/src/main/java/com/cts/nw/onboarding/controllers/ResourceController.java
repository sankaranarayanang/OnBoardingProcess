/**
 * 
 */
package com.cts.nw.onboarding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.nw.onboarding.util.Employee;
import com.cts.nw.onboarding.util.LDAPUtil;

/**
 * @author 616550
 *
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
    public @ResponseBody Employee index(@RequestParam("empId") String empId) {
           Employee employee = new LDAPUtil().getEmployee("sAMAccountName", empId);
           return employee;
    }

	
}
