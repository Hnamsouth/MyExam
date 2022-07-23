import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Datum, IScnt } from '../interface/AGLcnt';
import { Food } from '../interface/AGLcnt2';

@Component({
  selector: 'cnt-agl',
  templateUrl:"./cnt1.html"
})
export class Cnt1 {
  agl:Food[]|undefined;
  constructor (private http:HttpClient){
    const cnt1= 'https://foodgroup.herokuapp.com/api/today-special';
    this.http.get<IScnt>(cnt1)
    .subscribe(vl1 =>{
      this.agl=vl1.data;
      console.log(this.agl);
    })
  }

}
