import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Menu } from './menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  constructor(private _http: HttpClient) { }

  showMenu(restaurantid : number): Observable<Menu[]> {
    return this._http.get<Menu[]>("http://localhost:8989/showMenu/"+restaurantid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }

  searchByMenuId(menuid : number): Observable<Menu> {
    return this._http.get<Menu>("http://localhost:8989/searchMenu/"+menuid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}
