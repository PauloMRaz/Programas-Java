import javax.swing.*;
import java.awt.event.*;

public class Cv2pe extends JFrame implements ActionListener {

    public JTextField cTexto;
    public JButton BO;
    public JButton Suma;
    public JButton Resta;
    public JButton Division;
    public JButton Multiplicacion;
    public JButton Cero;
    public JButton Uno;
    public JButton Dos;
    public JButton Tres;
    public JButton Cuatro;
    public JButton Cinco;
    public JButton Seis;
    public JButton Siete;
    public JButton Ocho;
    public JButton Nueve;
    public JButton Igual;
    public JButton CE;

    public float num, num2;
    public float Resultado, sum = 0, res = 0, mul = 1, div = 1;
    public String re = "";
    public String re1 = "";
    public String Ope;

    public Cv2pe() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cTexto = new JTextField();
        cTexto.setBounds(20, 20, 400, 40);
        add(cTexto);

        BO = new JButton("Cerrar");
        BO.setBounds(325, 525, 100, 30);
        add(BO);

        Suma = new JButton("+");
        Suma.setBounds(5, 175, 60, 60);
        add(Suma);

        Resta = new JButton("-");
        Resta.setBounds(80, 175, 60, 60);
        add(Resta);

        Multiplicacion = new JButton("x");
        Multiplicacion.setBounds(155, 175, 60, 60);
        add(Multiplicacion);

        Division = new JButton("/");
        Division.setBounds(230, 175, 60, 60);
        add(Division);

        Igual = new JButton("=");
        Igual.setBounds(335, 325, 80, 160);
        add(Igual);

        CE = new JButton("CE");
        CE.setBounds(335, 225, 80, 60);
        add(CE);

        Cero = new JButton("0");
        Cero.setBounds(5, 507, 275, 50);
        add(Cero);

        Uno = new JButton("1");
        Uno.setBounds(35, 430, 60, 60);
        add(Uno);

        Dos = new JButton("2");
        Dos.setBounds(110, 430, 60, 60);
        add(Dos);

        Tres = new JButton("3");
        Tres.setBounds(185, 430, 60, 60);
        add(Tres);

        Cuatro = new JButton("4");
        Cuatro.setBounds(35, 350, 60, 60);
        add(Cuatro);

        Cinco = new JButton("5");
        Cinco.setBounds(110, 350, 60, 60);
        add(Cinco);

        Seis = new JButton("6");
        Seis.setBounds(185, 350, 60, 60);
        add(Seis);

        Siete = new JButton("7");
        Siete.setBounds(35, 260, 60, 60);
        add(Siete);

        Ocho = new JButton("8");
        Ocho.setBounds(110, 260, 60, 60);
        add(Ocho);

        Nueve = new JButton("9");
        Nueve.setBounds(185, 260, 60, 60);
        add(Nueve);

        BO.addActionListener(this);
        Suma.addActionListener(this);
        Resta.addActionListener(this);
        Multiplicacion.addActionListener(this);
        Division.addActionListener(this);
        Cero.addActionListener(this);
        Uno.addActionListener(this);
        Dos.addActionListener(this);
        Tres.addActionListener(this);
        Cuatro.addActionListener(this);
        Cinco.addActionListener(this);
        Seis.addActionListener(this);
        Siete.addActionListener(this);
        Ocho.addActionListener(this);
        Nueve.addActionListener(this);
        Igual.addActionListener(this);
        CE.addActionListener(this);
    }

    public void actionPerformed(ActionEvent accion) {

        if (accion.getSource() == BO) {
            System.exit(0);
        }
        if (accion.getSource() == Suma) {
            num = Float.parseFloat(cTexto.getText());
            Ope = "+";
            cTexto.setText("");
        }
        if (accion.getSource() == Resta) {
            num = Float.parseFloat(cTexto.getText());
            Ope = "-";
            cTexto.setText("");
        }
        if (accion.getSource() == Multiplicacion) {
            num = Float.parseFloat(cTexto.getText());
            Ope = "*";
            cTexto.setText("");
        }
        if (accion.getSource() == Division) {
            num = Float.parseFloat(cTexto.getText());
            Ope = "/";
            cTexto.setText("");
        }

        if (accion.getSource() == Cero) {
            cTexto.setText(cTexto.getText() + "0");
        }
        if (accion.getSource() == Uno) {
            cTexto.setText(cTexto.getText() + "1");
        }
        if (accion.getSource() == Dos) {
            cTexto.setText(cTexto.getText() + "2");
        }
        if (accion.getSource() == Tres) {
            cTexto.setText(cTexto.getText() + "3");
        }
        if (accion.getSource() == Cuatro) {
            cTexto.setText(cTexto.getText() + "4");
        }
        if (accion.getSource() == Cinco) {
            cTexto.setText(cTexto.getText() + "5");
        }
        if (accion.getSource() == Seis) {
            cTexto.setText(cTexto.getText() + "6");
        }
        if (accion.getSource() == Siete) {
            cTexto.setText(cTexto.getText() + "7");
        }
        if (accion.getSource() == Ocho) {
            cTexto.setText(cTexto.getText() + "8");
        }
        if (accion.getSource() == Nueve) {
            cTexto.setText(cTexto.getText() + "9");
        }
        if (accion.getSource() == CE) {
            cTexto.setText("");
        }
        if (accion.getSource() == Igual) {
            num2 = Float.parseFloat(cTexto.getText());
            cTexto.setText("");

            switch (Ope) {
                case "+":
                    Resultado = num + num2;
                    re = Float.toString(Resultado);
                    cTexto.setText(re);
                    sum = 0;
                    break;

                case "-":
                    Resultado = num - num2;
                    re = Float.toString(Resultado);
                    cTexto.setText(re);
                    res = 0;
                    break;

                case "*":
                    Resultado = num * num2;
                    re = Float.toString(Resultado);
                    cTexto.setText(re);
                    mul = 0;
                    break;

                case "/":
                    if (num2 == 0) {
                        cTexto.setText("Error pusistes un cero");
                    } else {
                        Resultado = num / num2;
                        re = Float.toHexString(Resultado);
                        cTexto.setText(re);
                    }
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Cv2pe C2 = new Cv2pe();
        C2.setBounds(200, 200, 450, 600);
        C2.setVisible(true);
    }

}
