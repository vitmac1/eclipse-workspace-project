package teste_basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo_basico.UsuarioJava;

public class ObterUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "select u from Usuario u";
//		TypedQuery<UsuarioJava> query = em.createQuery(jpql, UsuarioJava.class);
//		query.setMaxResults(5);
		
		List<UsuarioJava> usuarios = em
				.createQuery("select u from UsuarioJava u", UsuarioJava.class)
				.setMaxResults(5)
				.getResultList();
		
		for (UsuarioJava usuario : usuarios) {
			System.out.println("ID: " + usuario.getId()
					+ "E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
