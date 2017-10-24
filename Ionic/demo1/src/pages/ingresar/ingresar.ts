import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {TabsPage } from '../tabs/tabs';

/**
 * Generated class for the IngresarPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */


@IonicPage()
@Component({
  selector: 'page-ingresar',
  templateUrl: 'ingresar.html',
})
export class IngresarPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad IngresarPage');
  }

  ingresar()
  {
    // ver si esta correcta la informacion del usuario
    this.navCtrl.push(TabsPage);

  }

}
