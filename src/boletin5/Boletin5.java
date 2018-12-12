package boletin5;
import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta obxConta = new Conta();
        Conta obxConta2 = new Conta();
        
        System.out.println("Introduce o nome do cliente: ");
        obxConta.setNombreCliente(ler.next());
        System.out.println("Introduce o numero de conta: ");
        obxConta.setNumeroConta(ler.next());
        System.out.println("Introduce o saldo actual: ");
        obxConta.setSaldo(ler.nextDouble());
        System.out.println("Introduce a cantidade que queres ingresar: ");
        obxConta.setIngreso(ler.nextDouble());
        System.out.println("Introduce a cantidade que queres retirar: ");
        obxConta.setReintegro(ler.nextDouble());
        
        obxConta.ingreso();
        obxConta.reintegro();
        obxConta.visualizar();
    }
    
}
