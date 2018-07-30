import { Component, OnInit } from '@angular/core';
import { Button } from 'reactstrap';

@Component({
  selector: 'time-availability-pill',
  templateUrl: './time-availability-pill.component.html',
  styleUrls: ['./time-availability-pill.component.css']
})
export class TimeAvailabilityPillComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    // retrive the input data
    let scheduleDate = localStorage.getItem("scheduleDate");
    let startTime = localStorage.getItem("startTime");
    let duration = localStorage.getItem("duration");
  }

}
