import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Orders } from './orders';
import { Restaurant } from './restaurant';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

   constructor(private _http: HttpClient){ }
   showCOrders(customerid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8989/co/"+customerid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
   showCPOrders(customerid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8989/showCPOrders/"+customerid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  showVOrders(vendorid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8989/showVOrders/"+vendorid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  showVPOrders(vendorid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8989/showVPOrders/"+vendorid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  
  showorderSearch(orderid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8989/orderSearch/"+orderid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  showRestaurant(): Observable<Restaurant []> {
    return this._http.get<Restaurant []>("http://localhost:8989/showRestaurant")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  placeOrder(orders : Orders) : Observable<string> {
    return this._http.post<string>("http://localhost:8989/orders/placeOrder/",orders)
  }

 acceptOrReject(oid : number,vid : number,status : string) : Observable<any> {
  return this._http.post("http://localhost:8989/acceptOrRejectOrder/"+oid+"/"+vid+"/"+status,null ,  {"responseType": 'text'})
  .pipe(
    tap(data => {console.log("Place Order :"+data.toString()); return data.toString();})
  );
}

  placeOrder1(orders : Orders) : Observable<any> {
    return this._http.post<string>("http://localhost:8989/orders/placeOrder/",orders).
    pipe(tap(data => data.toString()))
  }
}
