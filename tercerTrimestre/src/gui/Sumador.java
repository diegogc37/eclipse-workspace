package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sumador {

	private JFrame frame;
	private JTextField sumando1;
	private JTextField sumando2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sumador window = new Sumador();
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
	public Sumador() {
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
		
		JLabel siumbolo = new JLabel("+");
		siumbolo.setBounds(73, 45, 72, 14);
		frame.getContentPane().add(siumbolo);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultadoSuma =Integer.parseInt(sumando1.getText())+Integer.parseInt(sumando2.getText());
				resultado.setText(Integer.toString(resultadoSuma));
			}
		});
		btnNewButton.setBounds(137, 41, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		sumando1 = new JTextField();
		sumando1.setBounds(30, 35, 33, 34);
		frame.getContentPane().add(sumando1);
		sumando1.setColumns(10);
		
		sumando2 = new JTextField();
		sumando2.setBounds(94, 35, 33, 34);
		frame.getContentPane().add(sumando2);
		sumando2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(193, 35, 33, 34);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
	}
}
