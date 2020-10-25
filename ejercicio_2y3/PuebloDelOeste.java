/*Ejercicio 2: Dado el siguiente código, indicar cuál es el método constructor y cómo se identifica.*/
package ejercicio_2y3;

public class PuebloDelOeste {
    int establos;
    int cantinas;
    int comisarios;
    int alborotadores;
    String locacion;
    int tiempo;
    public PuebloDelOeste(){//Constructor tiene el mismo nombre de la clase se comporta como un metodo
        //pero NO tiene retorno, puede tener o no modificador de acceso por lo general son public
        establos=3;
        locacion="Oeste de los Estados Unidos";
        tiempo=1850;
    }
}
