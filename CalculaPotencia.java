import java.util.Scanner;
public class CalculaPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una base y una potencia, por favor");
		int base = sc.nextInt(); //entero
		int exp = sc.nextInt(); //entero
		double potencia; //real
		
		//Si exp=0 la potencia es 1
		//Sino: La potencia de un numero es ese numero las veces que indica el exponente
		//Es decir si potencia=1     potencia=potencia*base repetido EXPONENTE veces.
			//Ejemplo:3^4 (potencia=potencia*3) 1 vez =3
			// (potencia=3*3) 2 vez=9
			// (potencia=9*3) 3 vez=27
			// (potencia=27*3) 4 vez=81
		
		potencia = 1;
		int expPositivo = Math.abs(exp); // tomamos el valor absoluto de un numero. si meten -25 cogemos 25
		
		if (expPositivo>0) {
			for (int i = 1;i <= expPositivo; i++) {
			potencia = potencia * base;
			}
		}
		if (exp < 0) {
			potencia = 1 / potencia;
		}
					
		System.out.printf("%d elevado a %d\n Su Potencia es = %.3f: ",base,exp,potencia); //%d si es entero %d si es real %f	
		sc.close();		
	}

}
