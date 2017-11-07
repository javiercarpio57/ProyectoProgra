import { Injectable } from '@angular/core';

@Injectable()
export class Ejemplo
{
    // aquí va el código


    public getAlgo()
    {
        return "";

    }

}

//En app.module.ts importar el servicio y ponerlo en providers
// para usar esta chingadera, importar primero y luego hacer lo siguiente en el constructor:
// constructor(public ejemplo: Ejemplo)