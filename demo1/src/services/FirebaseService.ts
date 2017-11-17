import { Injectable } from '@angular/core';
import { AngularFireDatabase,AngularFireList } from 'angularfire2/database';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';
import { Asistencia } from './Asistencia';
import { AngularFireAuth } from 'angularfire2/auth';
import { Horario } from './Horario'


@Injectable()
export class FirebaseService
{
    // aquí va el código


    
    asistencia= {id:1, title:'prueba 1', fecha:'26/5/2017'};
    asistencia2={};
    

    constructor(public afd: AngularFireDatabase,private fire: AngularFireAuth){}

    usuario= this.fire.auth.currentUser.uid;
    
    
   
   guardarHorario(horario:Horario)
   {
       
       return this.afd.database.ref('Estudiantes/'+this.usuario+'/Horario').set(horario)
       
       
       
   }


   getList()
   {

    this.afd.database.ref('Estudiantes/6WOWiVF5Eog5CFXK7tUvdq9XPcd2').once('value').then(function(snapshot) 
    {
        var user= snapshot.val().fecha;
        console.log(user)
        });
    
   }

     
    

}

//En app.module.ts importar el servicio y ponerlo en providers
// para usar esta chingadera, importar primero y luego hacer lo siguiente en el constructor:
// constructor(public ejemplo: Ejemplo)