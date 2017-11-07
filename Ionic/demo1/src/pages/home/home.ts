import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { FirebaseService } from '../../services/FirebaseService'
import { FirebaseListObservable } from 'angularfire2';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  shoppingItems: FirebaseListObservable<any[]>;

  constructor(public navCtrl: NavController, public fire:FirebaseService) 
  {

  }

}
