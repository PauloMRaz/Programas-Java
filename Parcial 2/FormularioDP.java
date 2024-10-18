        import javax.swing.*; //Se necesita para diseñar ventanas
        import java.awt.event.*; //Se necesita para disparar eventos

public class FormularioDP extends JFrame implements ActionListener {

    public JLabel etiqueta;
    public JLabel etiqueta2;
    public JLabel etiqueta3;
    public JButton boton;
    public JButton boton2;
    public JTextField campoTexto;
    public JTextField campoTexto2;
    public JTextField campoTexto3;

public FormularioDP() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta = new JLabel("Nombre:");
        etiqueta.setBounds(215,25,150,15);
        add(etiqueta);

        etiqueta2 = new JLabel("Domicilio:");
        etiqueta2.setBounds(215,75,150,15);
        add(etiqueta2);

        etiqueta3 = new JLabel("Correo:");
        etiqueta3.setBounds(215,125,150,15);
        add(etiqueta3);

        boton = new JButton("Cerrar");
        boton.setBounds(260,220,100,30);
        add(boton);

        boton2 = new JButton("Actualizar");
        boton2.setBounds(60,220,100,30);
        add(boton2);

        campoTexto  = new JTextField();
        campoTexto.setBounds(50,25,150,25);
        add(campoTexto);

        campoTexto2  = new JTextField();
        campoTexto2.setBounds(50,75,150,25);
        add(campoTexto2);

        campoTexto3  = new JTextField();
        campoTexto3.setBounds(50,125,150,25);
        add(campoTexto3);

    boton.addActionListener(this);
    boton2.addActionListener(this);

} //Fin del constructor

public void actionPerformed(ActionEvent accion) {

    if (accion.getSource() == boton) {
        System.exit(0);
    }
    if (accion.getSource() == boton2) {
        etiqueta.setText(campoTexto.getText());
        etiqueta2.setText(campoTexto2.getText());
        etiqueta3.setText(campoTexto3.getText());
    }
}

public static void main(String[] args) {
        FormularioDP miformulario = new FormularioDP();
        miformulario.setBounds(200,200,400,350);
        miformulario.setVisible(true);    
}

}