import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class NetWorthCalculatorService {

  constructor(private http: HttpClient) {}

  // private netWorthCalculatorUrl = 'http://localhost:8080/networth-calculator/api';
  private netWorthCalculatorUrl = '/api';

  public getAssetAndLiabilities() {
    return this.http.get(this.netWorthCalculatorUrl + '/get', httpOptions);
  }


  public calculateNetWorth(assetsLiabilitiesJson) {
    return this.http.post(this.netWorthCalculatorUrl + '/calculate', assetsLiabilitiesJson, httpOptions);
  }
}
