/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.connecta.ConnectionFactory;
import com.mycompany.model.bean.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author alan
 */
public class alunoDAO {
    
    public Aluno salva(Aluno aluno){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            em.getTransaction().begin();
            if(aluno.getId()==null){
            em.persist(aluno);
            }else{
             em.merge(aluno);
            }
            
            em.getTransaction().commit();
        
            
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
                       
    return aluno;
}
    
    
    public Aluno findById(Integer id){
    
        EntityManager em = new ConnectionFactory().getConnection();
        Aluno aluno = null;
        try{
            aluno = em.find(Aluno.class, id);
        }catch(Exception e){
            System.err.print(e);
        }finally{
            em.close();
        }
            
           
        return aluno;
    }
    
    
    public List<Aluno> findAll(){
        
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Aluno> alunos = null;
        
        try{
            
            alunos = em.createQuery("from aluno c").getResultList();
            
        }catch(Exception e){
        }finally{
            
        }
        
        
        
        return alunos;
    }
    
    
    public List<Aluno> Buscar(String tipo,String matricula, String senha){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Aluno> alunos = null;
        if(tipo.equals("login")){
            try{
               em.getTransaction().begin();
             Query query = em.createNamedQuery("aluno.logar");
             query.setParameter("matricula",matricula);
             query.setParameter("senha", senha);
                em.getTransaction().commit();

                alunos = query.getResultList();
            }catch(Exception e){


            }finally{
                em.close();
            }
        }
        
        return alunos;
    }
    
    
    
}
