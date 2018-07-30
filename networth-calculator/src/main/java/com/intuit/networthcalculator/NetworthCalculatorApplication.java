package com.intuit.networthcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intuit.networthcalculator.model.Assets;
import com.intuit.networthcalculator.model.CashAndInvestmentAssets;
import com.intuit.networthcalculator.model.Liabilities;
import com.intuit.networthcalculator.model.LongTermAssets;
import com.intuit.networthcalculator.model.LongTermDebt;
import com.intuit.networthcalculator.model.NetWorth;
import com.intuit.networthcalculator.model.ShortTermLiabilities;

@SpringBootApplication
public class NetworthCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworthCalculatorApplication.class, args);
		ObjectMapper mapper = new ObjectMapper();
		
		Assets assets = new Assets();
		assets.setCashAndInvestmentAssets(new CashAndInvestmentAssets());
		assets.setLongTermAssets(new LongTermAssets());
		
		Liabilities liabilities = new Liabilities();
		liabilities.setLongTermDebts(new LongTermDebt());
		liabilities.setShortTermLiabilities(new ShortTermLiabilities());
		
		NetWorth netWorth = new NetWorth();
		netWorth.setAssets(assets);
		netWorth.setLiabilities(liabilities);
		try {
			String json = mapper.writeValueAsString(netWorth);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
