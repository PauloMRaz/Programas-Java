//Paulo Enrique Muñoz Razon 21310181 3F
 
 public class SALUDO {

  String texto;

  void enviaMensaje(){
      System.out.println(texto);
  } 

  public static void main(String args[]){

  SALUDO BDSaludo = new SALUDO();
  SALUDO BTSaludo = new SALUDO();  
  SALUDO BNSaludo = new SALUDO();

  BDSaludo.texto = "Buenos Dias";
  BDSaludo.enviaMensaje();

  BTSaludo.texto = "Buenas tardes";
  BTSaludo.enviaMensaje();

  BNSaludo.texto = "Buenas noches";
  BNSaludo.enviaMensaje();

  } 

 }