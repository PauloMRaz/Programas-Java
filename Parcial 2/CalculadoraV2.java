        import javax.swing.*; 
        import java.awt.event.*;

public class CalculadoraV2 extends JFrame implements ActionListener {

    public JLabel etiqueta;
    public JLabel etiqueta2;
    public JLabel Valor1;
    public JLabel Valor2;
    public JTextField cTexto;
    public JTextField cTexto2;
    public JButton BO;
    public JButton Suma;
    public JButton Resta;
    public JButton Division;
    public JButton Multiplicacion;

    float VA;
    float VA2;
    float Resultado;
    String res;

public CalculadoraV2() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta = new JLabel("Resultado: ");
        etiqueta.setBounds(50,125,150,15);
        add(etiqueta);

        etiqueta2 = new JLabel(" 0 ");
        etiqueta2.setBounds(115,125,150,15);
        add(etiqueta2);

        Valor1 = new JLabel("Valor 1 ");
        Valor1.setBounds(215,25,150,15);
        add(Valor1);

        Valor2 = new JLabel("Valor 2 ");
        Valor2.setBounds(215,75,150,15);
        add(Valor2);

        cTexto = new JTextField();
        cTexto.setBounds(50,25,150,25);
        add(cTexto);
        
        cTexto2 = new JTextField();
        cTexto2.setBounds(50,75,150,25);
        add(cTexto2);

        BO = new JButton("Cerrar");
        BO.setBounds(260,260,100,30);
        add(BO);

        Suma = new JButton("+");
        Suma.setBounds(20,200,45,45);
        add(Suma);

        Resta = new JButton("-");
        Resta.setBounds(80,200,45,45);
        add(Resta);

        Multiplicacion = new JButton("x");
        Multiplicacion.setBounds(140,200,45,45);
        add(Multiplicacion);

        Division = new JButton("/");
        Division.setBounds(200,200,45,45);
        add(Division);

    BO.addActionListener(this);
    Suma.addActionListener(this);
    Resta.addActionListener(this);
    Multiplicacion.addActionListener(this);
    Division.addActionListener(this);
}

public void actionPerformed(ActionEvent accion) {


    if (accion.getSource() == BO) {
    System.exit(0);
    }
    if (accion.getSource() == Suma) {
        VA = Float.parseFloat(cTexto.getText());
        VA2 = Float.parseFloat(cTexto2.getText());
        
        Resultado = VA + VA2;

        res = Float.toString(Resultado);
        etiqueta2.setText(res);
    }
    if (accion.getSource() == Resta) {
        VA = Float.parseFloat(cTexto.getText());
        VA2 = Float.parseFloat(cTexto2.getText());
        
        Resultado = VA - VA2;

        res = Float.toString(Resultado);
        etiqueta2.setText(res);
    }
    if (accion.getSource() == Multiplicacion) {
        VA = Float.parseFloat(cTexto.getText());
        VA2 = Float.parseFloat(cTexto2.getText());
        
        Resultado = VA * VA2;

        res = Float.toString(Resultado);
        etiqueta2.setText(res);
    }
    if (accion.getSource() == Division) {
        VA = Float.parseFloat(cTexto.getText());
        VA2 = Float.parseFloat(cTexto2.getText());
        
        Resultado = VA / VA2;

        res = Float.toString(Resultado);
        etiqueta2.setText(res);
    }
}

public static void main(String[] args) {
        CalculadoraV2 C2 = new CalculadoraV2();
        C2.setBounds(200,200,400,350);    
        C2.setVisible(true);
}

}
