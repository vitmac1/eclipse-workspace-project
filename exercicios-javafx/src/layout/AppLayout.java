package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.Scene;
//import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{

	private Stage Janela;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		@SuppressWarnings("unused")
		Parent raiz = null;
		
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGridPane();
		raiz = new TesteStackPane();
		raiz = new TesteTilePane();
		
		Scene principal = new Scene(new TesteTilePane(), 800, 600);
		
		Janela = primaryStage;
		Janela.setScene(principal);
		Janela.setTitle("Gerenciador de Layout");
		Janela.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
