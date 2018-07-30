package com.intuit.networthcalculator.model;

public class ShortTermLiabilities {

	private float creditCard1;

	private float creditCard2;

	private float others;

	public float getCreditCard1() {
		return creditCard1;
	}

	public void setCreditCard1(float creditCard1) {
		this.creditCard1 = creditCard1;
	}

	public float getCreditCard2() {
		return creditCard2;
	}

	public void setCreditCard2(float creditCard2) {
		this.creditCard2 = creditCard2;
	}

	public float getOthers() {
		return others;
	}

	public void setOthers(float others) {
		this.others = others;
	}

	public float getTotalShortTermLiabilities() {
		return (getCreditCard1() + getCreditCard2() + getOthers());
	}

}
