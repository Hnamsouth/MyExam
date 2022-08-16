import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FVRSentItemsComponent } from './favorites/sent-items/sent-items.component';


const routes: Routes = [
  {path:'',component:FVRSentItemsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})
export class AppRoutingModule { }
