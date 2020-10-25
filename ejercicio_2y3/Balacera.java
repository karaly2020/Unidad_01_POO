/* Ejercicio 3: ¿Por qué decimos que esta clase es ejecutable?*/
package ejercicio_2y3;
import ejercicio_4.Humanos;
public class Balacera {
//Para que una clase pueda probar cada una de sus partes necesitamos tener el metodo "main"
    // es el metodo a partir dela cual podemos ejecutar nuestra clase 
    
    public static void main(String[] args) {
        PuebloDelOeste sweatyPost=new PuebloDelOeste();
        sweatyPost.cantinas=2;
        sweatyPost.comisarios=1;
        sweatyPost.alborotadores=5;
        
        Humanos humano1=new Humanos();
        
    }
    
}
