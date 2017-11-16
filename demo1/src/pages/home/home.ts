import { Component } from '@angular/core';
import { NavController, Platform } from 'ionic-angular';
import { Asistencia } from '../../../src/services/Asistencia'

import { AngularFireDatabase } from 'angularfire2/database'
import { FirebaseService } from '../../services/FirebaseService';



import { Geolocation } from '@ionic-native/geolocation';


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})



export class HomePage {

  
  item = {} as Asistencia;
  latitud:number;
  longitud:number;

  latitud2:number=14.556432500000001;
  longitud2:number=-90.74028419999999;
  distancia:number;
  
  myDate: string = new Date().toISOString();
   

  constructor(public navCtrl: NavController, private database: AngularFireDatabase,
    private service:FirebaseService, private geo:Geolocation, private platform: Platform,
  private asis:Asistencia) 
  {}

  tomarAsistencia()
  {
    

    
    
    this.platform.ready().then( ()=> {
      this.geo.getCurrentPosition().then(resp => {

        this.latitud=resp.coords.latitude;
        this.longitud=resp.coords.longitude;

        console.log("Latitud "+resp.coords.latitude);
        console.log("Longitud "+resp.coords.longitude);
        
        console.log(this.myDate.substr(0,10));

       this.distancia=this.asis.getDistancia(this.longitud,this.longitud2,this.latitud,this.latitud2)*1000;
        console.log("Distancia: "+this.asis.getDistancia(this.longitud,this.longitud2,this.latitud,this.latitud2)*1000);
        
        if (this.distancia<10) 
        {
          console.log("esta dentro del salon");
          
          
        }





      }).catch(()=>{
        console.log("Errorcito bonito");
        

      });    
    });


    
    
        
    
    

    
  }

  getList()
  {
    this.service.getList();
       
  }

  

  







}
