package isi.died.parcial01.Ejercicio01;

import java.time.LocalDate;
import java.util.List;

public abstract class Empleado {
	
	protected int dni; 
	protected String nombre;
	protected LocalDate fechaContratacion;
	protected String correo; 
	protected List <Gasto> misGastos; 
	protected ReciboSueldo miRecibo; 
	
	
	public ReciboSueldo getMiRecibo() {
		return miRecibo;
	}

	public abstract double sueldo (double basico);
	
	
	
	
}
