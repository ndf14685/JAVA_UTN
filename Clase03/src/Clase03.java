import java.io.Console;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float numero = 3;
		float otroNumero = 4;
		int ceero = 0;
		// System.out.println(numero/ceero);
		// System.out.println(otroNumero/0);

		int edad = 17;

		String mensaje;
		if (edad >= 18) {
			mensaje = "Es mayor de edad";
		} else {
			mensaje = "Es menor de edad";
		}
		System.out.println(mensaje);

		System.out.println("Operador Ternario ");

		mensaje = "";

		mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";

		System.out.println(mensaje);

		boolean esMayorDeEdad = (edad >= 18) ? true : false;
		System.out.println(esMayorDeEdad);

		boolean esmayordeedad = true; // CAmelcase - lower camel case

		boolean EsMenorDeEdad = false; // Upper Camel Case

		// Mostrar desde 1 a 10
		int contador = 1;

		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador++;

		contador = 1;
		System.out.println("************");
		System.out.println("Estructura del While ");
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}

		while (true) {
			System.out.println("LALLAAL");
			break;
		}

		Scanner teclado = new Scanner(System.in);

		System.out.println("Su edad es " + edad);
		// do While
		/*
		 * do { System.out.println("Ingrese su nombre: "); String nombre =
		 * teclado.next(); System.out.println("Su nombre es " + nombre);
		 * 
		 * System.out.println("Ingrese su edad: "); edad = teclado.nextInt();
		 * System.out.println("Su nombre es: " + nombre + " y su edad es " + edad); }
		 * while (edad >= 18);
		 */
		// Ejercicio Sumar un valor ingresado por teclado hasta que el resultado sea 0 o
		// negativo

		int cantidad = 0;
		/*
		 * do { System.out.println("Ingrese un numero entero para sumar: ");
		 * 
		 * cantidad+= teclado.nextInt(); System.out.println("Resultado: " + cantidad); }
		 * while (cantidad > 0);
		 *
		 * System.out.println("Resultado final: " + cantidad);
		 * 
		 * /* Partes de la estructura del While:
		 *
		 * int contador = 1; ---> Inicializar while (contador <= 10){ ---> Condicion
		 * System.out.println(contador) ---> accion / Bloque de codigo contador++; --->
		 * Post accion }
		 *
		 */

		System.out.println("Estructura FOR");

		for (int i = 1; i < 10; i++) {
			System.out.println("Contador: " + i);

		}

		// Ejercicio: Ingresar por teclado mayor a 18, y mostrarla por pantalla. Si se
		// ingresa un valor menor
		// a 18 3 veces, se finaliza con el texto "Estas AFUERA DEL PROGRAMA"
		// "Edad: " + edad;

		/*
		 * for (Iterator iterator = collection.iterator(); iterator.hasNext();) { type
		 * type = (type) iterator.next();
		 * 
		 * }
		 */
		
		for (int edadMenor = 0; edadMenor <= 2; ) {
			System.out.println("Ingresa una edad: ");
			edad = teclado.nextInt();
			if (edad < 18) {
				System.out.println("Edad menor a 18 te quedan");
				edadMenor++;
				int resta = 3 - edadMenor; 
				System.out.println("Te quedan " + resta + " intentos");
				
				
			}

		}
		
		
		/*for (int i = 0; i < n; i++) {
			
		}*/
		
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			
		}
		
		for (String string : args) {
			
			
			//Sentencia
		}
		
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
