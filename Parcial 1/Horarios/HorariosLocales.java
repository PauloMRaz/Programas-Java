public class HorariosLocales {

  public static void main(String [] args) {

	LaPazbc LP = new LaPazbc();
	guadalajara G = new guadalajara();
	tijuana TJ = new tijuana();

  LP.horaLocal();
  LP.mostrar();
  LP.horaGMT();

  G.horaLocal();
  G.mostrar();
  G.horaGMT();

  TJ.horaGMT();
  TJ.mostrar();   

  }

}