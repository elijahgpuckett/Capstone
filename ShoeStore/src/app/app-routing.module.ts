import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './admin/users/users.component';
import { ShoesComponent } from './admin/shoes/shoes.component';
import { ShopshoeComponent } from './shopshoe/shopshoe.component';

const routes: Routes = [
  { path: 'admin/users', component: UsersComponent},
  { path: 'admin/shoes', component: ShoesComponent},
  { path: 'shop', component: ShopshoeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
