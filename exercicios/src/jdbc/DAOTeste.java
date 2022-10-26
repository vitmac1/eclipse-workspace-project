package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String SQL = "INSERT INTO pessoa (nome) VALUES (?)";
		System.out.println(dao.incluir(SQL, "Joao Tavares"));
		System.out.println(dao.incluir(SQL, "Guilherme Zanella"));
		System.out.println(dao.incluir(SQL, "Ana Julia"));

		dao.close();
		
	}
}
