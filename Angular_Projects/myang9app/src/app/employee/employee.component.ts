import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  template: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  
  constructor() { }

  ngOnInit(): void {
  }

}

export class Employee{
  private id:number;
  private name:String;
  private gender:String;
  private phone:number;
  private dob:Date;

  constructor(id:number, name:String, gender:String ){
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

}