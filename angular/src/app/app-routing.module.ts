import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Cnt1 } from './test/cnt1';
import { Cnt2 } from './test/cnt2';

const routes: Routes = [
  {path:'ct0',component:Cnt1},
  {path:'ct2',component:Cnt2},
  {path:'',redirectTo:'ct0',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

 }
