import { Component, OnInit } from '@angular/core';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';

@Component({
  selector: 'app-wallet-customer',
  templateUrl: './wallet-customer.component.html',
  styleUrls: ['./wallet-customer.component.css']
})
export class WalletCustomerComponent implements OnInit {

  customerId : number;
  wallet: Wallet[];
  constructor(private _walletService : WalletService) { 
    this.customerId = parseInt(localStorage.getItem("custId"));
    this._walletService.showCustomerWallet(this.customerId).subscribe(x => {
      this.wallet = x;
    });
  }
  ngOnInit(): void {
  }

}
