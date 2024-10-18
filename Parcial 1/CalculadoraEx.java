//Paulo Enrique Muñoz Razon      21310181  3F

import java.util.Scanner; 
import java.io. IOException; 
import java.util.InputMismatchException; 

public class CalculadoraEx{

Scanner metodo = new Scanner(System.in); 

void mostrarMenu() { 

System.out.printf("Menu\n0-Salir\n1-Suma\n2.-Resta\n3-Multiplicacion\n4-Division\n");

} 

   void Suma(float a, float b) { 

	float c;
 System.out.printf("El primer numero es: %.2f\n",a);
 System.out.printf("El segundo numero es: %.2f\n",b);
 	c=a+b;
 System.out.printf("El resultado es: %.2f\n",c);

   } 

   void Resta(float a, float b) {

	float c;
 System.out.printf("El primer numero es: %.2f\n",a);
 System.out.printf("El segundo numero es: fue %.2f\n",b);
 	c=a-b;
 System.out.printf("El resultado es: %.2f\n",c);

   } 

   void Multiplicacion(float a, float b) { 

	float c;
 System.out.printf("El primer numero es: %.2f\n",a);
 System.out.printf("El segundo numero es: %.2f\n",b);
	c=a*b;
 System.out.printf("El resultado es: %.2f\n",c);

   } 

   void Division(float a, float b) { 
       try {
	float c;
 System.out.printf("El primer numero es: %.2f\n",a);
 System.out.printf("El segundo numero es: %.2f\n",b);
	c=a/b;
 System.out.printf("El resultado es: %.2f\n",c);
} catch(ArithmeticException error) {
 System.out.printf("\nHa ingresado un cero como divisor\nLa operacion es invalida\nIntente con otros numeros\n\n");
	metodo.nextLine();
} finally {
}

   } 

public static void main(String [] args) throws IOException, InterruptedException {

CalculadoraEx Op = new CalculadoraEx();
Scanner entrada = new Scanner(System.in);

int opc;
float a,b,c;

   do {	

 System.out.printf("\nCalculadora\n");

      try {
 System.out.printf("Ingrese el primer numero:\n");
	a = entrada.nextFloat();
} catch(InputMismatchException error) {
 System.out.printf("\nHa ingresado una letra en vez de un numero\nIntentelo de nuevo con un numero\n\n");
  entrada.nextLine();
 System.out.printf("Ingrese el primer numero:\n");
	a = entrada.nextFloat();
} finally {
new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
}
      try {
 System.out.printf("Ingrese el segundo numero:\n");
	b = entrada.nextFloat();
} catch(InputMismatchException error) {
 System.out.printf("\nHa ingresado una letra en vez de un numero\nIntentelo de nuevo con un numero\n\n");
  entrada.nextLine();
 System.out.printf("Ingrese el segundo numero:\n");
	b = entrada.nextFloat();
} finally {
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
}
      try {
	Op.mostrarMenu();
	opc = entrada.nextInt();
} catch(InputMismatchException error) {
 System.out.printf("\nHa ingresado una letra en vez de un numero\nIntentelo de nuevo con un numero del menu\n\n");
	entrada.nextLine();
	Op.mostrarMenu();
	opc = entrada.nextInt();
} finally {
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
}

    switch(opc) {	

   case 0:
 System.out.printf("\nAdios\n");
	break;

   case 1:
 	Op.Suma(a,b);
 System.out.println("Teclea \"c\" y luego presiona [enter] para continuar...");
  entrada.nextLine();
  entrada.nextLine();
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
	break;

   case 2:
	Op.Resta(a,b);
 System.out.println("Teclea \"c\" y luego presiona [enter] para continuar...");
  entrada.nextLine();
  entrada.nextLine();
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
	break;

   case 3:
	Op.Multiplicacion(a,b);
 System.out.println("Teclea \"c\" y luego presiona [enter] para continuar...");
  entrada.nextLine();
  entrada.nextLine();
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
	break;

   case 4:
	Op.Division(a,b);
 System.out.println("Teclea \"c\" y luego presiona [enter] para continuar...");
  entrada.nextLine();
  entrada.nextLine();
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
	break;

   default:
 System.out.println("El numero que ingresaste no esta dentro del menu de opciones\nIntentalo de nuevo\n\n");
 System.out.println("Teclea \"c\" y luego presiona [enter] para continuar...");
  entrada.nextLine();
  entrada.nextLine();
 new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();
	break;

}	

} while(opc!=0);	

}

}
