package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 


@SuppressWarnings("serial")
@Entity
@Table(name = "examan")
public class Examen implements Serializable{
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long id;
private String matiere;
private double note;
private double coffetion;
private String etudiant;
private double dure;

public Examen() {
super();
}
public Examen(String matiere, double note, double coffetion, String etudiant, double dure) {
	super();
	this.matiere = matiere;
	this.note = note;
	this.coffetion = coffetion;
	this.etudiant = etudiant;
	this.dure = dure;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMatiere() {
	return matiere;
}
public void setMatiere(String matiere) {
	this.matiere = matiere;
}
public double getNote() {
	return note;
}
public void setNote(double note) {
	this.note = note;
}
public double getCoffetion() {
	return coffetion;
}
public void setCoffetion(double coffetion) {
	this.coffetion = coffetion;
}
public String getEtudiant() {
	return etudiant;
}
public void setEtudiant(String etudiant) {
	this.etudiant = etudiant;
}
public double getDure() {
	return dure;
}
public void setDure(double dure) {
	this.dure = dure;
}

}