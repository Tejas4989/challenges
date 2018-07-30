import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TimeAvailabilityPillComponent } from './time-availability-pill/time-availability-pill.component';
import { NetworthCalculatorComponent } from './networth-calculator/networth-calculator.component';
import { AppRoutingModule } from './app.routing.module';
import { NetWorthCalculatorService } from './networth-calculator/networth-calculator.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    TimeAvailabilityPillComponent,
    NetworthCalculatorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [NetWorthCalculatorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
