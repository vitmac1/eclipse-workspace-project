package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o codigo da pessoa a ser DELETADA :d");
		Integer codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String SQL = "DELETE FROM pessoa WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(SQL);
		stmt.setInt(1, codigo);
	
		Integer contador = stmt.executeUpdate(); 
		if (contador>0) {
			System.out.println("Atualizacao Sucessfull!");
		}else {
			System.out.println("Erro!");
		}
		
		System.out.println("Linhas Afetadas: " + contador);
		
		
		conexao.close();
		entrada.close();
	}
}
