package com.kingsmen.kingsreach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingsmen.kingsreach.entity.PolicyDetail;
import com.kingsmen.kingsreach.service.PolicyDetailService;

@RestController
public class PolicyDetailController {

	@Autowired
	private PolicyDetailService policyDetailService; 
	
	@PostMapping(value = "/policyDetail")
	private PolicyDetail policyDetail(@RequestBody PolicyDetail detail) {
		return policyDetailService.policyDetail(detail);
	}
}