import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RegistrarsePage } from '../registrarse/registrarse';
import { IngresarPage } from '../ingresar/ingresar';

/**
 * Generated class for the InicioPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-inicio',
  templateUrl: 'inicio.html',
})
export class InicioPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad InicioPage');
  }


  //funcion de inicio de sesion
  inicio()
  {
    this.navCtrl.push(IngresarPage);
  }

  // funcion de registrarse

  registrarse()
  {
    this.navCtrl.push(RegistrarsePage);

  }




}
