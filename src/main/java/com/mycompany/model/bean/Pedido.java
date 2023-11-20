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

/**
 *
 * @author alan
 */
@Entity

public class Pedido implements Serializable {

    @Id
    private Long id;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dia;
    private String hora;
    private boolean lanche;
    private boolean almoco;

    @ManyToOne
    private Aluno aluno;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isLanche() {
        return lanche;
    }

    public void setLanche(boolean lanche) {
        this.lanche = lanche;
    }

    public boolean isAlmoco() {
        return almoco;
    }

    public void setAlmoco(boolean almoco) {
        this.almoco = almoco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    
    
}
