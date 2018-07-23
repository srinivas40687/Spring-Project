import {CreateUserComponent} from './create-customer/create-user.component';
import {UsersComponent} from './users/users.component';
import {SearchUsersComponent} from './search-users/search-users.component';

import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
  {path: '', redirectTo: 'user', pathMatch: 'full'},
  {path: 'user', component: UsersComponent},
  {path: 'add', component: CreateUserComponent},
  {path: 'findbylastname', component: SearchUsersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {}
