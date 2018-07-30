package com.intuit.networthcalculator.dynamicmodel;

import java.util.ArrayList;
import java.util.List;

public class CashAndInvestmentAssets {

	private List<AssetLiabilityItem> items;

	public List<AssetLiabilityItem> getItems() {
		if (items == null) {
			items = new ArrayList<AssetLiabilityItem>();
		}
		return items;
	}

	public void setItems(List<AssetLiabilityItem> items) {
		this.items = items;
	}

	public float getTotalCashAndInvestmentAssets() {
		float totalValues = 0.0f;
		for (AssetLiabilityItem assetLiabilityItem : getItems()) {
			totalValues += assetLiabilityItem.getValue();
		}
		return totalValues;
	}

}
