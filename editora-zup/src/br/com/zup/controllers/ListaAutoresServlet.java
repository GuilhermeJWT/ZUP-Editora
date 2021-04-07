package br.com.zup.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.conexao.Banco;
import br.com.zup.model.ModelAutor;

@WebServlet("/listaAutores")
public class ListaAutoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco conexao = new Banco();
		List<ModelAutor> listaAutores = conexao.getAutores();
		
		RequestDispatcher retorno = request.getRequestDispatcher("/listaAutores.jsp");
		request.setAttribute("autores", listaAutores);
		retorno.forward(request, response);
	
	}

}
