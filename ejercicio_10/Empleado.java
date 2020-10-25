/* Ejercicio 10: 
La empresa informática “IPM Tech” necesita llevar un registro de todos sus empleados que se encuentran en la oficina central, para eso necesita implementar la clase Empleado que debe tener los siguientes atributos: 
• nombre: cadena (nombre y apellido) 
• cedula: cadena 
• edad : entero (entre 18 y 45 años) 
• casado: booleano 
• salario: numérico doble 
Y los siguientes métodos: 
• Constructor con y sin parámetros de entrada. 
• Método que permita visualizar la clasificación según la edad del empleado de acuerdo al siguiente algoritmo: o Si edad es menor a 21, Junior 
o Si edad se encuentra entre 21 y 34, Intermedio 
o Si edad es mayor o igual a 35, Senior. 
• Imprimir los datos del empleado por pantalla (se puede utilizar salto de línea \n para separar los atributos. 
• Un método que permita aumentar el salario en un porcentaje que podrá ser pasado como parámetro al método. 
• Ayuda: crear un método main para poder crear el objeto “emp1” e imprimir con él sus valores con System.out. 
*/
package ejercicio_10;
public class Empleado {
private String nombre;
private String apellido;
private String cedula;
private int edad;
private boolean casado;
private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

public void clasificarEmpleado(){
    
 if(edad >=18 && edad <21){
    System.out.println("Junior");
}
else if(edad >=21 && edad <= 34){
        System.out.println("Intermedio");
        
    }
else if (edad >=35){
        System.out.println("Senior");
}
else{
        System.out.println("No es mayor de 18 años");
    
}
   
}
public void aumentoSalario(double valor){
   
    salario=salario*valor;
    System.out.println(" Salario con aumento : " + salario);
    
}

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    public static void main(String[] args) {
       Empleado emp1=new Empleado("Pedro","Lopez","26.456.780",43,true,25000);
       
        System.out.println(emp1);
        emp1.clasificarEmpleado();
        emp1.aumentoSalario(1.10);
    }
    
}
