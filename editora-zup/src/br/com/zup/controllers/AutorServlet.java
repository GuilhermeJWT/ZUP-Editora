package br.com.zup.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.conexao.Banco;
import br.com.zup.model.ModelAutor;

@WebServlet("/autorServlet")
public class AutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		ModelAutor modelAutor = new ModelAutor();
		modelAutor.setNome(nome);
		modelAutor.setEmail(email);
		
		Banco conexao = new Banco();
		conexao.adiciona(modelAutor);
		
	}

}
