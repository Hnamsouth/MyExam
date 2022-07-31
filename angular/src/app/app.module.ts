import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {  RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { FVRInboxComponent } from './favorites/inbox/inbox.component';
import { FVRSentItemsComponent } from './favorites/sent-items/sent-items.component';
import { DraftsComponent } from './John/drafts/drafts.component';
import { DeletedItemsComponent } from './John/deleted-items/deleted-items.component';
import { SentsItemsComponent } from './John/sents-items/sents-items.component';
import { OutBoxComponent } from './John/out-box/out-box.component';
import { InboxComponent } from './John/inbox/inbox.component';
import { AppRoutingModule } from './app-routing.module';
const routes: Routes = [
];
@NgModule({
  declarations: [
      DraftsComponent,
      DeletedItemsComponent,
      SentsItemsComponent,
      OutBoxComponent,
      InboxComponent,
      FVRInboxComponent,
      FVRSentItemsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    ],
    // su dung dieu khien Form
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
