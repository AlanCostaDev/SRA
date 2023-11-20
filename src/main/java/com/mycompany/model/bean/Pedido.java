/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery; 

/**
 *
 * @author alan
 */
@Entity

public class Pedido implements Serializable {

    @Id
    private Long id;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dias;
    private String hora;
    private boolean lanche;
    private boolean almoco;

    @ManyToOne
    private Aluno aluno;
    
    //construtor 
    public Pedido(String dias, String hora, boolean lanche, boolean almoco, Aluno aluno){
        this.dias  = dias;
        this.hora = hora;
        this.lanche = lanche;
        this.almoco = almoco;
        this.aluno = aluno;
        
    }
    
    //getters e setters
    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public String getdias(){
        return dias;
    }
    
    public void setDias(String dias){
        this.dias = dias;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void sethora(String hora){
        try {
            //verificação de validade para a hora
            if(hora.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) { 
            this.hora = hora;
        }else{
                throw new  IllegalArgumentException("Formato de hora inválido");
                }
        }catch(Exception e){
                //lidar com a exceção(por exemplo, registrar ou relançar)
                }
    }
        
    public boolean islanche(){
        return lanche;
    }
    
    public void setlanche(boolean lanche){
        this.lanche = lanche;
    }
    
    public boolean isAlmoco(){
        return almoco;
    }
    
    public Aluno getaluno(){
        return aluno;
    }
    
    public void setaluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    //metodo auxiliar para calcular o total do pedido
    public double calcularTotalPedido(){
        double total = 0.0;
        //logica para calcular o total com base nos itens do pedido
        return total;
    }
    
    
    
}
