package br.com.zup.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.conexao.Banco;

@WebServlet("/removerAutor")
public class RemoveAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String autorSelecionado = request.getParameter("id");
		Integer id = Integer.valueOf(autorSelecionado);
		
		Banco conexao = new Banco();
		conexao.removerAutor(id);
		
		response.sendRedirect("listaAutores");
		
	}

}
