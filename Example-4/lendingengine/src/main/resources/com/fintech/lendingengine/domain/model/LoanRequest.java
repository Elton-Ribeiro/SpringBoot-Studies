package com.fintech.lendingengine.domain.model;

import java.time.Duration;
import java.util.Objects;

public class LoanRequest {

	private int amount;	
	private User borrower;
	private Duration repaymentTerms;
	private double interestRate;
	
	public LoanRequest(int amount, User borrower, Duration repaymentTerms, double interestRate) {
		super();
		this.amount = amount;
		this.borrower = borrower;
		this.repaymentTerms = repaymentTerms;
		this.interestRate = interestRate;
	}

	public int getAmount() {
		return amount;
	}

	public User getBorrower() {
		return borrower;
	}

	public Duration getRepaymentTerms() {
		return repaymentTerms;
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, borrower, interestRate, repaymentTerms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanRequest other = (LoanRequest) obj;
		return amount == other.amount && Objects.equals(borrower, other.borrower)
				&& Double.doubleToLongBits(interestRate) == Double.doubleToLongBits(other.interestRate)
				&& Objects.equals(repaymentTerms, other.repaymentTerms);
	}

	@Override
	public String toString() {
		return "LoanRequest [amount=" + amount + ", borrower=" + borrower + ", repaymentTerms=" + repaymentTerms
				+ ", interestRate=" + interestRate + "]";
	}
		
}
