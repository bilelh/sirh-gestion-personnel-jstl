package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreerCollaborateurController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
		.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
		.forward(req, resp);
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		LocalDate dateDeNaissance = LocalDate.parse(req.getParameter("dateDeNaissance"));
		String adresse = req.getParameter("adresse");
		String secu = req.getParameter("secu");
		
		String matricule= "0001";
		
		ZonedDateTime dateHeureCreation;
		String emailPro = prenom+"."+nom+"@societe.com";
		boolean actif = true;
		
		
	}

}
