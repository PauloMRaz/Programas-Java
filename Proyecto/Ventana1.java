import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.*;

public class Ventana1 extends JFrame{

    private JPanel P1;
    public JLabel nom,domi, tel, texi, tarti, tartigen;
    public JTextField TextNom, des, pre, exi, artcod;
    public JButton cerrar;

    public Ventana1() {
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(192, 192, 192));
        setTitle("Libreria");
        setIconImage(new ImageIcon(getClass().getResource("Log2.PNG")).getImage());
        
        setBounds(500, 100, 700, 600);

        TextNom = new JTextField();
        TextNom.setBounds(15, 45, 300, 40);
         add(TextNom);

        des = new JTextField();
        des.setBounds(15, 155, 300, 40);
         add(des);

        pre = new JTextField();
        pre.setBounds(15, 305, 300, 40);
         add(pre);

        nom = new JLabel("Nombre Completo");
        nom.setBounds(15, 10, 250, 40);
         add(nom);

        domi = new JLabel("Domicilio");
        domi.setBounds(15, 120, 250, 40);
         add(domi);

        tel = new JLabel("Telefono");
        tel.setBounds(15, 270, 250, 40);
         add(tel);

        cerrar = new JButton("Cerrar");
        cerrar.setBounds(75,400,250,50);
         add(cerrar);
    }

}