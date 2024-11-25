package com.kingsmen.kingsreach.service;

import org.springframework.http.ResponseEntity;

import com.kingsmen.kingsreach.entity.Leave;
import com.kingsmen.kingsreach.util.ResponseStructure;

public interface LeaveService {

	ResponseEntity<ResponseStructure<Leave>> applyLeave(Leave leave);

	ResponseEntity<ResponseStructure<Leave>> changeLeaveStatus(Leave leave);

}
