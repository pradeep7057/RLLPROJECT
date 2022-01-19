import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrls: ['./customer-orders.component.css']
})
export class CustomerOrdersComponent implements OnInit {

  Orders : Orders[];
  constructor(private _customerService :OrdersService) {
    this._customerService.showOrders().subscribe({
      next: (rs: Orders[]) =>{
        this.Orders = rs;
      }
    })
   }
ngOnInit(): void {
  }

}
