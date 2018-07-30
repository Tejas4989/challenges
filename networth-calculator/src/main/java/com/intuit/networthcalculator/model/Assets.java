package com.intuit.networthcalculator.model;

public class Assets {

	private float totalAssets;

	private CashAndInvestmentAssets cashAndInvestmentAssets;
	private LongTermAssets longTermAssets;

	public float getTotalAssets() {
		totalAssets = getCashAndInvestmentAssets().getTotalCashAndInvestmentAssets()
				+ getLongTermAssets().getTotalLongTermAssets();
		return totalAssets;
	}

	public void setTotalAssets(float totalAssets) {
		this.totalAssets = totalAssets;
	}

	public CashAndInvestmentAssets getCashAndInvestmentAssets() {
		return cashAndInvestmentAssets;
	}

	public void setCashAndInvestmentAssets(CashAndInvestmentAssets cashAndInvestmentAssets) {
		this.cashAndInvestmentAssets = cashAndInvestmentAssets;
	}

	public LongTermAssets getLongTermAssets() {
		return longTermAssets;
	}

	public void setLongTermAssets(LongTermAssets longTermAssets) {
		this.longTermAssets = longTermAssets;
	}

}
