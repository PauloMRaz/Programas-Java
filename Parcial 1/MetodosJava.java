public class MetodosJava {
   String a; 
   int b; 

 /* public Metodosjava(String e, int f) {
   a = e;
   b = f;
 }  //Fin del constructor
 */
  void metodo1() { 
    System.out.println("Hola soy el metodo 1");
 } //Fin del metodo 1, no devuelven valor

   String metodo2() {
     String c = "Hola soy el metod 2";
     return c;
 } //Fin del metod 2, devuelve un valor pero no tiene parametros

   void metodo3(String texto) {
     System.out.println("Hola soy el " + texto + "");
 } //Fin del metodo 3, tiene parametros

   void setAtributo1(String c) {
     a = c;
 } //Fin del metodo setAtributo1

   void setAtributo2(int d) {
     b = d;
 } //fin del metodo setAtributo2

   String getAtributo1() {
     return a;
 } //Fin del metodo getAtributo1

   int getAtributo2 () {
     return b;
 } //Fin del metodo getAtributo2

    public static void main(String args[]) {
      String d;
      String m;
      int n;

    MetodosJava misMetodos = new MetodosJava();
    misMetodos.metodo1();

    d = misMetodos.metodo2();
    System.out.println(d);
/*
    m = "metod3";
    misMetods.metodo3(m);

    misMetodos.setAtributo1("metodo4");
    d = misMetodos.getAtributo1();
    System.out.println("Hola soy el " + d +"");
 
    d = misMetodos.getAtributo1();
    n = misMetodos.getAtributo2();
    System.out.println("Hola soy el" + d + n +""); 
*/
  }

}