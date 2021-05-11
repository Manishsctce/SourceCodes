import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import 'rxjs/Rx';

@Component({
  selector: 'app-httpclient',
  templateUrl: './httpclient.component.html',
  styles: ['']
})
export class HttpclientComponent implements OnInit {

  userName: string = "tektutorialshub"
  baseURL: string = "https://api.github.com/";
  repos: Repos[];
  constructor(private http : HttpClient) { }

  ngOnInit(): void {
    this.getRepos();
  }

  public getRepos() {
    // let source:number[] = [1,2,3,4,5,6];

    // Observable.from(source).subscribe(
    //   i => {console.log(i);}
    // );

    return this.http.get<Repos[]>(this.baseURL + 'users/' + this.userName + '/repos')
      .subscribe(
        (response) => {                           //Next callback
          console.log('response received')
          console.log(response);
          this.repos = response; 
        },
        (error) => {                              //Error callback
          console.error('Request failed with error')
          alert(error);
        },
        () => {                                   //Complete callback
          console.log('Request completed')
        })
  }
}

export class Repos {
  id: string;
  name: string;
  html_url: string;
  description: string;
}