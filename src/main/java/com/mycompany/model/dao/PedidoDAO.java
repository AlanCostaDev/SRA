/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.connecta.ConnectionFactory;
import com.mycompany.model.bean.Aluno;
import com.mycompany.model.bean.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
    
    
    public List<Pedido> Buscar(Integer idaluno, String data){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Pedido> pedido = null;
        
            try{
               em.getTransaction().begin();
               
             Query query = em.createNamedQuery("pedido.buscar");
             query.setParameter("idaluno",idaluno);
             query.setParameter("dia",data);
                em.getTransaction().commit();

                pedido = query.getResultList();
            }catch(Exception e){


            }finally{
                em.close();
            }
        
        
        return pedido;
    }
    public List<Pedido> BuscarData( String data){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Pedido> pedido = null;
        
            try{
               em.getTransaction().begin();
               
             Query query = em.createNamedQuery("pedido.data");
             
             query.setParameter("dia",data);
                em.getTransaction().commit();

                pedido = query.getResultList();
            }catch(Exception e){


            }finally{
                em.close();
            }
        
        
        return pedido;
    }
    
    
}
