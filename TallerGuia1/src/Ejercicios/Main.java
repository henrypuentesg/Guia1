package Ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejericicio 1
		System.out.println("Ejercicio 1");
		Ejercicio1 ejercicio1 = new Ejercicio1(5,2);
		ejercicio1.suma();
		ejercicio1.resta();
		ejercicio1.producto();
		ejercicio1.division();
		ejercicio1.residuo();;
		ejercicio1.logaritmo();
		ejercicio1.potencia();
		
		
		//Ejericicio 2
		System.out.println("");
		System.out.println("Ejercicio 2");
		System.out.println("");
		Ejercicio2 ejercicio2 = new Ejercicio2(2);
		ejercicio2.KilometrosPorGalon();
		
		//Ejericicio 3
		System.out.println("");
		System.out.println("Ejercicio 3");
		Ejercicio3 ejercicio3 = new Ejercicio3(74, 36, 75, 6);
		ejercicio3.distanciaPuntosTierra();
		
		
		//Ejericicio 4
		System.out.println("");
		System.out.println("Ejercicio 4");
		Ejercicio4 ejercicio4 = new Ejercicio4(2);
		ejercicio4.areaCirculo();
		
		
		//Ejericicio 5
		System.out.println("");
		System.out.println("Ejercicio 5");
		//Ejercicio4 ejercicio5 = new Ejercicio5(2);
		ejercicio4.areaCirculo();

		
		//Ejericicio 6
		System.out.println("");
		System.out.println("Ejercicio 6");
		Ejercicio6 ejercicio6 = new Ejercicio6(2,6);
		ejercicio6.AreaPoligonoRegular();
		
		
		//Ejericicio 7
		System.out.println("");
		System.out.println("Ejercicio 7");
		Ejercicio7 ejercicio7 = new Ejercicio7(1000);
		ejercicio7.viajesNecesariosTransportarTotalidad();
		ejercicio7.CantidadDeGalonesPorViaje();
		ejercicio7.ValorGasolina();
		
		
				
		
		
		
	}

}
