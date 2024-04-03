package web;

import java.util.ArrayList;
import java.util.List;

import model.Examen;

public class ExamenModele {
	private String motCle;
	private List<Examen> Examens = new ArrayList<>();
	
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Examen> getExamens() {
		return Examens;
	}
	public void setExamens(List<Examen> Examens) {
		this.Examens = Examens;
	}
	
	

}
