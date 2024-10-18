public class Nieto extends Hijo {

	String domNieto;

    public Nieto(String d, String t, String a, String dh, String dn) {

	super(d, t, a, dh);
	domNieto = dn;

    }//Constructor

    public void datosNieto() {

  System.out.println(domNieto);

    }

public static void main(String args[]) {

 Nieto chavillo = new Nieto("Lopz Cotilla 321", "3825-9510", "Lopez", "333-123-456", "domicilio nieto");

 chavillo.datosGenerales();
 chavillo.datosHijo();
 chavillo.datosNieto();

 }

}