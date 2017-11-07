import { Injectable } from '@angular/core';
import { AngularFireDatabase } from 'angularfire2/database';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';


@Injectable()
export class FirebaseService
{
    // aquí va el código

    constructor(public afd: AngularFireDatabase){}


    getShoppingItems()
    {
        return this.afd.list('/shoppingItems/');
        

    }

    addItem(name)
    {
        this.afd.list('/shoppingItems/').push(name);

    }

    removeItem(id)
    {
        this.afd.list('/shoppingItems/').push(name).remove(id);
        
    }

}

//En app.module.ts importar el servicio y ponerlo en providers
// para usar esta chingadera, importar primero y luego hacer lo siguiente en el constructor:
// constructor(public ejemplo: Ejemplo)