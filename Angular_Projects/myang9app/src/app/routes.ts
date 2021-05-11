import { Routes } from "@angular/router";
import { HttpclientComponent } from './httpclient/httpclient.component';
import { Test1Component } from './test1/test1.component';


export const appRoutes:Routes = [
    {path:'httpclient', component:HttpclientComponent},
    {path:'test1',component:Test1Component}
  ];