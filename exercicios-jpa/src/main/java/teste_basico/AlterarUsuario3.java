package teste_basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo_basico.UsuarioJava;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		UsuarioJava usuario = em.find(UsuarioJava.class, 7L);
		// Tira o objeto gerenciado
		em.detach(usuario);
		
		usuario.setNome("NomeAlterado");
		usuario.setEmail("nome@hotmail.com");
		
//		em.merge(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
