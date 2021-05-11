import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif-test',
  template: `
    <!-- 1st way -->
    <div *ngIf="flag ; else elseBlock" >
       ngIf-test1 if {{flag}}
    </div>

    <ng-template #elseBlock>
      elseBlock1 is shown
    </ng-template>

    <!-- 2nd way -->
    <div *ngIf="flag2 ; then thenBlock ; else elseBlock"> </div>

    <ng-template #thenBlock>
      thenBlock2 is shown
    </ng-template>

    <ng-template #elseBlock>
      elseBlock2 is shown
    </ng-template>
  `
})
export class NgifTestComponent implements OnInit {

  public flag = true;
  public flag2 = false;
  constructor() { }

  ngOnInit(): void {
  }

}
