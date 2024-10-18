public class Hija extends Familia {

	String celular;
    
    public Hija(String d, String t, String a, String c) {

	super(d, t, a);
	celular = c;

    }//constructor

    public void datosHija() {

  System.out.println(celular);

    }

public static void main(String args[]) {

 Hija mija = new Hija("Lopz Cotilla 321", "3825-9510", "Lopez", "333-123-456");

 mija.datosGenerales();
 mija.datosHija();

 }

}