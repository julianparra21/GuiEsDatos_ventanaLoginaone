package Gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaOperaciones extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldNota1;
	private JLabel lblNota2;
	private JTextField textFieldNota2;
	private JLabel lblNota;
	private JTextField textFieldNota3;
	private JLabel lblPromedios;
	private JLabel lblPromedioRes;
	private JLabel lblCantEstudiantes;
	private JLabel lblNumEstudiantes;
	private JButton btnCalcular;
 public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Calcular Promedio Notas");
		lblPromedio.setBounds(180, 11, 116, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(68, 39, 67, 14);
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(145, 36, 226, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(68, 70, 46, 14);
		contentPane.add(lblNota1);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setColumns(10);
		textFieldNota1.setBounds(124, 67, 32, 20);
		contentPane.add(textFieldNota1);
		
		lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(166, 70, 46, 14);
		contentPane.add(lblNota2);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(222, 67, 32, 20);
		contentPane.add(textFieldNota2);
		
		lblNota = new JLabel("Nota 3:");
		lblNota.setBounds(264, 67, 46, 14);
		contentPane.add(lblNota);
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(320, 64, 32, 20);
		contentPane.add(textFieldNota3);
		
		lblPromedios = new JLabel("Promedio: ");
		lblPromedios.setBounds(68, 95, 68, 14);
		contentPane.add(lblPromedios);
		
		lblPromedioRes = new JLabel("");
		lblPromedioRes.setBounds(134, 95, 103, 14);
		contentPane.add(lblPromedioRes);
		
		lblCantEstudiantes = new JLabel("Estudiantes Procesados:");
		lblCantEstudiantes.setBounds(66, 120, 146, 14);
		contentPane.add(lblCantEstudiantes);
		
		lblNumEstudiantes = new JLabel("");
		lblNumEstudiantes.setBounds(222, 120, 46, 14);
		contentPane.add(lblNumEstudiantes);
		
		 btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(330, 95, 89, 23);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==btnCalcular) {
		String nombre=textFieldNombre.getText();
		double n1=Double.parseDouble(textFieldNota1.getText());
		double n2=Double.parseDouble(textFieldNota2.getText());
		double n3=Double.parseDouble(textFieldNota3.getText());
		
		double promedio=(n1+n2+n3)/3;
		
		lblPromedioRes.setText(promedio+"");
	}
}
}
