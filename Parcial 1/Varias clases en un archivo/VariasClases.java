class Clase1 {

    public void showMsg() {

  System.out.println("Hola soy la clase 1");

    }

}

class Clase2 {

    public void showMsg() {

  System.out.println("Hola soy la clase 2");

    }

}

class Clase3 {

    public void showMsg() {

  System.out.println("Hola soy la clase 3");

    }

}

public class VariasClases {

  public static void main(String args[]) {

	Clase1 objeto1 = new Clase1();
	Clase2 objeto2 = new Clase2(); 
	Clase3 objeto3 = new Clase3();

	objeto1.showMsg();
	objeto2.showMsg();
	objeto3.showMsg();
  }

}