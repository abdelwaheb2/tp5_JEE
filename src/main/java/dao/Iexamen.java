package dao;

import java.util.List;
import model.Examen;

public interface Iexamen {
public Examen save(Examen p);
public List<Examen> ExamensParMC(String mc);
public Examen getExamen(Long id);
public Examen updateExamen(Examen p);
public void deleteExamen(Long id);
}