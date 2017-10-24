import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { TabsPage } from '../tabs/tabs'

import { AngularFireAuth } from 'angularfire2/auth';



@IonicPage()
@Component({
  selector: 'page-registrarse',
  templateUrl: 'registrarse.html',
})
export class RegistrarsePage {

  constructor(private fire: AngularFireAuth,public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegistrarsePage');
  }

  //metodo cuando se registram
  registrarse()
  {
    
    let usuario : string =(<HTMLInputElement>document.getElementById("usuario")).value
    //var usuario =document.getElementById("usuario");
    var contra =document.getElementById("contra");
    

    this.fire.auth.createUserWithEmailAndPassword(usuario,"contra")
    

    .then(data=>{

      console.log('Ingresado correctamente', data);

    })

    .catch( error=>{
      console.log('Hay un problemita'+usuario, error);


    });

    this.navCtrl.push(TabsPage);
  }

}
