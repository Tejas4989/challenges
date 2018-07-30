package com.intuit.networthcalculator.model;

public class LongTermAssets {

	private float primaryHome;
	private float secondHome;
	private float other;

	public float getPrimaryHome() {
		return primaryHome;
	}

	public void setPrimaryHome(float primaryHome) {
		this.primaryHome = primaryHome;
	}

	public float getSecondHome() {
		return secondHome;
	}

	public void setSecondHome(float secondHome) {
		this.secondHome = secondHome;
	}

	public float getOther() {
		return other;
	}

	public void setOther(float other) {
		this.other = other;
	}

	public float getTotalLongTermAssets() {
		return (getOther() + getPrimaryHome() + getSecondHome());
	}

}
