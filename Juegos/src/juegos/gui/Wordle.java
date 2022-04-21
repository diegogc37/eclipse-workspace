package juegos.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Wordle {

	private JFrame frmWordle;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wordle window = new Wordle();
					window.frmWordle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Wordle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordle = new JFrame();
		frmWordle.setTitle("WORDLE");
		frmWordle.setBounds(150, 100, 450, 450);
		frmWordle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(113, 37, 38, 38);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 37, 38, 38);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 37, 38, 38);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(245, 37, 38, 38);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(289, 37, 38, 38);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 81, 38, 38);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 81, 38, 38);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(201, 81, 38, 38);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(245, 81, 38, 38);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(289, 81, 38, 38);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(113, 124, 38, 38);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(157, 124, 38, 38);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(201, 124, 38, 38);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(245, 124, 38, 38);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(289, 124, 38, 38);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(113, 218, 38, 38);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(157, 218, 38, 38);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(201, 218, 38, 38);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(245, 218, 38, 38);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(289, 218, 38, 38);
		textField_19.setColumns(10);
		frmWordle.getContentPane().setLayout(null);
		frmWordle.getContentPane().add(textField);
		frmWordle.getContentPane().add(textField_1);
		frmWordle.getContentPane().add(textField_2);
		frmWordle.getContentPane().add(textField_3);
		frmWordle.getContentPane().add(textField_4);
		frmWordle.getContentPane().add(textField_5);
		frmWordle.getContentPane().add(textField_6);
		frmWordle.getContentPane().add(textField_7);
		frmWordle.getContentPane().add(textField_8);
		frmWordle.getContentPane().add(textField_9);
		frmWordle.getContentPane().add(textField_10);
		frmWordle.getContentPane().add(textField_11);
		frmWordle.getContentPane().add(textField_12);
		frmWordle.getContentPane().add(textField_13);
		frmWordle.getContentPane().add(textField_14);
		frmWordle.getContentPane().add(textField_15);
		frmWordle.getContentPane().add(textField_16);
		frmWordle.getContentPane().add(textField_17);
		frmWordle.getContentPane().add(textField_18);
		frmWordle.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(113, 169, 38, 38);
		frmWordle.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(157, 169, 38, 38);
		frmWordle.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(201, 169, 38, 38);
		frmWordle.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(245, 169, 38, 38);
		frmWordle.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(289, 169, 38, 38);
		frmWordle.getContentPane().add(textField_24);
		
		JLabel lblNewLabel_1 = new JLabel("Conjetura:");
		lblNewLabel_1.setBounds(46, 322, 78, 23);
		frmWordle.getContentPane().add(lblNewLabel_1);
		
		textField_25 = new JTextField();
		textField_25.setBounds(113, 323, 214, 20);
		frmWordle.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(162, 354, 89, 23);
		frmWordle.getContentPane().add(btnNewButton);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(113, 267, 38, 38);
		frmWordle.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(157, 267, 38, 38);
		frmWordle.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(201, 267, 38, 38);
		frmWordle.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(245, 267, 38, 38);
		frmWordle.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(289, 267, 38, 38);
		frmWordle.getContentPane().add(textField_30);
		
		JButton btnNewButton_1 = new JButton("Ayuda");
		btnNewButton_1.setBounds(342, 11, 70, 23);
		frmWordle.getContentPane().add(btnNewButton_1);
	}
}
