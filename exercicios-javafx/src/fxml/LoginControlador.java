package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("vitorgamming@outlook.com");
		boolean senhaValida = campoSenha.getText().equals("abcd");
		
		if (emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login.fxml")
				.text("Login efetuado com sucesso!")
				.showInformation();
		}else {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login.fxml")
				.text("Usuario e Senha invalidos!")
				.showError();
		}
	}
	
}
