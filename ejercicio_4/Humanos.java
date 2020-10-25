/* Ejercicio 4: ¿Qué diferencia existe entre el método Humanos y el método comoTeLlamas?*/
package ejercicio_4;
public class Humanos {
    int piernas;
    int brazos;
    int ojos;
    int nariz;
    int boca;
    String nombre;
    String sexo;
    String nombreCaballo;
    String preferenciaWhiskey;
    public Humanos(){
//El Constructor SIEMPRE TIENE ES MISMO NOMBRE QUE LA CLASE 
//Se utiliza para inicializar las variables al momento de la creacion de instancias, 
//dar valores por defecto como los que se muestran 
        piernas=2;
        brazos=2;
        ojos=2;
        nariz=1;
        boca=1;
                
    }
    
    public String comoTeLlamas(){//Los metodos pueden ser del tipo void como el main esto quiere decir 
        //que no devuelve ningun valor para poder hacer algo necesita de otros metodos.
        //El metodo comoTeLlamas() tiene modificador public su acceso es universal 
        //en su declaracion dice String poque es el tipo que va trabajar este metodo y es lo que va a devolver
        //en el return 
       
        return nombre;//devuelve el nombre
    }
}
