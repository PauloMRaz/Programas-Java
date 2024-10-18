 //Paulo Enrique Muñoz Razon    21310181

import java.io.IOException;
import java.util.Scanner;

public class Ceti {
 Scanner entrada = new Scanner(System.in);

 int Registro;
 String Nombre;
 String Domicilio;
 String Carrera;
 int Promedio;
 String Semestre;

 public Ceti() {

 Registro=21310181;
 Nombre="Paulo Enrique Muñoz Razon";
 Domicilio="Privada allende";
 Carrera="Ingenieria Mecatronica";
 Promedio=90;
 Semestre="Tercero";

}//Fin de Constructor 

 void mostrarCeti() {
  System.out.println("\nEl alumno es: ");
  System.out.printf("Nombre: %s \n", Nombre);
  System.out.printf("Domicilio: %s \n", Domicilio);
  System.out.printf("Carrera: %s \n", Carrera);
  System.out.printf("Registro: %d \n", Registro);
  System.out.printf("Promedio: %d \n", Promedio);
  System.out.printf("Semestre: %s \n", Semestre);
  
}//Fin de muestra de datos

public static void main(String [] args) {
 
Ceti Alumno = new Ceti();
Becado AlumnoB = new Becado();
ServicioSocial AlumnoSS = new ServicioSocial();
PracLaborales Alumnopb = new PracLaborales();
Irregular AlumnoI = new Irregular();
Titulo AlumnoC2 = new Titulo();
Carta AlumnoCA = new Carta();
Egresado AlumnoEG = new Egresado();
CetiWorker AlumnoCW = new CetiWorker();
Industria AlumnoID = new Industria();

Alumno.mostrarCeti();
AlumnoB.dBecado();
AlumnoSS.dServicioS();
Alumnopb.dPracLab();
AlumnoI.dIrregular();
AlumnoC2.dCal2();
AlumnoCA.dCarta();
AlumnoEG.dEgre();
AlumnoCW.dCetiW();
AlumnoID.dIndus();

}//Fin del main
    


}//Fin de la clase ceti

//---Clase Becado---//
class Becado extends Ceti {

 int Monto;

public Becado() {

Monto = 35000;

}
void dBecado() {
 //System.out.println("Dame el monto");
 //Monto = entrada.nextInt(); 
 System.out.println("\nEl monto de la beca es: ");
 System.out.printf("Monto: %d \n",Monto);

}
}

//---Clase Servicio Social---//
class ServicioSocial extends Ceti {

 int Hora;
 String Area;

void dServicioS() {

  System.out.println("\nA que hora es el servicio social");
  Hora = entrada.nextInt();
  System.out.println("En donde es");
  Area = entrada.nextLine();
  Area = entrada.nextLine();
  System.out.println("Los datos son: ");
  System.out.printf("Hora: %d\n Area: %s\n",Hora,Area);

}

}

//---Clase Practicas Laborales---//
class PracLaborales extends Ceti {
 
 int Horas;
 String Empresa;
 int Remuneracion;

public PracLaborales() {

	Horas = 1;
	Empresa = "Vulcan";
	Remuneracion = 50000;

}

void dPracLab() {

  System.out.println("\nLos Datos de las practicas laborales");
  System.out.printf("Horas: %d\n",Horas);
  System.out.printf("Empresa: %s\n",Empresa);
  System.out.printf("Remuneracion: %d\n",Remuneracion);

}
}

//---Clase Irregular---//
class Irregular extends Ceti {

 String Materia;
 int Calificacion;


public Irregular() {

	Materia = "Estatica";
	Calificacion = 75;

}

void dIrregular() {

  System.out.println("\nLos Datos de Irregular son");
  System.out.printf("Materia: %s\n",Materia);
  System.out.printf("Calificacion: %d\n",Calificacion);

}

}

//---Clase Titulo---//
class Titulo extends Irregular {

 int Calificacion2;

public Titulo() {

	Calificacion2 = 87;

}

void dCal2() {

  System.out.println("\nLos Datos de Titulo son");
  System.out.printf("Calificacion 2: %d\n",Calificacion2);

}

}

//---Clase Carta---//
class Carta extends Titulo {

 int Calificacion3;
 String Justificacion;

public Carta() {

	Justificacion = "Calculo";
	Calificacion3 = 85;

}

void dCarta() {

  System.out.println("\nLos Datos de Carta son");
  System.out.printf("Justificacion: %s\n",Justificacion);
  System.out.printf("Calificacion 3: %d\n",Calificacion3);

}

}

//---Clase Egresado---//
class Egresado extends Ceti {
 
 String FechaGraduacion;


public Egresado() {

	FechaGraduacion = "15 de septiembre";

}

void dEgre() {

  System.out.println("\nLos Datos de Egresado son");
  System.out.printf("Fecha de graduacion : %s\n",FechaGraduacion);

}

}

//---Clase Cetiworker---//
class CetiWorker extends Egresado {
 
 String Area;
 int Horas;
 int Sueldo;

public CetiWorker() {

	Horas = 6;
	Area = "Maquinas";
	Sueldo = 10000;

}

void dCetiW() {

  System.out.println("\nLos Datos de CetiWorker");
  System.out.printf("Horas: %d\n",Horas);
  System.out.printf("Area: %s\n",Area);
  System.out.printf("Sueldo: %d\n",Sueldo);

}
}

//---Clase Industria---//
class Industria extends Egresado {

	String Empresa;
	int Salario;

public Industria() {

	Empresa = "Microsoft";
	Salario = 250000;

}

void dIndus() {

  System.out.println("\nLos Datos de Industria son");
  System.out.printf("Empresa: %s\n",Empresa);
  System.out.printf("Salario: %d\n",Salario);

}

}