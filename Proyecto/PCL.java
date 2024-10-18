//Paulo Enrique Muñoz Razon     21310181

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.*;

public class PCL extends JFrame implements ActionListener, ItemListener, ChangeListener {

    private JMenuBar mb;
    private JMenu mDG, mC, mP, mRL, mL;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7,
            mi8, mi9, mi10, mi11, mi12, mi13, mi14, mi15, mi16,
            mi17, mi18, mi19, mi20, mi21, mi22, mi23;

    public JLabel eti;
    public JButton boton;

    Ventana1 V1 = new Ventana1();

    public PCL() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(192, 192, 192));
        setTitle("Libreria");
        setIconImage(new ImageIcon(getClass().getResource("Log2.PNG")).getImage());

        ImageIcon imagen = new ImageIcon("Logo.jpg");
        eti = new JLabel(imagen);
        eti.setBounds(200, 100, 300, 300);
        Icon icono = new ImageIcon(
                imagen.getImage().getScaledInstance(eti.getWidth(), eti.getHeight(), Image.SCALE_DEFAULT));
        eti.setIcon(icono);
        add(eti);

        mb = new JMenuBar();
        setJMenuBar(mb);

        mDG = new JMenu("Usuario");
        mL = new JMenu("Registrar libros");
        mC = new JMenu("Categorias");
        mP = new JMenu("Prestamo");
        mRL = new JMenu("Reporte de libros");
        mb.add(mDG);
        mb.add(mL);
        mb.add(mC);
        mb.add(mP);
        mb.add(mRL);

        mi18 = new JMenuItem("Registrar");
        mi19 = new JMenuItem("Modificar");
        mi21 = new JMenuItem("Eliminar");
        mi20 = new JMenuItem("Imprimir");
        mDG.add(mi18);
        mDG.add(mi19);
        mDG.add(mi21);
        mDG.add(mi20);

        mi1 = new JMenuItem("Registrar");
        mi2 = new JMenuItem("Modificar");
        mi23 = new JMenuItem("Eliminar");
        mi3 = new JMenuItem("Imprimir");
        mL.add(mi1);
        mL.add(mi2);
        mL.add(mi23);
        mL.add(mi3);

        mi5 = new JMenuItem("Generalidades");
        mi6 = new JMenuItem("Filosofia y psicologia");
        mi7 = new JMenuItem("Religion");
        mi8 = new JMenuItem("Ciencias Sociales");
        mi9 = new JMenuItem("Lenguas");
        mi10 = new JMenuItem("Ciencias naturales y matematicas");
        mi11 = new JMenuItem("Ciiencias aplicadas");
        mi12 = new JMenuItem("Arte");
        mi13 = new JMenuItem("Literatura y retorica");
        mi14 = new JMenuItem("Geografia e historia");
        mC.add(mi5);
        mC.add(mi6);
        mC.add(mi7);
        mC.add(mi8);
        mC.add(mi9);
        mC.add(mi10);
        mC.add(mi11);
        mC.add(mi12);
        mC.add(mi13);
        mC.add(mi14);

        mi15 = new JMenuItem("Listado");
        mRL.add(mi15);

        mi17 = new JMenuItem("Registrar");
        mi4 = new JMenuItem("Modificar");
        mi22 = new JMenuItem("Eliminar");
        mi16 = new JMenuItem("Listado de prestamos");
        mP.add(mi17);
        mP.add(mi4);
        mP.add(mi22);
        mP.add(mi16);

        boton = new JButton("Cerrar");
        boton.setBounds(300, 500, 100, 30);
        boton.setBackground(new Color(0, 255, 255));
        add(boton);
        boton.addActionListener(this);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        mi7.addActionListener(this);
        mi8.addActionListener(this);
        mi9.addActionListener(this);
        mi10.addActionListener(this);
        mi11.addActionListener(this);
        mi12.addActionListener(this);
        mi13.addActionListener(this);
        mi14.addActionListener(this);
        mi15.addActionListener(this);
        mi16.addActionListener(this);
        mi17.addActionListener(this);
        mi18.addActionListener(this);
        mi19.addActionListener(this);
        mi20.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == boton) {
            System.exit(0);
        }

        if (a.getSource() == mi18) {
            this.V1.setBounds(500, 100, 700, 600);
            this.V1.setVisible(true);
            this.V1.setResizable(true);
        }
        if (a.getSource() == mi19) {
        }
        if (a.getSource() == mi1) {
        }
        if (a.getSource() == mi2) {
        }
        if (a.getSource() == mi17) {
        }
        if (a.getSource() == mi4) {
        }
        if (a.getSource() == mi20) {
        }
        if (a.getSource() == mi3) {
        }
        if (a.getSource() == mi15) {
        }
        if (a.getSource() == mi16) {
        }

    }

    public void stateChanged(ChangeEvent e) {

    }

    public void itemStateChanged(ItemEvent e) {

    }

    public static void main(String[] args) {
        PCL ventana = new PCL();
        ventana.setBounds(500, 100, 700, 600);
        ventana.setVisible(true);
        ventana.setResizable(true);
    }

}