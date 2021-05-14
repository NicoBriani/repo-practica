package isi.died.parcial01.Ejercicio01;

import java.util.List;
import java.util.stream.Collectors;

public class RRHH {
	
	public List<ReciboSueldo> metodo1 (List<Empleado> listaE){
		
		return listaE
				.stream()
				.map(e -> e.getMiRecibo())
				.collect(Collectors.toList());
	}
	

}
