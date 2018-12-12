package boletin5;
import java.util.Scanner;

public class Conta {
   private  static String nombreCliente;
   private static String numeroConta;
   private static double saldo;
   private double ingreso = 0;
   private double reintegro = 0;
   Scanner ler = new Scanner(System.in);
   //Constructores
   public Conta (){
       nombreCliente = null;
       numeroConta = null;
       saldo = 0;
   }
   public Conta (String i, String j, double k){
       nombreCliente = i;
       numeroConta = j;
       saldo = k;
   }
   
   //Recogida de Datos
   public void setNombreCliente (String i){
       nombreCliente = i;
   }
   public void setNumeroConta (String j){
       numeroConta = j;
   }
   public void setSaldo (double k){
       saldo = k;
   }
   public void setIngreso (double in){
       while (in < 0){
       System.out.println("El valor introducido no puede ser 0 o menor \n introduce un nuevo valor: ");
       in = ler.nextDouble();
       }
       ingreso = in;
   }
   public void setReintegro(double re){
       while (re < 0){
       System.out.println("El valor introducido no puede ser 0 o menor \n introduce un nuevo valor: ");
       re = ler.nextDouble();
       }
       while (re > saldo){
       System.out.println("El valor introducido no puede ser mayor al saldo disponible \n introduce un nuevo valor: ");
       re = ler.nextDouble();
       }
       reintegro = re;
   }
   public String getNombreCliente (){
       return nombreCliente;
   }
   public String getNumeroConta (){
       return numeroConta;
   }
   public double getsaldo (){
       return saldo;
   }
   public double getIngreso (){
       return ingreso;
   }
   public double getReintegro (){
       return reintegro;
   }
   
   //metodos
   public void ingreso(){
      saldo += ingreso;
   }
   public void reintegro(){
      saldo -= reintegro;
   }
   public void visualizar(){
      System.out.println("El nombre del cliente es: " + nombreCliente + "\nNumero de conta: " +numeroConta + "\nTiene un saldo de: " +saldo +"€");
   }
   public void transferencia(){
       System.out.println("Ingresa la cantidad a transferir: ");
   }
}

