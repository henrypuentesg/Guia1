package ejercicios;

public class Ejercicio09 {
	
	//Prueba Commit

	static final int PUESTOS_BUS = 60;
	static final int VALOR_COMIDA = 10000;
	static final int VALOR_HABITACION = 25000;
	public int cantidadFlacos;
	public int cantidadGordos;
	public int cantidadDiasDuracionPaseo;
	
	
	public int getCantidadFlacos() {
		return cantidadFlacos;
	}
	public void setCantidadFlacos(int cantidadFlacos) {
		this.cantidadFlacos = cantidadFlacos;
	}
	public int getCantidadGordos() {
		return cantidadGordos*2;
	}
	public void setCantidadGordos(int cantidadGordos) {
		this.cantidadGordos = cantidadGordos;
	}
	public static int getPuestosBus() {
		return PUESTOS_BUS;
	}
	public static int getValorComida() {
		return VALOR_COMIDA;
	}
	public static int getValorHabitacion() {
		return VALOR_HABITACION;
	}
	public int getCantidadDiasDuracionPaseo() {
		return cantidadDiasDuracionPaseo;
	}
	public void setCantidadDiasDuracionPaseo(int cantidadDiasDuracionPaseo) {
		this.cantidadDiasDuracionPaseo = cantidadDiasDuracionPaseo;
	}
	public Ejercicio09(int cantidadFlacos, int cantidadGordos, int cantidadDiasDuracionPaseo) {
		super();
		this.cantidadFlacos = cantidadFlacos;
		this.cantidadGordos = cantidadGordos;
		this.cantidadDiasDuracionPaseo = cantidadDiasDuracionPaseo;
	}
	
	public Ejercicio09() {
		super();
	
	}
	
	
	public void cantidadBuses() {
			double cantidadBuses= (double ) Math.ceil((double)(getCantidadGordos()+getCantidadFlacos())/getPuestosBus());
		
			/*System.out.println("Cantidad Buses: " +getCantidadGordos());
			System.out.println("Cantidad Buses: " +getCantidadFlacos());
			System.out.println("Cantidad Buses: " +getPuestosBus());
			*/
			
			System.out.println("Cantidad Buses: " +cantidadBuses);
		
	}
	

	
	
	
	
	
}
