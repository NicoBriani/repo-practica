package isi.died.parcial01.Ejercicio01;

public class Gasto {
	
	private double monto;
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	private int numeroComprobante; 
	private String descripcion; 
	private boolean flag;
	public int getNumeroComprobante() {
		return numeroComprobante;
	}
	public void setNumeroComprobante(int numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	

}
