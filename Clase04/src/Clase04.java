import java.util.Arrays;
import java.util.Scanner;

public class Clase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Escribe un programa que muestre los n primeros términos de la serie de
		 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
		 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
		 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
		 * debe introducir por teclado.
		 */
//		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Ingrese un número");
//		int numero = teclado.nextInt();
//		int a=0;
//		int b=1;
//		int c=0;
//		System.out.println(a);
//		System.out.println(b);
//			for (int i = 1; i <= (numero-1); i++) {
//				c=a+b;
//				System.out.println(c);
//				a=b;
//				b=c;
//				
//		}

//		System.out.println("Ingrese num por teclado");
//		Scanner teclado = new Scanner(System.in);
//		int n = teclado.nextInt();		
//		switch (n) {
//			
//		case 1: 
//			System.out.print(0);
//			break;
//		case 2: 
//			System.out.print(1);
//			break;
//			
//		default:
//			System.out.print("0 1");
//			int f1 = 0; 
//			int f2 = 1; 
//			int aux; 
//			
//			while (n > 2) {
//				aux = f1; 
//				f1 = f2; 
//				f2 = aux + f1; 
//				System.out.print(" " + f2);
//				n--;
//			}
//			
//		}

		int[] losValores = new int[10];
		losValores[0] = 1;
		losValores[1] = 34;
		losValores[2] = 45;
		losValores[3] = 978;
		losValores[4] = 1;
		losValores[5] = 1;
		losValores[6] = 1;
		losValores[7] = 1;
		losValores[8] = 1;
		losValores[9] = 232;

		System.out.println("El valor de la primera posicion es: " + losValores[0]);

		for (int i = 0; i < losValores.length; i++) {
			System.out.println(losValores[i]);
		}
		int aux;
		System.out.println("------------------------------------------");
		for (int i = losValores.length - 1; i >= 0; i--) {
			System.out.println(losValores[i]);
			aux = losValores[i];

		}
		System.out.println("------------------------------------------");

		int suma = 0;
		int n = losValores.length;
		for (int i = 0; i < n; i++) {

			suma = suma + losValores[i];

		}

		System.out.println(suma);

		System.out.println("------------------------------------------");
//		int datos[] = losValores;
		int pares[] = { 2, 4, 6, 8, 10 };
		int[] datos = new int[pares.length];

//		losValores[5]=1929388;

		suma = 0;
		n = datos.length;
//		for (int i = 0; i < pares.length; i++) {
//			
//			datos[i]= pares[i];
//			
//			System.out.print(datos[i] + " ");
//		}

		System.arraycopy(pares, 0, datos, 0, pares.length);
//		System.out.print(datos[1] + " ");
		for (int i = 0; i < datos.length; i++) {

			System.out.print(datos[i] + " ");
		}
		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");

		Arrays.sort(losValores);

		for (int i = 0; i < losValores.length; i++) {

			System.out.print(losValores[i] + " ");
		}

		System.out.println("El resultado de equals es: " + Arrays.equals(datos, pares));

		System.out.println("Datos tiene: " + Arrays.toString(datos));

		
		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");
		int[] vec= {8,1,3,12,5,0,10,10};
		int maximo=vec[0];
		int minimo=vec[0];
		for (int i = 0; i < vec.length; i++) {
			if (vec[i]>maximo) maximo = vec[i];
			if (vec[i]<minimo) minimo = vec[i];

		}
		
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
	}

}
