/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.bean;

import java.awt.Image;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author alan
 */
@Entity
@NamedQuery(query = "Select aluno from Aluno aluno where aluno.matricula = :matricula and aluno.senha= :senha",
name = "aluno.logar")



public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Image fotoAluno;
    private String matricula;
    private String nome;
    private String senha;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Image getFotoAluno() {
        return fotoAluno;
    }

    public void setFotoAluno(Image fotoAluno) {
        this.fotoAluno = fotoAluno;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
   
}
