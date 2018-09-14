package com.company;

public class Main {

    public static void main(String[] args) {
    	Cliente c1 = new Cliente("Patrick", "123456", 19, Genero.Masculino, true);
    	Cliente c2 = new Cliente("John", "654321", 20, Genero.Masculino, false);
    	Cliente c3 = new Cliente("Laura", "864167", 19, Genero.Feminino, true);
    	Cliente c4 = new Cliente("Ana", "018537", 29, Genero.Feminino, true);
    	Cliente c5 = new Cliente("Luiz", "986564", 26, Genero.Masculino, false);
    	
    	Bar meuBar = new Bar();
    	
    	meuBar.addCliente(c1);
    	meuBar.addCliente(c2);
    	meuBar.addCliente(c3);
    	meuBar.addCliente(c4);
    	meuBar.addCliente(c5);
    	
    	System.out.println(meuBar.totalPessoas());
    	System.out.println(meuBar.buscaCliente("123456"));
    	meuBar.removerCliente("986564");
    	System.out.println(meuBar.totalPessoas());
    	System.out.println(meuBar.quantidadeSocios());
    	System.out.println(meuBar.percentualGenero(Genero.Feminino));
    	
    	
    }
}
