
//Paulo Enrique Muñoz Razon      21310181      3F
import javax.swing.*;
import java.awt.event.*;

public class Evenmouse extends JFrame implements MouseListener {
    private JLabel etqAy, etqAut;
    public JTextField txtF;
    public JTextArea txtA;
    int opc;

    public Evenmouse() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Eventos de mouse");

        etqAy = new JLabel("Ayuda");
        etqAy.setBounds(340, 1, 50, 20);
        add(etqAy);

        etqAut = new JLabel("");
        etqAut.setBounds(50, 400, 400, 20);
        add(etqAut);

        txtF = new JTextField();
        txtF.setBounds(5, 50, 150, 20);
        add(txtF);

        txtA = new JTextArea();
        txtA.setBounds(5, 80, 300, 200);
        txtA.setEditable(true);
        add(txtA);

        etqAut.addMouseListener(this);
        etqAy.addMouseListener(this);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int mouseCod = 0;
        mouseCod = e.getModifiersEx();

        if (mouseCod == 1024) {
            setTitle(txtF.getText());
        }
        if (mouseCod == 4096) {
            etqAut.setText("Esta venta fu hecha por Paulo Enrique Mu\u00f1oz Raz\u00f3n");
        }
        if (e.getSource() == etqAut && mouseCod == 2048) {
            opc = JOptionPane.showConfirmDialog(null, "¿Seguro que quier de dejar de ejecutar el programa");
            if (opc == 0) {
                System.exit(0);
            }
        }

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == etqAy) {
            JOptionPane.showMessageDialog(null,
                    "Esta ventana hace: \nEscribir textos largos en el TextArea. \nCon clic izquierdo en cualquier parte de la ventana se remplaza el titulo de la ventana con el del TextField. \nCon clic derecho en cualquier parte de la ventana aparece el nombre del autor. \nDando clic al scroll del mouse en el nombre del autor se da la opci\u00f3n de cerrar la ventana o no.");
        }
    }

    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        Evenmouse emouse = new Evenmouse();
        emouse.setBounds(450, 150, 500, 500);
        emouse.setVisible(true);
    }

}