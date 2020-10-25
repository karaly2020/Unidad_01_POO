/* Ejercicio 5: Dado el siguiente código, escribir el método constructor.*/
package ejercicio_5;
public class Persona {
    private String nombre;//private es un modificador de acceso me permite cumplir con el principio de ocultamiento
  //esto quiere decir que estas variables solo son visibles dentro de esta clase y sus metodos 
    //fuera de ella no estan disponibles
    private double altura;
    private int edad;
    private String genero;

    public Persona() {//Cosntructor 
    }

    public int getEdad() {//metodo getEdad es de tipo int por lo cual lo que devuelve es un valor int
        return edad;
    }
}
