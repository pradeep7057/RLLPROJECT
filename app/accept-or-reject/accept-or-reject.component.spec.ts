import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcceptOrRejectComponent } from './accept-or-reject.component';

describe('AcceptOrRejectComponent', () => {
  let component: AcceptOrRejectComponent;
  let fixture: ComponentFixture<AcceptOrRejectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcceptOrRejectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AcceptOrRejectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
