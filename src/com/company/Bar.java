package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bar {
    private Map<String, ICliente> clientes;
    private int cont=0;
    private int contFem=0;
    private SalvarDadosClientes salvar;

    public Bar() {
        this.clientes = new HashMap<>();
    }

    public void addCliente(ICliente cliente){
        clientes.put(cliente.getCpf(), cliente);
        if(cliente.isSocio()) {
        	cont++;
        }
        if(cliente.getGenero() == Genero.Feminino) {
        	contFem++;
        }
        
    }

    public ICliente buscaCliente(String cpf){
        return clientes.get(cpf);
    }
    
    public void removerCliente(String cpf) {
    	clientes.remove(cpf);
    }
    
    public int totalPessoas() {
    	return clientes.size();
    }
    
    public int quantidadeSocios() {
    	return cont;
    }

    public int percentualGenero(Genero genero) {
    	if(genero == Genero.Feminino) {
    		int result;
    		result = (contFem/clientes.size())*100;
    		return result;
    	}
    	
    	return (1-(contFem/clientes.size()))*100;
    }
    
    public void salvar() throws FileNotFoundException, IOException {
    	salvar = new SalvarDadosClientes("clientes");
    	salvar.salvar();
    }

}
