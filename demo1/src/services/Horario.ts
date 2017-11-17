/**
 * @author JP Cifuentes, Javier Carpio y Oliver
 * @version 1.1 plataforma movil
 * @description Esta clase almacena almacena las materias que cursa un determinado dia
 * 
 */
export class Horario
{
    clase1="";
    clase2="";
    clase3="";
    clase4="";
    clase5="";

    /**
     * Constructor
     * @param clase1 clase del primer periodo 
     * @param clase2 clase del segundo periodo 
     * @param clase3 clase del tercer periodo 
     * @param clase4 clase del cuarto periodo 
     * @param clase5 clase del quinto periodo 
     */
    constructor(clase1,clase2,clase3,clase4,clase5)
    {
        this.clase1=clase1;
        this.clase2=clase2;
        this.clase3=clase3;
        this.clase4=clase4;
        this.clase5=clase5;
    }
    /**
     * getClase1
     * @returns this.clase1 clase del primer periodo
     */
    getClase1()
    {
        return this.clase1;
    }

    
    /**
     * getClase2
     * @returns this.clase2 clase del segundo periodo
     */
    getClase2()
    {
        return this.clase2;
    }

    
    /**
     * getClase3
     * @returns this.clase3 clase del tercer periodo
     */
    getClase3()
    {
        return this.clase3;
    }

    
    /**
     * getClase4
     * @returns this.clase4 clase del cuarto periodo
     */
    getClase4()
    {
        return this.clase4;
    }

    
    /**
     * getClase5
     * @returns this.clase5 clase del quinto periodo
     */
    getClase5()
    {
        return this.clase5;
    }
    

}