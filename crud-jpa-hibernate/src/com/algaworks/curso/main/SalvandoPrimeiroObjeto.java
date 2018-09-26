package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.algaworks.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args)  {
		

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-PU");
			EntityManager em = emf.createEntityManager();
			
			
			Cliente cliente = new Cliente();
			cliente.setNome("Ana Maria");
			cliente.setIdade(19);
			cliente.setSexo("F");
			cliente.setProfissao("Estudante");
			
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			
			System.out.println("Cliente salvo com sucesso!");
			
			
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
//		EntityManager em = emf.createEntityManager();
		
//			Cliente cliente = new Cliente();
//			cliente.setNome("Pedro Bial");
//			cliente.setIdade(40);
//			cliente.setProfissao("Jornalista");
//			cliente.setSexo("M");
//			
//			em.getTransaction().begin();
//			em.persist(cliente);
//			em.getTransaction().commit();
//			
//			System.out.println("Cliente Salvo!!!");
			
		
		
//		try {
//			Cliente cliente = new Cliente();
//			cliente.setNome("Pedro Bial");
//			cliente.setIdade(40);
//			cliente.setProfissao("Jornalista");
//			cliente.setSexo("M");
//			
//			em.getTransaction().begin();
//			em.persist(cliente);
//			em.getTransaction().commit();
//			
//			System.out.println("Cliente Salvo!!!");
//			
//		} catch (Exception exp) {
//			exp.printStackTrace();
////			System.out.println(e);
//			System.out.println("///////////////////////////////////");
//			
//		}
		
		
//		JAXBException
		
//		javax.persistence.PersistenceException: Unable to locate persistence units
		
//		em.close();
	}

}
