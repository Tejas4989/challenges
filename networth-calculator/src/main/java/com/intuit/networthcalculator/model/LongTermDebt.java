package com.intuit.networthcalculator.model;

public class LongTermDebt {

	private float mortgage1;
	private float mortgage2;
	private float loc;
	private float investmentLoan;
	private float studentLoan;
	private float carLoan;

	public float getMortgage1() {
		return mortgage1;
	}

	public void setMortgage1(float mortgage1) {
		this.mortgage1 = mortgage1;
	}

	public float getMortgage2() {
		return mortgage2;
	}

	public void setMortgage2(float mortgage2) {
		this.mortgage2 = mortgage2;
	}

	public float getLoc() {
		return loc;
	}

	public void setLoc(float loc) {
		this.loc = loc;
	}

	public float getInvestmentLoan() {
		return investmentLoan;
	}

	public void setInvestmentLoan(float investmentLoan) {
		this.investmentLoan = investmentLoan;
	}

	public float getStudentLoan() {
		return studentLoan;
	}

	public void setStudentLoan(float studentLoan) {
		this.studentLoan = studentLoan;
	}

	public float getCarLoan() {
		return carLoan;
	}

	public void setCarLoan(float carLoan) {
		this.carLoan = carLoan;
	}

	public float getTotalLongTermDebts() {
		return (getMortgage1() + getMortgage2() + getInvestmentLoan() + getLoc() + getStudentLoan() + getCarLoan());
	}

}
