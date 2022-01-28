import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-vendor-pending-orders',
  templateUrl: './vendor-pending-orders.component.html',
  styleUrls: ['./vendor-pending-orders.component.css']
})
export class VendorPendingOrdersComponent implements OnInit {

  vendorId : number;
  orders : Orders[];
  ordId : number;
venId : number;
  _routes: any;
  _route: any;
 acceptOrReject(oid : number, vid : number) {
   this.ordId=oid
   this.venId=vid;
   alert(this.ordId);
   alert(this.venId);
   localStorage.setItem("ordId",this.ordId.toString());
   localStorage.setItem("vid",vid.toString());
   this._routes.navigate(['../acceptOrReject'], {relativeTo: this._route});
}

  constructor(private _ordersService : OrdersService) { 
    this.vendorId = parseInt(localStorage.getItem("vendorid"));
    this._ordersService.showVOrders(this.vendorId).subscribe( {
      next: rs =>{
        this.orders= rs;

      }
    })
//    this.orders = this._ordersService.showCOrders(this.customerid);
  }

  ngOnInit(): void {
  }

}
