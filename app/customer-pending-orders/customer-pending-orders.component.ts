import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-pending-orders',
  templateUrl: './customer-pending-orders.component.html',
  styleUrls: ['./customer-pending-orders.component.css']
})
export class CustomerPendingOrdersComponent implements OnInit {

  customerid : number;
  orders : Orders [];
  constructor(private _ordersService : OrdersService) { 
    this.customerid = parseInt(localStorage.getItem("custId"));
    this._ordersService.showCPOrders(this.customerid).subscribe(x => {
      this.orders=x;
    })
//    this.orders = this._ordersService.showCOrders(this.customerid);
  }

  ngOnInit(): void {
  }

}
