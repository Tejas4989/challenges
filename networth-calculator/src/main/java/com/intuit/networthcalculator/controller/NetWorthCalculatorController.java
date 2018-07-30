package com.intuit.networthcalculator.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intuit.networthcalculator.model.Assets;
import com.intuit.networthcalculator.model.CashAndInvestmentAssets;
import com.intuit.networthcalculator.model.Liabilities;
import com.intuit.networthcalculator.model.LongTermAssets;
import com.intuit.networthcalculator.model.LongTermDebt;
import com.intuit.networthcalculator.model.NetWorth;
import com.intuit.networthcalculator.model.ShortTermLiabilities;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class NetWorthCalculatorController {
	
	@PostMapping(path="/calculate")
    public NetWorth calculate(@RequestBody String worthCalculatorPayload){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		NetWorth netWorth = null;
		try {
			netWorth = mapper.readValue(worthCalculatorPayload, NetWorth.class);
			netWorth.getAssets().getCashAndInvestmentAssets().getTotalCashAndInvestmentAssets();
			netWorth.getAssets().getLongTermAssets().getTotalLongTermAssets();
			netWorth.getLiabilities().getLongTermDebts().getTotalLongTermDebts();
			netWorth.getLiabilities().getShortTermLiabilities().getTotalShortTermLiabilities();
			netWorth.getAssets().getTotalAssets();
			netWorth.getLiabilities().getTotalLiabilities();
			netWorth.getNetWorth();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return netWorth;
    }
	
	@GetMapping(path="/get")
    public NetWorth getAssetsAndLiabilities(){
		Assets assets = new Assets();
		assets.setCashAndInvestmentAssets(new CashAndInvestmentAssets());
		assets.setLongTermAssets(new LongTermAssets());
		
		Liabilities liabilities = new Liabilities();
		liabilities.setLongTermDebts(new LongTermDebt());
		liabilities.setShortTermLiabilities(new ShortTermLiabilities());
		
		NetWorth netWorth = new NetWorth();
		netWorth.setAssets(assets);
		netWorth.setLiabilities(liabilities);
        return netWorth;
    }

}
