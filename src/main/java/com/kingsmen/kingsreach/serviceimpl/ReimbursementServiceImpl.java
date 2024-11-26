package com.kingsmen.kingsreach.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsmen.kingsreach.entity.Employee;
import com.kingsmen.kingsreach.entity.Reimbursement;
import com.kingsmen.kingsreach.repo.EmployeeRepo;
import com.kingsmen.kingsreach.repo.ReimbursementRepo;
import com.kingsmen.kingsreach.service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ReimbursementRepo reimbursementRepo;
	
	@Override
	public Reimbursement reimbursement(Reimbursement reimbursement) {
		
		Optional<Employee> byEmployeeId = employeeRepo.findByEmployeeId(reimbursement.getEmployeeId());
		reimbursement.setEmployee(byEmployeeId.get());
		
		return reimbursementRepo.save(reimbursement);
	}

	
}
