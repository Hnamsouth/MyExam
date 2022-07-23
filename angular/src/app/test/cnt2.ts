import { HttpClient } from '@angular/common/http';
import { Component, Input } from '@angular/core';
import { Datum } from '../interface/AGLcnt';
import { Food, IScnt2 } from '../interface/AGLcnt2';

@Component({
  selector: 'cnt2-agl',
  templateUrl:"./cnt2.html"
})
export class Cnt2 {
  cnt2!:Food[]|undefined;
  constructor (private http:HttpClient){
    const cnt2= 'https://foodgroup.herokuapp.com/api/category/1';
    this.http.get<IScnt2>(cnt2)
    .subscribe(vl2 =>{
      this.cnt2=vl2.data.foods;
      console.log(this.cnt2);
    })
  }
}
