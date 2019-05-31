package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		if(req.getParameter("matricule")==null 
				|| req.getParameter("titre")==null 
				|| req.getParameter("nom")==null 
				|| req.getParameter("prenom")==null) {
			List incorrect = new ArrayList();
			
				if(req.getParameter("matricule")==null) {
					incorrect.add("matricule");
				}
				if (req.getParameter("titre")==null) {
					incorrect.add("titre");
				}
				if (req.getParameter("nom")==null) {
					incorrect.add("nom");
				}
				if (req.getParameter("prenom")==null) {
					incorrect.add("prenom");
				}
			
			resp.setStatus(400);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" 
					+ "<ul>"
					+ "<li>Les parametres suivants sont incorrects: " + incorrect + "</li>" 
					+ "</ul>");
			
		}else {
			// code HTML ecrit dans le corps de la reponse
			resp.setStatus(201);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" 
			+ "<ul>" 
			+ "<li>Matricule =" + matriculeParam+ ", titre = " + titreParam 
			+ ", nom = " + nomParam + ", prenom = " + prenomParam + "</li>" 
			+ "</ul>");
		}
		
	}
	
	
	
}
