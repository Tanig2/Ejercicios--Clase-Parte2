import java.util.Scanner;
public class CalculadoraEuros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Scanner sc= new Scanner(System.in);
	
	//Creamos una constante para la conversion a euros, normalmente se usa DOUBLE siempre para números con decimales
	
	final double FACTOR_CONV = 166.386; //las constantes van en  mayúsculas siempre
	
	System.out.println("Introduce una cantidad en pesetas");
	double pesetas = sc.nextDouble();
	
	System.out.printf("El factor de conversión es:%.3f", FACTOR_CONV); // %.3f nos imprime solo 3 decimales, si pusieramos %8.3f nos reserva 8 espacios para todo el numero y 3 decimales
	System.out.println();
	
	if(pesetas>0) {
	System.out.printf("La cantidad en euros es %.2f", (pesetas/FACTOR_CONV));
	}
	else(pesetas<0) {
		System.out.printf("El valor de pesetas introducido no es correcto");
	}
	sc.close();
	}

}

