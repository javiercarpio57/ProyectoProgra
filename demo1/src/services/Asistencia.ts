export class Asistencia
{
    private latR:number;
    private longR:number;
    private distancia:number;

    private fecha:string;
    


    
    constructor()
    {}

    getDistancia(longitud1,longitud2,latitud1,latitud2)
    {
        this.latR=latitud2-latitud1;
        this.longR=longitud2-longitud1;

        return this.distancia=Math.sqrt(Math.abs((this.latR*this.latR)+(this.longR+this.longR)));

    }


    



}