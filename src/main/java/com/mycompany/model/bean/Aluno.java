/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.bean;

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
    
    private String matricula;
    private String nome;
    private String senha;
    private String turno;
    private String turma;
    private String Cpf;
    private String comprovantederesidência;
    
    
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public String getCpf (String Cpf) {
        return Cpf;
    }
    
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public String getcomprovantederesidência(String comprovantederesidência){
        return comprovantederesidência;
    }
    
    public void setcomprovantederesidência(String comprovantederesidência){
        this.comprovantederesidência = comprovantederesidência;
    }
}


    



 

  

   

    
   
    
   

