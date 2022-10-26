package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
	
		String nomeEntrada = "";
		Integer codigoEntrada = 0;
		
		String SQL = "SELECT codigo, nome FROM pessoa WHERE codigo = ?";
		String Update = "UPDATE pessoa SET nome = ? WHERE codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Informe o codigo a ser pesquisado: ");
		codigoEntrada = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(SQL);
		stmt.setInt(1, codigoEntrada);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O codigo da pessoa e: " + p.getCodigo());
			System.out.println("O nome atual e:" + p.getNome());
			entrada.nextLine();
		
			System.out.println("Informe o nome a ser atualizado: ");
			nomeEntrada = entrada.nextLine();
		
			stmt.close();
			stmt = conexao.prepareStatement(Update);
			stmt.setString(1, nomeEntrada);
			stmt.setInt(2, codigoEntrada);
			stmt.execute();
			
			System.out.println("Pessoa atualizada com sucesso!");
		}else {
			System.out.println("Pessoa nao encontrada!");
		}
		
		conexao.close();
		entrada.close();
	}
}
