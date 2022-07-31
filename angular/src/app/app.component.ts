import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { data1, IScategory } from './interface/AGL';
import { RouterModule,Route } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css','../assets/test.css']
})
export class AppComponent {
  favoritesList=['Inbox','Sent Items'];
  JohnList=['Inbox','Drafts','Inbox','Sent Items','OutBox'];
  constructor (private http:HttpClient){

  }
}
