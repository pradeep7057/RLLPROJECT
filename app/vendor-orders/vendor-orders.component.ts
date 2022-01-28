import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-vendor-orders',
  templateUrl: './vendor-orders.component.html',
  styleUrls: ['./vendor-orders.component.css']
})
export class VendorOrdersComponent implements OnInit {

    vendorId : number;
    orders : Orders [];
    constructor(private _ordersService : OrdersService) { 
      this.vendorId = parseInt(localStorage.getItem("vendorid"));
      this._ordersService.showVOrders(this.vendorId).subscribe(x => {
        this.orders=x;
      })
  //    this.orders = this._ordersService.showCOrders(this.customerid);
    }
  
    ngOnInit(): void {
    }
  
  }