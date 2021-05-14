package isi.died.parcial01.Ejercicio01;


import java.time.LocalDate;

public class EmpJerarquico extends Empleado {
	
	
	public EmpJerarquico(String nombre,ReciboSueldo r ) {
		
		super.nombre = nombre;
		super.miRecibo = r; 
	}
	

	@Override
	public double sueldo(double basico) {
		
		double miSueldo = basico ; 
		
		miSueldo -= basico*0.05; 
		miSueldo += basico*0.08;
		
		double gastos = 0; 
		
		for (Gasto misGastos: super.misGastos) 
				gastos+=misGastos.getMonto();
	
		gastos += gastos*0.1;
		
		LocalDate i1 = LocalDate.now();
		
		if (i1.getMonthValue() == 3)
			miSueldo += basico*0.5;
	
	
		return miSueldo + gastos;
	}
	
	


}
