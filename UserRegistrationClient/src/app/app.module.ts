import {AppRoutingModule} from './app-routing.module';
import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {UsererDetailsComponent} from './user-details/user-details.component';
import {UsersComponent} from './users/users.component';
import {DataService} from './data.service';

import {CreateUserComponent} from './create-customer/create-user.component';
import {UsersComponent} from './users/users.component';
import {SearchUsersComponent} from './search-users/search-users.component';

import {enableProdMode} from '@angular/core';
import {SearchCustomersComponent} from './search-customers/search-customers.component';

@NgModule({
  declarations: [
    AppComponent,
    UsererDetailsComponent,
    UsersComponent,
    CreateUserComponent,
    SearchUsersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule {}
