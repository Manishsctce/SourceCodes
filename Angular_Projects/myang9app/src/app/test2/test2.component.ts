import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-test2',
  template: '<div> Test2: Inline Template shown</div>',
  providers: [],
  styles: ['div{color:red;}']
})
export class Test2Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
