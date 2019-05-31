package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");
		resp.setContentType("text/html");
		if(req.getParameter("matricule")==null) {
			resp.setStatus(400);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" 
					+ "<ul>" 
					+ "<li>code= 400 </li>" 
					+ "<li>Un matricule est attendu</li>" 
					+ "</ul>");
		}else {
			// code HTML ecrit dans le corps de la reponse
			resp.setStatus(200);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" 
			+ "<ul>" 
			+ "<li>Matricule:" + matriculeParam+ "</li>" 
			+ "</ul>");
		}
	}
}
