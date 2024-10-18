//Paulo Enrique Muñoz Razon  21310181  3f

import java.io.IOException;
import java.util.Scanner;

public class BancoM {
 Scanner entrada = new Scanner(System.in);

 float sal;
 String nombre;
 String dom;
 int edad;
 long tel;
 float saldo;

  public BancoM (float s) {

 saldo = s;

  }

   public static void menu() {

  System.out.println("Banco Menu\nOpciones");
  System.out.println("1) Dar de alta"); //Guardar
  System.out.println("2) Mostrar datos");
  System.out.println("3) Modificar datos");
  System.out.println("4) Retiro de efectivo");
  System.out.println("5) Abonos");
  System.out.println("6) Salida");

}

	void Guardar() {
   
  System.out.println("\nCual es tu nombre");
  nombre = entrada.nextLine();
  nombre = entrada.nextLine();
  System.out.println("Cual es tu domicilio");
  dom = entrada.nextLine();
  System.out.println("Cual es tu edad");
  edad = entrada.nextInt();
  System.out.println("Cual es tu telefono");
  tel = entrada.nextLong();

}

	void mostrar() {

  System.out.printf("\nEl nombre es: %s\n",nombre);
  System.out.printf("El domicilio es: %s\n",dom);
  System.out.printf("La edad es: %d\n",edad);
  System.out.printf("El telefono es: %d\n",tel);
  System.out.printf("El saldo es: %.2f\n",saldo);

}

	void retiro() {

  float n1;
  float ret;

  System.out.println("Cuanto dinero quieres retirar");
  n1 = entrada.nextFloat();

 setRetiro(saldo-n1);

  System.out.printf("\nEsto es lo que tienes %.2f\n", getRetiro());  //getSaldo()
	
}

	void abonos() {

  float n2;
  float abo;

  System.out.println("Cuanto dinero quieres abonar");
  n2 = entrada.nextFloat();

 setAbono(n2+saldo);

  System.out.printf("\nEsto es lo que tienes %.2f\n", getAbono()); //getSaldo()
	
}

  void setRetiro(float ret) {
  
  saldo = ret;

  }
  float getRetiro() {
   return saldo;
  }

  void setAbono(float abo) {

  saldo = abo;

  }
  float getAbono() {
    return saldo;
  }

public static void main(String [] args) throws IOException, InterruptedException {
    
    Scanner entrada = new Scanner(System.in);
    BancoM cliente = new BancoM(10000);  
	int opc;

  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

do {
 menu();
 System.out.println("Cual opccion eliges: ");
 opc = entrada.nextInt();

	switch(opc) {

	case 1:
	cliente.Guardar();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	break;

	case 2:
	cliente.mostrar();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	break;

	case 3:
	cliente.Guardar();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	break;

	case 4:
	cliente.retiro();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	break;

	case 5:
	cliente.abonos();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	break;

	case 6:
  System.out.println("Adios!");
	break;

} 

  } while(opc!=6);

 }

}