package com.kingsmen.kingsreach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kingsmen.kingsreach.entity.TerminationDetail;
import com.kingsmen.kingsreach.service.TerminationDetailService;
import com.kingsmen.kingsreach.util.ResponseStructure;

@RestController
public class TerminationDetailController {

	@Autowired
	private TerminationDetailService terminationDetailService;

	@PostMapping(value = "/terminationDetail")
	private ResponseEntity<ResponseStructure<TerminationDetail>> terminationDetail(@RequestBody TerminationDetail detail) {
		return terminationDetailService.terminationDetail(detail);
	}

	@PutMapping(value = "/editTerminationDetail")
	public ResponseEntity<ResponseStructure<TerminationDetail>> editTermination(@RequestBody TerminationDetail terminationdetail) {
		return terminationDetailService.editTermination(terminationdetail);
	}

	@DeleteMapping(value = "/deleteTerminationDetail")
	public ResponseEntity<ResponseStructure<TerminationDetail>> deleteTermination(@RequestParam String employeeId){
		return terminationDetailService.deleteTermination(employeeId);
	}

}
