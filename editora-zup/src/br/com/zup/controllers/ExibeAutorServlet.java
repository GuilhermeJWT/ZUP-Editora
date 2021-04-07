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

@WebServlet("/exibeAutor")
public class ExibeAutorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String autorSelecionado = request.getParameter("id");
		Integer id = Integer.valueOf(autorSelecionado);
		
		Banco conexao = new Banco();
		ModelAutor modelAutor = conexao.autorFindById(id);
		
		request.setAttribute("autor", modelAutor);
		RequestDispatcher retorno = request.getRequestDispatcher("/editarAutores.jsp");
		retorno.forward(request, response);
	
	}

}
