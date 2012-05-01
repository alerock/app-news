package br.fucapi.workshop.app_news.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flexjson.JSONSerializer;

import br.fucapi.workshop.app_news.GeradorNoticia;

/**
 * Servlet implementation class NewsServlet
 */
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("application/json");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print(new JSONSerializer().exclude("class", "description").
				serialize(GeradorNoticia.listNoticias()));
		printWriter.flush();
		printWriter.close();
	}

}
