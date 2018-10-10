package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-PU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 1L);
		em.getTransaction().begin();
		cliente.setNome("Beto Silveira");
		cliente.setIdade(28);
		em.getTransaction().commit();
		
		System.out.println("Cliente alterado com sucesso!");
	}

}
