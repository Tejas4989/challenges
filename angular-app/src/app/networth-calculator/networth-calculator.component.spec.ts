import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NetworthCalculatorComponent } from './networth-calculator.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from '../app.routing.module';
import { APP_BASE_HREF } from '@angular/common';
import { NetWorthCalculatorService } from '../networth-calculator/networth-calculator.service';
import { HttpClientModule } from '@angular/common/http';
import { NetWorthCalculatorServiceMock } from '../mocks/networth-calculator.service.mock';

describe('NetworthCalculatorComponent', () => {
  let component: NetworthCalculatorComponent;
  let fixture: ComponentFixture<NetworthCalculatorComponent>;
  let netWorthCalculatorService: NetWorthCalculatorService;
  
  
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NetworthCalculatorComponent ],
      imports: [AppRoutingModule, FormsModule, HttpClientModule],
      providers: [
        {provide: NetWorthCalculatorService, useClass: NetWorthCalculatorServiceMock},
        {provide: APP_BASE_HREF, useValue: '/'}
      ]
    }).compileComponents();
  }));
  
  beforeEach(() => {
    fixture = TestBed.createComponent(NetworthCalculatorComponent);
    component = fixture.componentInstance;
    netWorthCalculatorService = TestBed.get(NetWorthCalculatorService);
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have empty asset and liabilities object', () => {
    component.ngOnInit();
    expect(component.assetLiabilites.netWorth).toEqual(0);
  });

  it('should calculate right net worth', () => {
    component.ngOnInit();
    // set Assets and Liabilities
    component.assetLiabilites.assets.totalAssets = 1000;
    component.assetLiabilites.liabilities.totalLiabilities = 500;
    component.calculateNetWorth();
    expect(component.assetLiabilites.netWorth).toEqual(500);
  });
});
