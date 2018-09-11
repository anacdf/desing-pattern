package com.company;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    private Map<String, Cliente> clientes;

    public Bar() {
        this.clientes = new HashMap<>();
    }

    public void addCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscaCliente(String cpf){
        return clientes.get(cpf);
    }


}
