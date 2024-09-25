package br.com.loja.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JLabel lblStatus;
	public JTextField txtUsuario;
	public JPasswordField txtSenha;
	public JButton btLogar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);

		JLabel lblUsuario = new JLabel("Usuário:");
		springLayout.putConstraint(SpringLayout.NORTH, lblUsuario, 78, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblUsuario, 96, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblUsuario);

		txtUsuario = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtUsuario, 6, SpringLayout.EAST, lblUsuario);
		springLayout.putConstraint(SpringLayout.SOUTH, txtUsuario, 0, SpringLayout.SOUTH, lblUsuario);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		springLayout.putConstraint(SpringLayout.NORTH, lblSenha, 26, SpringLayout.SOUTH, lblUsuario);
		springLayout.putConstraint(SpringLayout.WEST, lblSenha, 0, SpringLayout.WEST, lblUsuario);
		getContentPane().add(lblSenha);

		txtSenha = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, txtSenha, 23, SpringLayout.SOUTH, txtUsuario);
		springLayout.putConstraint(SpringLayout.WEST, txtSenha, 8, SpringLayout.EAST, lblSenha);
		springLayout.putConstraint(SpringLayout.EAST, txtSenha, 0, SpringLayout.EAST, txtUsuario);
		getContentPane().add(txtSenha);

		btLogar = new JButton("Logar");
		springLayout.putConstraint(SpringLayout.WEST, btLogar, 165, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btLogar, -25, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(btLogar);

		lblStatus = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblStatus, -27, SpringLayout.NORTH, btLogar);
		springLayout.putConstraint(SpringLayout.EAST, lblStatus, 0, SpringLayout.EAST, btLogar);
		getContentPane().add(lblStatus);

	}
}
