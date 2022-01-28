import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrls: ['./customer-orders.component.css']
})
export class CustomerOrdersComponent implements OnInit {

  customerid : number;
  orders : Orders[];
  constructor(private _ordersService : OrdersService) { 
    this.customerid = parseInt(localStorage.getItem("custId"));
    this._ordersService.showCOrders(this.customerid).subscribe(x => {
      this.orders=x;
    })
   }
ngOnInit(): void {
  }

}
