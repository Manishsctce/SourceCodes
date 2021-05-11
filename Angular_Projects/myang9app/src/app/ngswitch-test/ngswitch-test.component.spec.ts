import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgswitchTestComponent } from './ngswitch-test.component';

describe('NgswitchTestComponent', () => {
  let component: NgswitchTestComponent;
  let fixture: ComponentFixture<NgswitchTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgswitchTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgswitchTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
