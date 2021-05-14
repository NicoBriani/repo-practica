package isi.died.parcial01.ejercicio02.app;


import java.util.ArrayList;
import java.util.List;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;




public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws InscripcionException {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		
		try {
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		
		DB.guardar(insc);
		
		}catch (BaseDeDatosExcepcion e) {
			e.getMessage();
		}
		
		for (Inscripcion i: a.getMateriasCursadas()){
	            if(i.getMateria() == m)
	            	 if(i.getEstado() != isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado.LIBRE)  
	            		 throw new InscripcionException(); 
		}
	            
	      
	}
		
		
	public void RegistrarNota (Integer nota , Examen e) {
		
		e.setNota(nota);
		Materia m = e.getMateria();
	
		if (nota >= 6)
			
			for (Alumno unAlumno: alumnos) {
				if (unAlumno.equals(e.getAlumno())) 
					for (Inscripcion unaInscripcion: unAlumno.getMateriasCursadas())
						if (unaInscripcion.getMateria().equals(m)) 
							unaInscripcion.setEstado(isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado.PROMOCIONADO);
			}
					
	}
				
			
	
		
		

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	

}
