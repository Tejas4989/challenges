import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { APP_BASE_HREF } from '@angular/common';

import { TimeAvailabilityPillComponent } from './time-availability-pill/time-availability-pill.component';
import { NetworthCalculatorComponent } from './networth-calculator/networth-calculator.component';
import { AppRoutingModule } from './app.routing.module';


describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        TimeAvailabilityPillComponent,
        NetworthCalculatorComponent
      ],
      imports: [
        AppRoutingModule,
        FormsModule
      ],
      providers: [
        {provide: APP_BASE_HREF, useValue: '/'}
      ],
    }).compileComponents();
  }));
  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
  it(`should have as title 'angular-app'`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('angular-app');
  }));
  it('should render title in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to angular-app!');
  }));
});
