package isi.died.parcial01.Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class App {

	ReciboSueldo r1 = new ReciboSueldo (2,2000);
	ReciboSueldo r2 = new ReciboSueldo (2,2000);
	ReciboSueldo r3 = new ReciboSueldo (2,2000);
	ReciboSueldo r4 = new ReciboSueldo (2,2000);
	
	
	Empleado e1 = new EmpEfectivo ("Nico",r1);
	Empleado e2 = new EmpEfectivo ("Pedro",r2);
	
	Empleado e3 = new EmpJerarquico("Maria",r3);
	Empleado e4 = new EmpJerarquico ("Marta",r4);
	
	ArrayList<Empleado> prueba = new ArrayList<Empleado>();
	
	
	
	
	
	
	RRHH recursos1 = new RRHH();
	
	
	
	
	
}
