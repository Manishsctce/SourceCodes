import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidepanel',
  templateUrl: './sidepanel.component.html',
  styleUrls: ['./sidepanel.component.css']
})
export class SidepanelComponent implements OnInit {

  companys:String[] =["Infosys","Wipro", "TCS", "Persistence"];
  constructor() { }

  ngOnInit(): void {
  }

}
