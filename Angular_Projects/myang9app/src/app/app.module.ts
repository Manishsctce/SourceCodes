import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { Test1Component } from './test1/test1.component';
import { Test2Component } from './test2/test2.component';
import { Test3Component } from './test3/test3.component';
import { ClassbindingComponent } from './classbinding/classbinding.component';
import { NgifTestComponent } from './ngif-test/ngif-test.component';
import { NgswitchTestComponent } from './ngswitch-test/ngswitch-test.component';
import { NgforTestComponent } from './ngfor-test/ngfor-test.component';
import { ComponentInteractionComponent } from './component-interaction/component-interaction.component';
import { TemplateFormsComponent } from './template-forms/template-forms.component';
import {  FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { HttpclientComponent } from './httpclient/httpclient.component';
import { RouterModule, Router, Routes } from "@angular/router";

import { appRoutes } from "./routes";
import { EmployeeComponent } from './employee/employee.component';
import { EmployeelistComponent } from './employee/employeelist.component'

@NgModule({
  declarations: [
    AppComponent,
    Test1Component,
    Test2Component,
    Test3Component,
    ClassbindingComponent,
    NgifTestComponent,
    NgswitchTestComponent,
    NgforTestComponent,
    ComponentInteractionComponent,
    TemplateFormsComponent,
    HttpclientComponent,
    EmployeeComponent,
    EmployeelistComponent 
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes, {useHash:true})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
