package br.com.loja.Assistec.controller;

import javax.swing.JOptionPane;

import br.com.loja.Assistec.model.UsuarioModel;
import br.com.loja.Assistec.view.LoginView;

public class LoginController {

	private LoginView view;
	private UsuarioModel model;

	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
	
		if(model.conexao != null) {
			view.lblStatus.setText("Conectado ao banco de dados!");
		}else {
			view.lblStatus.setText("Não Conectado no banco de dados.");
		}
		
		this.view.btLogar.addActionListener(e -> logar());
	}
	
	public void logar() {
		String login = view.txtUsuario.getText();
		String senha = new String(view.txtSenha.getPassword());
		String perfil = model.autenticar(login, senha);

	if(perfil != null) {
		JOptionPane.showMessageDialog(null, "Usuário pode acessar o sistema.");
	}else {
		JOptionPane.showMessageDialog(null, "Dados Inválidos.");
	}
		
	}

}
