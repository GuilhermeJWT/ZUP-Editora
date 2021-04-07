package br.com.zup.conexao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.zup.model.ModelAutor;

public class Banco {
	
	public static List<ModelAutor> listaAutores = new ArrayList<>();
	public static Integer idSequencial = 1;
	
	public void adiciona(ModelAutor modelAutor) {
		modelAutor.setId(Banco.idSequencial++);
		listaAutores.add(modelAutor);
	}
	
	public ModelAutor autorFindById(Integer id) {
		
		for (ModelAutor modelAutor : listaAutores) {
			if(modelAutor.getId() == id) {
				return modelAutor;
			}
		}
		return null;
		
	}
	
	public List<ModelAutor> getAutores(){
		return Banco.listaAutores;
	}
	
	public void removerAutor(Integer id) {
		
		Iterator<ModelAutor> repetidor = listaAutores.iterator();
		
		while(repetidor.hasNext()) {
			ModelAutor modelAutor = repetidor.next();
			
			if(modelAutor.getId() == id) {
				repetidor.remove();
			}
			
		}
		
	}

}
