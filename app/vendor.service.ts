import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Vendor } from './vendor';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  constructor(private _http: HttpClient) { }

  showVendor(): Observable<Vendor []> {
    return this._http.get<Vendor[]>("http://localhost:8989/showVendor")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  searchVendor(Vendorid : number): Observable<Vendor> {
    return this._http.get<Vendor>("http://localhost:8989/searchVendor/"+Vendorid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}
