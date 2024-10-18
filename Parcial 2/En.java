import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class En extends JFrame implements ItemListener, ActionListener, ChangeListener {

	public JTextArea Atext;
	public JLabel muni, gen, est, gus, hora;
	public JComboBox<String> municipio;
	public JRadioButton Masc, Fem, mat, ves;
	public ButtonGroup opc, opc1;
	public JCheckBox lic, mae, doc, leer, corr, bici;
	public JButton bot;
	public String t = "";
	public String t1 = "";
	public String t2 = "";
	public String t3 = "";
	public String t4 = "";

	public En() {

		setLayout(null);
		setTitle("Encuesta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		muni = new JLabel("Municipio.");
		muni.setBounds(20, 10, 190, 30);
		add(muni);

		municipio = new JComboBox<String>();
		municipio.setBounds(20, 35, 130, 20);
		add(municipio);

		municipio.addItem("Zapopan");
		municipio.addItem("Tlaquepaque");
		municipio.addItem("Guadalajara");
		municipio.addItem("Tonala");
		municipio.addItemListener(this);

		opc = new ButtonGroup();

		gen = new JLabel("Genero");
		gen.setBounds(20, 60, 90, 20);
		add(gen);

		Masc = new JRadioButton("MASCULINO");
		Masc.setBounds(20, 85, 190, 20);
		add(Masc);
		opc.add(Masc);
		Masc.addChangeListener(this);

		Fem = new JRadioButton("FEMENINO");
		Fem.setBounds(20, 110, 90, 20);
		add(Fem);
		opc.add(Fem);
		Fem.addChangeListener(this);

		est = new JLabel("Nivel de Estudios");
		est.setBounds(20, 135, 190, 20);
		add(est);

		lic = new JCheckBox("LICENCIATURA");
		lic.setBounds(20, 160, 190, 20);
		add(lic);
		lic.addChangeListener(this);

		mae = new JCheckBox("MAESTRIA");
		mae.setBounds(20, 185, 190, 20);
		add(mae);
		mae.addChangeListener(this);

		doc = new JCheckBox("DOCTORADO");
		doc.setBounds(20, 210, 190, 20);
		add(doc);
		doc.addChangeListener(this);

		gus = new JLabel("Gustos");
		gus.setBounds(20, 235, 90, 20);
		add(gus);

		leer = new JCheckBox("LEER");
		leer.setBounds(20, 260, 190, 20);
		add(leer);
		leer.addChangeListener(this);

		corr = new JCheckBox("CORRER");
		corr.setBounds(20, 285, 190, 20);
		add(corr);
		corr.addChangeListener(this);

		bici = new JCheckBox("BICICLETA");
		bici.setBounds(20, 310, 190, 20);
		add(bici);
		bici.addChangeListener(this);

		hora = new JLabel("Horario");
		hora.setBounds(20, 335, 90, 20);
		add(hora);

		opc1 = new ButtonGroup();

		mat = new JRadioButton("MATUTINO");
		mat.setBounds(20, 360, 190, 20);
		add(mat);
		opc1.add(mat);
		mat.addChangeListener(this);

		ves = new JRadioButton("VESPERTINO");
		ves.setBounds(20, 385, 190, 20);
		add(ves);
		opc1.add(ves);
		ves.addChangeListener(this);

		bot = new JButton("Finalizar Encuesta");
		bot.setBounds(30, 500, 190, 45);
		add(bot);
		bot.addActionListener(this);

		Atext = new JTextArea("");
		Atext.setBounds(250, 10, 600, 500);
		Atext.setEditable(false);
		add(Atext);
	}

	public void itemStateChanged(ItemEvent accion) {

		String selec = municipio.getSelectedItem().toString();
		t = selec;

	}

	public void stateChanged(ChangeEvent accion1) {
		String cad = "";
		String cad1 = "";
		String cad2 = "";
		String cad3 = "";

		if (Masc.isSelected() == true) {
			cad = cad + "MASCULINO";
		}
		if (Fem.isSelected() == true) {
			cad = cad + "FEMENINO";
		}

		t1 = cad;

		if (mat.isSelected() == true) {
			cad3 = cad3 + "MATUTINO";
		}
		if (ves.isSelected() == true) {
			cad3 = cad3 + "VESPERTINO";
		}

		t4 = cad3;

		if (lic.isSelected() == true) {
			cad1 = cad1 + "LICENCIATURA \n";
		}

		if (mae.isSelected() == true) {
			cad1 = cad1 + "MAESTRIA \n";
		}

		if (doc.isSelected() == true) {
			cad1 = cad1 + "DOCTORADO";
		}

		t2 = cad1;

		if (leer.isSelected() == true) {
			cad2 = cad2 + "LEER \n";
		}

		if (corr.isSelected() == true) {
			cad2 = cad2 + "CORRER \n";
		}

		if (bici.isSelected() == true) {
			cad2 = cad2 + "BICICLETA";
		}

		t3 = cad2;
	}

	public void actionPerformed(ActionEvent accion2) {

		if (accion2.getSource() == bot) {
			Atext.setText("\n\n" + "   Municipio: \n" + t + "\n\n" + "   Genero:\n" + t1
					+ "\n\n" + "   Nivel de Estudios:\n" + t2 + "\n\n" + "   Gustos:\n" + t3 + "\n\n"
					+ "   Horario:\n" + t4);
		}
	}

	public static void main(String args[]) {

		En ventana = new En();
		ventana.setBounds(200, 80, 1000, 600);
		ventana.setVisible(true);
		ventana.setResizable(false);

	}
}