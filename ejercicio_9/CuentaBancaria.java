/* Ejercicio 9: Crear la clase CuentaBancaria, con el atributo y los métodos que figuran a continuación.*/
package ejercicio_9;
public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria() {
    }
    public void depositar(int monto){
        this.saldo=saldo+monto;  
        System.out.println("Deposito : " + saldo);
    }
    public void extraer(int monto){
        this.saldo=saldo - monto;
        
        System.out.println("Retiro de dinero " + saldo);
    }

  
    
}
