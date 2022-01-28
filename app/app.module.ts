import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantShowComponent } from './restaurant-show/restaurant-show.component';
import { CustomerShowComponent } from './customer-show/customer-show.component';
import { VendorShowComponent } from './vendor-show/vendor-show.component';
import { CustomerDashBoardComponent } from './customer-dash-board/customer-dash-board.component';
import { VendorDashBoardComponent } from './vendor-dash-board/vendor-dash-board.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { VendorLoginComponent } from './vendor-login/vendor-login.component';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { FormsModule } from '@angular/forms';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { PlaceOrderComponent } from './place-order/place-order.component';
import { WalletCustomerComponent } from './wallet-customer/wallet-customer.component';
import { VendorOrdersComponent } from './vendor-orders/vendor-orders.component';
import { VendorPendingOrdersComponent } from './vendor-pending-orders/vendor-pending-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { AcceptOrRejectComponent } from './accept-or-reject/accept-or-reject.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const appRoutes : Routes = [
  {path:'',component:HomePageComponent},
 {path:'customerLogin',component:CustomerLoginComponent},
 {path:'vendorLogin',component:VendorLoginComponent},
 {path:'customerDashBoard',component:CustomerDashBoardComponent},
 {path:'vendorDashBoard',component:VendorDashBoardComponent},
 {path:'custDashBobard',component:CustomerDashBoardComponent, 
    children : [
      {path:'showRestaurant',component:RestaurantShowComponent,outlet:'mphasis'},
      {path:'showCustomer',component:CustomerShowComponent,outlet:'mphasis'},
      {path:'CustomerPendingOrders',component:CustomerPendingOrdersComponent,outlet:'mphasis'},
      {path:'CustomerOrders',component:CustomerOrdersComponent,outlet:'mphasis'},
      {path:'placeOrder',component:PlaceOrderComponent,outlet:'mphasis'},
      {path:'walletCustomer',component:WalletCustomerComponent,outlet:'mphasis'},
    ]  
  },
 {path:'vendDashBoard',component:VendorDashBoardComponent,
    children : [
      {path:'showRestaurant',component:RestaurantShowComponent,outlet:'mphasis'},
      {path:'showVOrders',component:VendorOrdersComponent,outlet:'mphasis'},
      {path:'showVPOrders',component:VendorPendingOrdersComponent,outlet:'mphasis'},
      {path:'showVendor',component:VendorShowComponent,outlet:'mphasis'},
     // {path:'showorderSearch',component:OrderSearchComponent,outlet:'mphasis'}
     {path : "acceptOrReject",component:AcceptOrRejectComponent,outlet:"mphasis"}
    ]

 },
 {path : "**",component:PageNotFoundComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    RestaurantShowComponent,
    CustomerShowComponent,
    VendorShowComponent,
    CustomerDashBoardComponent,
    VendorDashBoardComponent,
    CustomerLoginComponent,
    VendorLoginComponent,
    HomePageComponent,
    CustomerOrdersComponent,
    PlaceOrderComponent,
    WalletCustomerComponent,
    VendorOrdersComponent,
    VendorPendingOrdersComponent,
    CustomerPendingOrdersComponent,
    AcceptOrRejectComponent,
    PageNotFoundComponent,

    ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
