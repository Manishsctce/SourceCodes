import { Component, OnInit } from '@angular/core';
import { Employee } from './employee.component';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employee.component.html',
  styles: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employeeList:Employee[] = [
    new Employee(1,"Manish","M"),
    new Employee(2,"Gaurav","M")
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
