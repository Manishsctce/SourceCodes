import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-template-forms',
  templateUrl: './template-forms.component.html',
  styleUrls: ['./template-forms.component.css']
})
export class TemplateFormsComponent implements OnInit {

  @ViewChild('contactForm') contactForm:NgForm
  constructor() { }

  ngOnInit(): void {
  }

  contact = {
    firstname : "Sachin",
    lastname: "Tendulkar",
      email: "sachin@gmail.com",
      gender: "male",
      isMarried: true,
      address: { 
        address: "Perry Cross Rd, Mumbai, 400050", 
        state: "Maharashtra", 
        country: "2" 
      }
  };

  title = 'Template driven forms';
 
  stateList:string[] =["Maharashtra", "Assam", "Bihar", "Rajasthan", "WestBengal"];
  countryList:country[] = [
    new country("1", "India"),
    new country('2', 'USA'),
    new country('3', 'England')
  ];

  onSubmit(contactForm : NgForm){
   console.log(contactForm)
  }

  resetForm(contactForm : NgForm){
    contactForm.resetForm;
    console.log(contactForm)
  }

  setDefaults() {
    this.contactForm.setValue(this.contact);
  }
 
  changeCountry() {
    this.contactForm.controls["country"].setValue("1");
  }
 
  patchValue() {
    let obj = {
      firstname: "Rahul",
      lastname: "Dravid",
      email: "rahul@gmail.com",
    };
 
    this.contactForm.control.patchValue(obj);
 
  }
 
  changeAddress() {
    let obj = {
      city: "Bangalore",
      street: "Brigade Road",
      pincode: "600100"
    };
    let address= this.contactForm.controls["address"] as FormGroup
    address.patchValue(obj);
 
  }
 
  reset() {
    this.contactForm.reset();
  }
}

export class country {
  id:string;
  name:string;
 
  constructor(id:string, name:string) {
    this.id=id;
    this.name=name;
  }
}

