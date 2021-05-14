package isi.died.parcial01.Ejercicio01;

import java.time.LocalDate;

public class EmpEfectivo extends Empleado {
	
	public EmpEfectivo(String nombre,ReciboSueldo r ) {
		
		super.nombre = nombre;
		super.miRecibo = r; 
	}
	
	
	


	@Override
	public double sueldo(double basico) {
		
		double miSueldo = basico; 
	
		miSueldo -= basico*0.11; // menos el 11%
		miSueldo -= miSueldo*0.03; // menos el 3% (No especifica si del total del basico o del sueldo dsp del 11%
		
		double gastos = 0; 
		for (Gasto misGastos: super.misGastos) 
			if (misGastos.isFlag())
				gastos+=misGastos.getMonto();

		
		LocalDate i1 = LocalDate.now();
		
		if (i1.getMonthValue() == 3)
			miSueldo += basico*0.5;
	
		return miSueldo + gastos;
	}
	
	
	
	

	
	
}
