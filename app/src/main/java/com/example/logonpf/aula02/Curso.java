package com.example.logonpf.aula02;

/**
 * Created by usuario on 22/03/2017.
 */

public class Curso {

    private final String nome;
    private final String curso;
    private final String periodo;

    public Curso(String nome, String curso, String periodo) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getPeriodo() {
        return periodo;
    }
}
