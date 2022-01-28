import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-accept-or-reject',
  templateUrl: './accept-or-reject.component.html',
  styleUrls: ['./accept-or-reject.component.css']
})
export class AcceptOrRejectComponent implements OnInit {

  oid : number;
  vid : number;
  status : string;
  result : string;
  acceptOrReject() {
    this._orderService.acceptOrReject(this.oid,this.vid,this.status).subscribe(
      x =>{
        this.result = x;
      }
    )
    alert(this.result);
  }

  constructor(private _orderService : OrdersService) {
    this.oid = parseInt(localStorage.getItem("ordId"));
    this.vid = parseInt(localStorage.getItem("vendorid"));
   }

  ngOnInit(): void {
  }

}
