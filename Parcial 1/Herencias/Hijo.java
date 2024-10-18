public class Hijo extends Familia {

	String domHijo;

    public Hijo(String d, String t, String a, String dh) {

	super(d, t, a);
	domHijo = dh;

    }//Constructor

    public void datosHijo() {

  System.out.println(domHijo);

    }

public static void main(String args[]) {

 Hijo plebe = new Hijo("Lopz Cotilla 321", "3825-9510", "Lopez", "mi casa");

 plebe.datosGenerales();
 plebe.datosHijo();

 }

}