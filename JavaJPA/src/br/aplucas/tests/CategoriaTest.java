/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplucas.tests;

import br.aplucas.model.bean.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lucas.pereira
 */
public class CategoriaTest {
    
    public static void main(String[] args) {
        Categoria c = new Categoria(); 
        c.setDescricao("Bebidas");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
    
    
}
