package com.intuit.networthcalculator.model;

public class CashAndInvestmentAssets {
	
	private float chequing;
	private float savingsForTaxes;
	private float rainyDayFund;
	private float savingsForFun;
	private float savingsForTravel;
	private float savingsForPD;
	private float investment1;
	private float investment2;
	private float investment3;
	private float investment4;
	private float investment5;

	public float getChequing() {
		return chequing;
	}

	public void setChequing(float chequing) {
		this.chequing = chequing;
	}

	public float getSavingsForTaxes() {
		return savingsForTaxes;
	}

	public void setSavingsForTaxes(float savingsForTaxes) {
		this.savingsForTaxes = savingsForTaxes;
	}

	public float getRainyDayFund() {
		return rainyDayFund;
	}

	public void setRainyDayFund(float rainyDayFund) {
		this.rainyDayFund = rainyDayFund;
	}

	public float getSavingsForFun() {
		return savingsForFun;
	}

	public void setSavingsForFun(float savingsForFun) {
		this.savingsForFun = savingsForFun;
	}

	public float getSavingsForTravel() {
		return savingsForTravel;
	}

	public void setSavingsForTravel(float savingsForTravel) {
		this.savingsForTravel = savingsForTravel;
	}

	public float getSavingsForPD() {
		return savingsForPD;
	}

	public void setSavingsForPD(float savingsForPD) {
		this.savingsForPD = savingsForPD;
	}

	public float getInvestment1() {
		return investment1;
	}

	public void setInvestment1(float investment1) {
		this.investment1 = investment1;
	}

	public float getInvestment2() {
		return investment2;
	}

	public void setInvestment2(float investment2) {
		this.investment2 = investment2;
	}

	public float getInvestment3() {
		return investment3;
	}

	public void setInvestment3(float investment3) {
		this.investment3 = investment3;
	}

	public float getInvestment4() {
		return investment4;
	}

	public void setInvestment4(float investment4) {
		this.investment4 = investment4;
	}

	public float getInvestment5() {
		return investment5;
	}

	public void setInvestment5(float investment5) {
		this.investment5 = investment5;
	}

	public float getTotalCashAndInvestmentAssets() {
		return (getChequing() + getInvestment1() + getInvestment2() + getInvestment3() + getInvestment4()
				+ getInvestment5() + getSavingsForFun() + getSavingsForPD() + getSavingsForTaxes()
				+ getSavingsForTravel() + getRainyDayFund());
	}

}
