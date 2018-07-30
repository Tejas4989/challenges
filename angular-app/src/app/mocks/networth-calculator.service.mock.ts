import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class NetWorthCalculatorServiceMock {
  constructor() { }

  getAssetAndLiabilities(): Observable<any> {
      return Observable.of({
        netWorthLabel: 'Net Worth',
        netWorth: 0,
        assetsLabel: 'Assets',
        assets: {
            totalAssetsLabel: 'Total Assets',
            totalAssets: 0,
            cashAndInvestmentAssets: {
            chequingLabel: 'Chequing',
            chequing: 0,
            savingsForTaxesLabel: 'Savings for Taxes',
            savingsForTaxes: 0,
            rainyDayFund: 0,
            savingsForFunLabel: 'Savings for Fun',
            savingsForFun: 0,
            savingsForTravelLabel: 'Savings for Travel',
            savingsForTravel: 0,
            savingsForPDLabel: 'Savings for Personal Development',
            savingsForPD: 0,
            investment1Label: 'Investment 1',
            investment1: 0,
            investment2Label: 'Investment 2',
            investment2: 0,
            investment3Label: 'Investment 3',
            investment3: 0,
            investment4Label: 'Investment 4',
            investment4: 0,
            investment5Label: 'Investment 5',
            investment5: 0,
            totalCashAndInvestmentAssets: 0,
            rainyDayFundLabel: 'Rainy Day Fund'
            },
            longTermAssets: {
            primaryHomeLabel: 'Primary Home',
            primaryHome: 0,
            secondHomeLabel: 'Second Home',
            secondHome: 0,
            otherLabel: 'Other',
            other: 0,
            totalLongTermAssets: 0
            }
        },
        liabilitiesLabel: 'Liabilities',
        liabilities: {
            totalLiabilities: 0,
            totalLiabilitiesLabel: 'Total Liabilities',
            shortTermLiabilities: {
            creditCard1: 0,
            creditCard1Label: 'Credit Card 1',
            creditCard2: 0,
            creditCard2Label: 'Credit Card 2',
            others: 0,
            othersLabel: '(Others..)',
            totalShortTermLiabilities: 0
            },
            longTermDebts: {
            mortgage1Label: 'Mortgage 1',
            mortgage1: 0,
            mortgage2Label: 'Mortgage 2',
            mortgage2: 0,
            locLabel: 'Line of Credit',
            loc: 0,
            investmentLoanLabel: 'Investment Loan',
            investmentLoan: 0,
            studentLoanLabel: 'Student Loan',
            studentLoan: 0,
            carLoanLabel: 'Car Loan',
            carLoan: 0,
            totalLongTermDebt: 0
            }
        }
        });
  }

  calculateNetWorth(assetsAndLiabilitiesJSON): Observable<any> {
      assetsAndLiabilitiesJSON.netWorth = assetsAndLiabilitiesJSON.assets.totalAssets - assetsAndLiabilitiesJSON.liabilities.totalLiabilities;
    return Observable.of(assetsAndLiabilitiesJSON);
  }
}
