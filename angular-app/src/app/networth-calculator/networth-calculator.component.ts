import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NetWorthCalculatorService } from './networth-calculator.service';

@Component({
  selector: 'app-networth-calculator',
  templateUrl: './networth-calculator.component.html',
  styleUrls: ['./networth-calculator.component.css']
})
export class NetworthCalculatorComponent implements OnInit {

  assetLiabilites = <any>{assets: <any>{
    cashAndInvestmentAssets: <any>{},
    longTermAssets: <any>{}
  }, liabilities: <any>{
    shortTermLiabilities: <any>{},
    longTermDebts: <any>{}
  }}

  constructor(private router: Router, private netWorthCalculatorService: NetWorthCalculatorService) { }

  ngOnInit() {
    this.netWorthCalculatorService.getAssetAndLiabilities()
    .subscribe(data => {
      console.log(data);
      this.assetLiabilites = data;
    });
  }

  calculateNetWorth(): void {
    this.netWorthCalculatorService.calculateNetWorth(this.assetLiabilites)
    .subscribe(data => {
      this.assetLiabilites = data;
    });
  }
}
