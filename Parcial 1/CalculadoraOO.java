//Paulo Enrique Muñoz Razon 21310181 3F    

import java.io.IOException;
import java.util.Scanner;

public class CalculadoraOO {
 Scanner entrada = new Scanner(System.in);

  public static void menu() {

   System.out.println("Operacione");
   System.out.println("Elije una opcion");
   System.out.println("1) Suma");
   System.out.println("2) Resta");
   System.out.println("3) Multiplicacion");
   System.out.println("4) Division");
   System.out.println("5) Salir");
 }

  float suma() {

  float n1;
  float n2;
  float res;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1+n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float resta() {
  
  float n1;
  float n2;
  float res;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1-n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float multi() {

  float n1;
  float n2;
  float res;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1*n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float division() {

  float n1;
  float n2;
  float res;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1/n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

public static void main(String [] args) throws IOException, InterruptedException {
 int opc; 
CalculadoraOO calculadora = new CalculadoraOO();
 Scanner entrada = new Scanner(System.in);

 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

do {
 menu();
 System.out.println("Cual opccion eliges");
  opc = entrada.nextInt();

  switch(opc) {

   case 1:
  calculadora.suma();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   break;

   case 2:
  calculadora.resta();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   break;

   case 3:
  calculadora.multi();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   break;

   case 4:
  calculadora.division();
  System.out.println("Presoina c y luego Enter para continuar");
  entrada.nextLine();
  entrada.nextLine();
  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   break;

   case 5:
  System.out.println("Adios");
   break;

 }

  } while(opc!=5);

}

}