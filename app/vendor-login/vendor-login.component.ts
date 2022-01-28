import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-login',
  templateUrl: './vendor-login.component.html',
  styleUrls: ['./vendor-login.component.css']
})
export class VendorLoginComponent implements OnInit {

  vendorid : number;
  passcode : String;
  vendors : Vendor[];

  logMe(){
    //alert(this.vendorId);
    localStorage.setItem('vendorid',this.vendorid.toString());
    if (this.passcode=="Mphasis") {
      this._router.navigate(['/vendorDashBoard'])
    }
  }
  constructor(private _router : Router, private _vendorservice : VendorService) { 
    this._vendorservice.showVendor().subscribe({
      next: rs =>{
        this.vendors = rs;
  }
  })
}
  ngOnInit(): void {
  }
}