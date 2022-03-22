package com.fintech.lendingengine.application;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.lendingengine.domain.model.LoanRequest;

@RestController
public class LoanController {

	@PostMapping(value = "/loan/request")
	public void requestLoan(@RequestBody final LoanRequest loanRequest) {
		System.out.println(loanRequest);
	}

	
}
