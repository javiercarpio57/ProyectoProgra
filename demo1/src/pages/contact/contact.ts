import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { AngularFireDatabase } from 'angularfire2/database'
import { FirebaseService } from '../../services/FirebaseService';
import { Horario } from '../../services/Horario'

@Component({
  selector: 'page-contact',
  templateUrl: 'contact.html'
})
export class ContactPage {
  
  

  constructor(public navCtrl: NavController,private database: AngularFireDatabase,
    private service:FirebaseService) 
  { }

  horario:Horario;

  addHorario(clase1,clase2,clase3,clase4,clase5)
  {
    this.horario=new Horario(clase1,clase2,clase3,clase4,clase5);

    

    
    this.service.guardarHorario(this.horario);

    console.log(clase1,clase2,clase3,clase4);
    

  }

}
