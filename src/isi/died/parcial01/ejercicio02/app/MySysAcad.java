package isi.died.parcial01.ejercicio02.app;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;



public interface MySysAcad {
	
	public void registrarMateria(Materia d);
	
	
	public void registrarDocente(Docente d) ;
	
	
	public void registrarAlumnos(Alumno d);
	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoCursada(Docente d,Alumno a, Materia m,Integer cicloLectivo);

	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoExamen(Docente d,Alumno a, Materia m);
	
	
	public static List<Materia> materiasAprobadas(Alumno m) {
		
		Predicate <Inscripcion> filtro = i-> i.getEstado().equals(Estado.PROMOCIONADO);
		
		return (List<Materia>) m.getMateriasCursadas()
				.stream()
				.filter(filtro)
				.sorted( (i1, i2) -> (Integer)(i1.getNota() - i2.getNota()))
				.map (i -> i.getMateria())
				.collect(Collectors.toList());
	}
	
	
	
	
	

}
