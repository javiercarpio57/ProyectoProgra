import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, AlertController } from 'ionic-angular';
import {TabsPage } from '../tabs/tabs';

import { AngularFireAuth } from 'angularfire2/auth';


@IonicPage()
@Component({
  selector: 'page-ingresar',
  templateUrl: 'ingresar.html',
})
export class IngresarPage {

  constructor(private Alerta:AlertController,private fire: AngularFireAuth,public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad IngresarPage');
  }


  alerta(mensaje:string)
  {
    this.Alerta.create({

      title: 'Error!',
      subTitle: mensaje,
      buttons: ['OK']

    }).present();

  }


  ingresar(usuario,contra)
  {
    // ver si esta correcta la informacion del usuario

    this.fire.auth.signInWithEmailAndPassword(usuario,contra)

    .then(data=>{
      //todos los datos son correctos
      this.navCtrl.push(TabsPage);

    })

    .catch(error => {
      // si se produce un error
      console.log('Hay un problemita');
      this.alerta(error.message);


    })





    

  }

}
