package com.intuit.networthcalculator.model;

public class Liabilities {
	
	private float totalLiabilities;
	
	private ShortTermLiabilities shortTermLiabilities;
	
	private LongTermDebt longTermDebts;

	public float getTotalLiabilities() {
		totalLiabilities = getShortTermLiabilities().getTotalShortTermLiabilities() + getLongTermDebts().getTotalLongTermDebts();
		return totalLiabilities;
	}

	public void setTotalLiabilities(float totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	public ShortTermLiabilities getShortTermLiabilities() {
		return shortTermLiabilities;
	}

	public void setShortTermLiabilities(ShortTermLiabilities shortTermLiabilities) {
		this.shortTermLiabilities = shortTermLiabilities;
	}

	public LongTermDebt getLongTermDebts() {
		return longTermDebts;
	}

	public void setLongTermDebts(LongTermDebt longTermDebts) {
		this.longTermDebts = longTermDebts;
	}
}
