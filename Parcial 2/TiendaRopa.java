
//Paulo Enrique Muñoz Razon   21310181
import javax.swing.*;
import java.awt.event.*;

public class TiendaRopa extends JFrame implements ActionListener, ItemListener {

    public JLabel eti;
    public JLabel eti2;
    public JLabel eti3;
    public JLabel eti4;
    public JLabel eti5;
    public JComboBox<String> Color;
    public JComboBox<String> Talla;
    public JComboBox<String> Corte;
    public JComboBox<String> Color2;
    public JComboBox<String> Talla2;
    public JComboBox<String> Manga;
    public JComboBox<String> Color3;
    public JComboBox<String> Genero;
    public JComboBox<String> Meses;
    public JButton Registrar;
    public JTextArea textA;
    String s,s2,s3,s4,s5,s6,s7,s8,s9;

    public TiendaRopa() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tienda de ropa");

        eti = new JLabel("TIENDA DE ROPA");
        eti.setBounds(200, 450, 300, 30);
        add(eti);

        eti2 = new JLabel("Pantalon");
        eti2.setBounds(25, 10, 300, 20);
        add(eti2);

        eti3 = new JLabel("Camisas");
        eti3.setBounds(125, 10, 300, 20);
        add(eti3);

        eti4 = new JLabel("Calcetas");
        eti4.setBounds(225, 10, 300, 20);
        add(eti4);

        eti5 = new JLabel("Ropa infantil");
        eti5.setBounds(225, 60, 300, 20);
        add(eti5);

        Color = new JComboBox<String>();
        Color.setBounds(20, 30, 90, 20);
        add(Color);
        Color.addItem("Color");
        Color.addItem("Azul");
        Color.addItem("Azul fuerte");
        Color.addItem("Gris");

        Talla = new JComboBox<String>();
        Talla.setBounds(20, 60, 90, 20);
        add(Talla);
        Talla.addItem("Talla");
        Talla.addItem("CH");
        Talla.addItem("M");
        Talla.addItem("G");

        Corte = new JComboBox<String>();
        Corte.setBounds(20, 90, 90, 20);
        add(Corte);
        Corte.addItem("Corte");
        Corte.addItem("Slim");
        Corte.addItem("Classic");
        Corte.addItem("Relaxed");

        Color2 = new JComboBox<String>();
        Color2.setBounds(120, 30, 90, 20);
        add(Color2);
        Color2.addItem("Color");
        Color2.addItem("Azul");
        Color2.addItem("Negro");
        Color2.addItem("Verde");

        Talla2 = new JComboBox<String>();
        Talla2.setBounds(120, 60, 90, 20);
        add(Talla2);
        Talla2.addItem("Talla");
        Talla2.addItem("CH");
        Talla2.addItem("M");
        Talla2.addItem("G");

        Manga = new JComboBox<String>();
        Manga.setBounds(120, 90, 90, 20);
        add(Manga);
        Manga.addItem("Manga");
        Manga.addItem("Larga");
        Manga.addItem("Corta");

        Color3 = new JComboBox<String>();
        Color3.setBounds(220, 30, 90, 20);
        add(Color3);
        Color3.addItem("Color");
        Color3.addItem("Blanca");
        Color3.addItem("Negro");

        Genero = new JComboBox<String>();
        Genero.setBounds(220, 80, 90, 20);
        add(Genero);
        Genero.addItem("Genero");
        Genero.addItem("Niño");
        Genero.addItem("Niña");

        Meses = new JComboBox<String>();
        Meses.setBounds(220, 110, 90, 20);
        add(Meses);
        Meses.addItem("Meses");
        Meses.addItem("1 a 2 Meses");
        Meses.addItem("2 a 4 Meses");
        Meses.addItem("4 a 6 Meses");
        Meses.addItem("6 a 12 Meses");

        Registrar = new JButton("Registrar Pedido");
        Registrar.setBounds(100, 500, 300, 50);
        add(Registrar);

        textA = new JTextArea("");
        textA.setBounds(320, 20, 200, 450);
        textA.setEditable(false);
        add(textA);

        Registrar.addActionListener(this);
        Color.addItemListener(this);
        Color2.addItemListener(this);
        Color3.addItemListener(this);
        Talla.addItemListener(this);
        Talla2.addItemListener(this);
        Corte.addItemListener(this);
        Manga.addItemListener(this);
        Genero.addItemListener(this);
        Meses.addItemListener(this);
    }


    public void itemStateChanged(ItemEvent accion) {
        s= Color.getSelectedItem().toString();
	s2 = Color2.getSelectedItem().toString();
	s3 = Color3.getSelectedItem().toString();
	s4 = Talla.getSelectedItem().toString();
	s5 = Talla2.getSelectedItem().toString();
	s6 = Corte.getSelectedItem().toString();
	s7 = Manga.getSelectedItem().toString();
	s8 = Genero.getSelectedItem().toString();
	s9= Meses.getSelectedItem().toString();
    }

    public void actionPerformed(ActionEvent accion) {

        if (accion.getSource() == Registrar) {
            textA.setText("Pantalon\nColor: \n   " + s + "\nTalla: \n   " + s4 + "\nCorte: \n   " + s6 + "\n\nCamisas\nColor: \n   " + s2 + "\nTalla: \n   " + s5 + "\nManga: \n   " + s7 + "\n\nCalcetas\nColor: \n   " + s3 + "\n\nRopa Infantil\nGenero: \n   " + s8 + "\nMeses: \n   " + s9 );
        }

    }

    public static void main(String[] args) {
        TiendaRopa VT = new TiendaRopa();
        VT.setBounds(150, 150, 550, 600);
        VT.setVisible(true);
        VT.setResizable(false);
    }

}