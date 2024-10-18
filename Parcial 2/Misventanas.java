import javax.swing.JFrame;
import javax.swing.JLabel;

public class Misventanas extends JFrame {
        JLabel etiqueta;
        JLabel etiqueta2;
        JLabel etiqueta3;
        JLabel etiqueta4;
        JLabel etiqueta5;

    public Misventanas() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta = new JLabel("Hola mundo");
        etiqueta2 = new JLabel("Texto 1");
        etiqueta3 = new JLabel("Texto 2");
        etiqueta4 = new JLabel("Texto 3");
        etiqueta5 = new JLabel("Texto 4");

        etiqueta.setBounds(100,100,100,15);
        add(etiqueta);
        etiqueta2.setBounds(235,180,100,15);
        add(etiqueta2);
        etiqueta3.setBounds(0,180,100,15);
        add(etiqueta3);
        etiqueta4.setBounds(0,0,100,15);
        add(etiqueta4);
        etiqueta5.setBounds(235,0,100,15);
        add(etiqueta5);

       }

    public static void main(String[] args) {
    
        Misventanas miventana = new Misventanas();
        Misventanas miventana2 = new Misventanas();
        Misventanas miventana3 = new Misventanas();
        Misventanas miventana4 = new Misventanas();
        Misventanas miventana5 = new Misventanas();

        miventana.setBounds(0,0,300,250);
        miventana.setVisible(true);

        miventana2.setBounds(1300,0,300,250);
        miventana2.setVisible(true);

        miventana3.setBounds(600,350,300,250);
        miventana3.setVisible(true);

        miventana4.setBounds(0,605,300,250);
        miventana4.setVisible(true);

        miventana5.setBounds(1300,605,300,250);
        miventana5.setVisible(true);
    
    }
       
    }   

