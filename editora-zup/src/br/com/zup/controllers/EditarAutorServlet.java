package br.com.zup.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.conexao.Banco;
import br.com.zup.model.ModelAutor;

@WebServlet("/editarAutor")
public class EditarAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String autorSelecionado = request.getParameter("id");
		Integer id = Integer.valueOf(autorSelecionado);
		String nomeAutor = request.getParameter("nome");
		String emailAutor = request.getParameter("email");
		
		Banco conexao = new Banco();
		ModelAutor modelAutor = conexao.autorFindById(id);
		modelAutor.setNome(nomeAutor);
		modelAutor.setEmail(emailAutor);
		
		response.sendRedirect("listaAutores");
		
	}

}
