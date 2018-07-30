package com.intuit.networthcalculator.model;

public class NetWorth {

	private float netWorth;
	private Assets assets;
	private Liabilities liabilities;

	public float getNetWorth() {
		netWorth = getAssets().getTotalAssets() - getLiabilities().getTotalLiabilities();
		return netWorth;
	}

	public void setNetWorth(float netWorth) {
		this.netWorth = netWorth;
	}

	public Assets getAssets() {
		return assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Liabilities getLiabilities() {
		return liabilities;
	}

	public void setLiabilities(Liabilities liabilities) {
		this.liabilities = liabilities;
	}

}
