import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { data1, IScategory } from './interface/AGL';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css','../assets/test.css']
})
export class AppComponent {

  rtl=[];
  title = 'T2204M';
  data:data1[]|undefined;
    constructor (private http:HttpClient){
      const url = 'https://foodgroup.herokuapp.com/api/menu';
      this.http.get<IScategory>(url)
      .subscribe(value =>{
        this.data=value.data
        // console.log(this.data);
      })
  }
}
