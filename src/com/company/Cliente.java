package com.company;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private Genero genero;
    private boolean socio;

    public Cliente(String nome, String cpf, int idade, Genero genero, boolean socio) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.socio = socio;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }


    public int getIdade() {
        return idade;
    }



    public Genero getGenero() {
        return genero;
    }


    public boolean isSocio() {
        return socio;
    }

}
