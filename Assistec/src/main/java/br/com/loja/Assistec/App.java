package br.com.loja.Assistec;

import br.com.loja.Assistec.controller.LoginController;
import br.com.loja.Assistec.view.LoginView;

public class App {
    public static void main(String[] args) {
    	LoginView view = new LoginView();
    	@SuppressWarnings("unused")
    	LoginController controller = new LoginController(view);
    	view.setVisible(true);    }
}
