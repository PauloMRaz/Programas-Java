
//Paulo Enrique Muñoz Razon     21310181    3F
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.*;
import java.awt.*;

public class MS extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu m1, m2, m3, m4;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9;

    public MS() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Menus y submenus");

        mb = new JMenuBar();
        setJMenuBar(mb);

        m1 = new JMenu("Tama\361o de ventana");
        m2 = new JMenu("Color de ventana");
        m3 = new JMenu("Cambiar titulo");
        m4 = new JMenu("Abrir ventana");
        mb.add(m1);
        mb.add(m3);
        mb.add(m4);

        mi1 = new JMenuItem("240 x 480");
        mi2 = new JMenuItem("640 x 720 ");
        mi3 = new JMenuItem("Rojo");
        mi4 = new JMenuItem("Azul");
        mi5 = new JMenuItem("Verde");
        mi6 = new JMenuItem("Menus y submenus");
        mi7 = new JMenuItem("M y S");
        mi8 = new JMenuItem("Ventana predise\361ada");
        mi9 = new JMenuItem("Ventana dise\361ada");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(m2);
        m2.add(mi3);
        m2.add(mi4);
        m2.add(mi5);
        m3.add(mi6);
        m3.add(mi7);
        m4.add(mi8);
        m4.add(mi9);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        mi7.addActionListener(this);
        mi8.addActionListener(this);
        mi9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a) {

        if (a.getSource() == mi1) {
            setSize(480,240);
        }
        if (a.getSource() == mi2) {
            setSize(640,720);
        }
        if (a.getSource() == mi3) {
            getContentPane().setBackground(new Color(225, 0, 0));
        }
        if (a.getSource() == mi4) {
            getContentPane().setBackground(new Color(0, 0, 225));
        }
        if (a.getSource() == mi5) {
            getContentPane().setBackground(new Color(0, 225, 0));
        }
        if (a.getSource() == mi6) {
            setTitle("Menus y submenus");
        }
        if (a.getSource() == mi7) {
            setTitle("M y S");
        }
        if (a.getSource() == mi8) {
            MS ms1 = new MS();
            JOptionPane.showMessageDialog(ms1, "Proceso terminado");
        }
        if (a.getSource() == mi9) {
            Cv2pe v2 = new Cv2pe();
            v2.setBounds(200, 200, 450, 600);
            v2.setVisible(true);
        }

    }

    public static void main(String[] args) {
        MS ms = new MS();
        ms.setBounds(500, 100, 400, 400);
        ms.setVisible(true);
        ms.setResizable(true);
    }

}