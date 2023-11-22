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
import javax.persistence.NamedQuery;

/**
 *
 * @author alan
 */
@Entity
@NamedQuery(query = "Select aluno from Aluno aluno where aluno.matricula = :matricula and aluno.senha= :senha",
name = "aluno.logar")



public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    private String matricula;
    private String nome;
    private String senha;
    private String turno;
    private String turma;
    private String disciplina;
    private Integer sala; 
    private Integer cpf;
    private Integer nota;
    private Integer falta;
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
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

      public String getdisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
  
    public Integer getSala() {
        return sala;
    }

    public void setsala(Integer sala) {
        this.sala = sala;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setcpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getNota() {
        return nota;
    }

    public void setnota(Integer nota) {
        this.nota = nota;
    }

    public Integer getfalta() {
        return falta;
    }

    public void setfalta(Integer falta) {
        this.falta = falta;
    }
   
    
   
}
