package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numero1 = new JTextField();
		numero1.setBounds(114, 11, 86, 20);
		frame.getContentPane().add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(114, 42, 86, 20);
		frame.getContentPane().add(numero2);
		numero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero 1");
		lblNewLabel.setBounds(20, 14, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1.setBounds(20, 45, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultadoSuma =Integer.parseInt(numero1.getText())+Integer.parseInt(numero2.getText());
				resultado.setText(Integer.toString(resultadoSuma));
			}
		});
		btnNewButton.setBounds(20, 97, 151, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resta");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultadoSuma =Integer.parseInt(numero1.getText())-Integer.parseInt(numero2.getText());
				resultado.setText(Integer.toString(resultadoSuma));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(20, 170, 151, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicacion");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultadoSuma =Integer.parseInt(numero1.getText())*Integer.parseInt(numero2.getText());
				resultado.setText(Integer.toString(resultadoSuma));
			}
		});
		btnNewButton_2.setBounds(216, 97, 151, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(Integer.parseInt(numero2.getText())<0 || Integer.parseInt(numero2.getText())>Integer.parseInt(numero1.getText())) {
					System.err.println("ERROR No se puede dividir por un numero inferior a cero o superior a l denominador");
				}else {
					int resultadoSuma =Integer.parseInt(numero1.getText())/Integer.parseInt(numero2.getText());
					resultado.setText(Integer.toString(resultadoSuma));
				}
				
			}
		});
		btnNewButton_3.setBounds(216, 170, 151, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(307, 24, 86, 20);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(247, 27, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
