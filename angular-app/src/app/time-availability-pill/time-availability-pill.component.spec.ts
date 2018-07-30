import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeAvailabilityPillComponent } from './time-availability-pill.component';

describe('TimeAvailabilityPillComponent', () => {
  let component: TimeAvailabilityPillComponent;
  let fixture: ComponentFixture<TimeAvailabilityPillComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimeAvailabilityPillComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimeAvailabilityPillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
