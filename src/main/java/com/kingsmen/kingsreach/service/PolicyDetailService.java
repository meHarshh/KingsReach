package com.kingsmen.kingsreach.service;

import org.springframework.http.ResponseEntity;

import com.kingsmen.kingsreach.entity.PolicyDetail;
import com.kingsmen.kingsreach.util.ResponseStructure;

public interface PolicyDetailService {

	ResponseEntity<ResponseStructure<PolicyDetail>> policyDetail(PolicyDetail detail);


	ResponseEntity<ResponseStructure<PolicyDetail>> editPolicy(String policyName, PolicyDetail policyDetail);

}
