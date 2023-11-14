/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.connecta.ConnectionFactory;
import com.mycompany.model.bean.Pedido;
import javax.persistence.EntityManager;

/**
 *
 * @author alan
 */
public class PedidoDAO {
    
    public Pedido salvar(Pedido pedido){
        EntityManager em = new ConnectionFactory().getConnection();
              
        
        try{
            em.getTransaction().begin();
            if(pedido.getId()==null){
            em.persist(pedido);
            }else{
             em.merge(pedido);
            }
            
            em.getTransaction().commit();
        
            
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return pedido;
    }
    
    
    
    
    
}
