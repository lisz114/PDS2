package br.com.loja.assistec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.view.ListarUsuariosView;

public class ListarUsuarioController {

	private ListarUsuariosView listarView;
	
	public ListarUsuarioController() {
		listarView = new ListarUsuariosView();
		listarView.setLocationRelativeTo(null);
		listaView.setVisible(true);
		configurarListeners();
		carregarUsuarios();
	}
	
	public void configurarListeners() {
		listarView.addListarUsuariosListener(new ListarUsuariosListener());
		listarView.addWindowListener(new JanelaAberturaListener());
	}
	
	public void carregarUsuarios() {
		
	}
	
}

	private class ListarUsuariosListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();
			switch(comando) {
			case "BotaoCadastrarAction":
				abrirCadastroUsuario(null);
				break;
			case "BotaoFecharAction":
				listarView.dispose();
				break;
			default:
				break;
			}
		}
		
		public void abrirCadastroUsuario(Usuario usuarioSelecionado) {
			
		}
		
	}