import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgforTestComponent } from './ngfor-test.component';

describe('NgforTestComponent', () => {
  let component: NgforTestComponent;
  let fixture: ComponentFixture<NgforTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgforTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgforTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
