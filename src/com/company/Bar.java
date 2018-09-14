package com.company;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Bar {
    private Map<String, Cliente> clientes;
    private int cont=0;
    private int contFem=0;

    public Bar() {
        this.clientes = new HashMap<>();
    }

    public void addCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
        if(cliente.isSocio()) {
        	cont++;
        }
        if(cliente.getGenero() == Genero.Feminino) {
        	contFem++;
        }
    }

    public Cliente buscaCliente(String cpf){
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
    
    public void salvar(Bar bar, String nomeArquivo) throws FileNotFoundException, IOException {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(nomeArquivo + ".txt"), "utf-8"))) {
	   writer.write(bar.toString());
		}
	}

}
