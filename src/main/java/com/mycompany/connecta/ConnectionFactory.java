/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connecta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alan
 */
public class ConnectionFactory {
    private static  EntityManagerFactory emf = Persistence.createEntityManagerFactory("conectajpa");
    
    
    public EntityManager getConnection(){
        
        return emf.createEntityManager();
    }
    
    
    
    
    
    
    
    
    
}

