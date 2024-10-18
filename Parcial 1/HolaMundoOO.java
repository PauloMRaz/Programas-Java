 
 public class HolaMundoOO {

  String texto;

  void enviaMensaje(){
      System.out.println(texto);
  } 

  public static void main(String args[]){

   HolaMundoOO miOOHolaMundo = new HolaMundoOO(); 
   miOOHolaMundo.texto = "SALUDOS";
   miOOHolaMundo.enviaMensaje();

  } //Fin del main

 } //Fin de la clase 