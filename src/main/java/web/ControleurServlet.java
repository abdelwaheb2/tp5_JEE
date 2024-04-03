package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.Iexamen;
import dao.Examen_Impl;
import model.Examen;

@SuppressWarnings("serial")
@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControleurServlet extends HttpServlet {
	
	 Iexamen exam;
	 @Override
	public void init() throws ServletException {
		exam = new Examen_Impl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			             HttpServletResponse response) 
			            throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/index.do"))
		{
			ExamenModele model= new ExamenModele(); 
			model.setMotCle("");
			List<Examen> exams = exam.ExamensParMC("");
			model.setExamens(exams);
			request.setAttribute("model", model);
			request.getRequestDispatcher("examens.jsp").forward(request,response);
		}
		else if (path.equals("/chercher.do"))
		{
			String motCle=request.getParameter("motCle");
			ExamenModele model= new ExamenModele(); 
			model.setMotCle(motCle);
			List<Examen> exams = exam.ExamensParMC(motCle);
			model.setExamens(exams);
			request.setAttribute("model", model);
			request.getRequestDispatcher("examens.jsp").forward(request,response);
		}
		else if (path.equals("/saisie.do")  )
		{
			request.getRequestDispatcher("saisieExamen.jsp").forward(request,response);
		}
		else if (path.equals("/save.do")  && request.getMethod().equals("POST"))
		{
		    String matiere=request.getParameter("matiere");
			double note = Double.parseDouble(request.getParameter("note"));
			String etudiant=request.getParameter("etudiant");
			double coffetion = Double.parseDouble(request.getParameter("coffetion"));
			double dure = Double.parseDouble(request.getParameter("dure"));
			Examen p = exam.save(new Examen(matiere, note, coffetion, etudiant, dure));
			request.setAttribute("examen", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else if (path.equals("/supprimer.do"))
		{
		    Long id= Long.parseLong(request.getParameter("id"));
		    exam.deleteExamen(id);
		    response.sendRedirect("chercher.do?motCle=");
					
			//request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else if (path.equals("/editer.do")  )
		{
			Long id= Long.parseLong(request.getParameter("id"));
		    Examen e = exam.getExamen(id);
		    request.setAttribute("examen", e);
			request.getRequestDispatcher("editerExamen.jsp").forward(request,response);
		}
		else if (path.equals("/update.do")  )
		{
			 Long id = Long.parseLong(request.getParameter("id"));
			 String matiere=request.getParameter("matiere");
			double note = Double.parseDouble(request.getParameter("note"));
			String etudiant=request.getParameter("etudiant");
			double coffetion = Double.parseDouble(request.getParameter("coffetion"));
			double dure = Double.parseDouble(request.getParameter("dure"));
			 Examen p = new Examen();
			 p.setId(id);
			p.setCoffetion(coffetion);
			p.setDure(dure);
			p.setEtudiant(etudiant);
			p.setMatiere(matiere);
			p.setNote(note);
			 exam.updateExamen(p);
			 request.setAttribute("examen", p);
			 request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else
		{
			response.sendError(Response.SC_NOT_FOUND);	
		}	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}