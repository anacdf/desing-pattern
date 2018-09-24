package com.company;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class SalvarDadosClientes implements ISalvarDadosClientes {
	private Bar bar;
	private String nomeArquivo;
	
	public SalvarDadosClientes(String nomeArquivo) throws FileNotFoundException, IOException {
		bar = new Bar();
		this.nomeArquivo = nomeArquivo;
	}
	
	public void salvar() throws FileNotFoundException, IOException {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(nomeArquivo + ".txt"), "utf-8"))) {
	   writer.write(bar.toString());
		}
	}
}
