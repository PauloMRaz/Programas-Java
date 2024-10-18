//Paulo Enrique Muñoz Razon 21310181 3F    

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraOOme {
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

  float n1=0;
  float n2=0;
  float res=0;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1+n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float resta() {
  
  float n1=0;
  float n2=0;
  float res=0;
  try{
  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  }catch(InputMismatchException error){
  System.out.println("Te equivocaste, ingresaste una letra\nDame el primer numero");
  n1 = entrada.nextFloat();
  entrada.nextLine();
  }
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1-n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float multi() {

  float n1=0;
  float n2=0;
  float res=0;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1*n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

  float division() {

  float n1=0;
  float n2=0;
  float res=0;

  System.out.println("Dame el primer numero");
  n1 = entrada.nextFloat();
  System.out.println("Dame el segundo numero");
  n2 = entrada.nextFloat();

  res = n1/n2;

  System.out.printf("\nEl resultado es: %.3f\n",res);

  return res;
}

public static void main(String [] args) throws IOException, InterruptedException {
 int opc=0; 
CalculadoraOO calculadora = new CalculadoraOO();
 Scanner entrada = new Scanner(System.in);

 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

do {
   try {
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
    } catch(InputMismatchException error) {
   System.out.println("Error pusistes una letra en lugar de un numero\n Vuelve a intentarlo\n");
   entrada.nextLine();
    } catch(ArithmeticException er) {
   System.out.println("Estas dividiendo entre cero");
   System.out.println("Eso no se puede hacer pon un divisor mayor a 0");
    } catch(Exception exception) {
   System.out.println("Ups Also esta mal escrito\n\n"); 
    } finally {
   System.out.println("\nSiguiente intento\n");
    }

  } while(opc!=5);

}

}