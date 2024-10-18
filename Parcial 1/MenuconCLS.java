//Programa de ejemplo que muestra un menu y limpia la pantalla (CLS) despues de procesar cada opcion

import java.io.IOException;     //Libreria para usar "CLS"
import java.util.Scanner;       //Libreria para capturar teclado

public class MenuconCLS {

  public static void menu() {

   System.out.println("MENU PRINCIPAL");
   System.out.println("Elije una opcion");
   System.out.println("1) Opcion 1");
   System.out.println("2) Opcion 2");
   System.out.println("3) Opcion 3");
   System.out.println("4) Opcion 4");
   System.out.println("5) Salir");

 }//Fin del metodo menu

public static void main(String [] args) throws IOException, InterruptedException {
   int opcion;
   Scanner entrada = new Scanner(System.in);

   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Clear Screen (cls)
 
  do {
   menu();
   opcion = entrada.nextInt();
   
if (opcion==5) {
   System.out.println("Adios");
   break;
}
   System.out.println("Elegiste la opcion " + opcion);
   System.out.println(" ");
   System.out.println("Tecla \"c\" y luego presiona la tecla [Enter] para continuar...");
   entrada.next().charAt(0);
   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Clear Screen(cls)

   } while(opcion!=5);  //fin del while

  }

}