import { Component, OnInit } from '@angular/core';

@Component({
  selector: '[app-test3]', // to define this selector as property
  template: `
      <div> 
        Test3: Inline Template 
      </div>

      <input [id]="myId" type="text" value="Manish"> <!-- Property Binding : Here 'id' property is bind to myId-->
      <input disabled id="{{myId}}" type="text" value="Agrawal"> 

      <!-- Limitation of interpolation. It won't work with boolean and other value. Here incase of 'disable' property -->
      <input disabled=false id="{{myId}}" type="text" value="DOB"> 
      <input disabled="{{false}}" id="{{myId}}" type="text" value="Age"> 

      <!-- solution i.e property-binding-->
      <input [disabled]="isDisabled" type="text" value="College"> 
      <input bind-disabled="isDisabled" type="text" value="City"> 
  `,
  styles: [`div {
    color : green;    
  }`]
})
export class Test3Component implements OnInit {

  constructor() { }
  public myId = "testId";
  public isDisabled = true;

  ngOnInit(): void {
  }

}
