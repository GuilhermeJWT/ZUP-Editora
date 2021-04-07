package br.com.zup.conexao;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.model.ModelAutor;

public class Banco {
	
	public static List<ModelAutor> listaAutores = new ArrayList<>();
	public static Integer idSequencial = 1;
	
	public void adiciona(ModelAutor modelAutor) {
		modelAutor.setId(Banco.idSequencial++);
		listaAutores.add(modelAutor);
	}

}
