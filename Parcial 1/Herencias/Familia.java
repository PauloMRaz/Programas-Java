public class Familia {

	String domicilio;
	String telefonocasa;
	String apellido;

   public Familia(String d, String t, String a) {

	domicilio = d;
	telefonocasa = t;
	apellido = a;

   }//Constructor

   public void datosGenerales() {

  System.out.println(domicilio);
  System.out.println(telefonocasa);
  System.out.println(apellido);

   }

}