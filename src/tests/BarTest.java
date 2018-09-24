package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.Bar;
import com.company.Genero;

class BarTest {
	static Bar target;
	static ClienteDuble cliente;
	
	@BeforeEach
	void setUp() throws Exception {
	
		target = new Bar();
		cliente = new ClienteDuble("teste", "123", 30, Genero.Feminino, true);
		
	}

	@Test
	void testAdicionarCliente() {
		target.addCliente(cliente);
		
		assertNotNull(target.totalPessoas());
	}
	
	@Test
	void testAdicionarClienteEhSocio() {
		target.addCliente(cliente);
		int quantidade = target.quantidadeSocios();
		
		assertEquals(1, quantidade);
	}
	
	@Test
	void testAdicionarClienteEhFeminino() {
		target.addCliente(cliente);
		int quantidade = target.percentualGenero(Genero.Feminino);
		
		assertEquals(100, quantidade);
	}
	
	@Test
	void testAdicionarClienteEhMasculino() {
		target.addCliente(cliente);
		int quantidade = target.percentualGenero(Genero.Masculino);
		
		assertEquals(0, quantidade);
	}
	
	

}


/*

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
*/