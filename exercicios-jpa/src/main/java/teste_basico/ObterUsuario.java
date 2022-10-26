package teste_basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo_basico.UsuarioJava;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		UsuarioJava usuario = em.find(UsuarioJava.class, 7L);
		System.out.println("O id gerado foi: " + usuario.getId());
		
		em.close();
		emf.close();
	}
}
