package Ejercicios;

public class Ejercicio4 {
	double r;
	

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Ejercicio4(double r) {
		super();
		this.r = r;
	}
	
	
	
	public void areaCirculo() {
		double valorAreaCirculo;
		valorAreaCirculo= Math.PI*Math.pow(getR(), 2);
		System.out.println("Area de Un Circulo: " + valorAreaCirculo);
		
	}
	
	

}
