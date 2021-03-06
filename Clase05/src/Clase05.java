import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Clase05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x = 016;
		//System.out.println(x);
		int[] numeros= cargar10ElemEnArrayPorTeclado();
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		mostrarElementosArray(numeros);
		
		// Copias de un vector utilizando el System.arraycopy
		int[] copiaNum = new int[10];
		System.arraycopy(numeros, 0, copiaNum, 0, 10);
		System.out.println(numeros);
		System.out.println(copiaNum);
		System.out.println(numeros.equals(copiaNum));

		//Ver el contenido del array
		mostrarElementosArray(copiaNum);
		
		// Foreach para con vectores
		System.out.println("--------------------FOR EACH----------------------------");
		for (int i : copiaNum) System.out.println(copiaNum[i]);
		
		//Validar que copiaNum no sea numeros
		
		numeros[5] = 1;
		copiaNum = numeros;
		
		numeros[5]= 5555;
		
		System.out.println(copiaNum[5]);
		System.out.println(numeros.equals(copiaNum));
		System.out.println(numeros);
		System.out.println(copiaNum);
		
		System.out.println("--------------------ORDENAR VECTOR----------------------------");

		// ordenar el contenido de un vector
		int[] vector = {4,56,32,12,25,1,23};
		mostrarElementosArray(vector);
		
		Arrays.sort(vector);
		System.out.println("Vector Ordenado: ");
		mostrarElementosArray(vector);
		
		
		System.out.println("--------------------Comparar Objetos----------------------------");

		String a = "r"; 
		String b = "r"; 
		
		System.out.println(a.equals(b));
		
		System.out.println("--------------------Calculo de Promedio----------------------------");

		// Promedio de un array
		double total=0;
		double prom=0.0;
		for (int i = 0; i < vector.length; i++) {
			total +=vector[i];
			
		}
//					  0  1 2  3  4  5 6   7
//		int[] vector={4,56,32,12,25,1,23};
		prom=total/vector.length;
		System.out.println("El promedio es: " + prom);
		
		mostrarMayorMenor(vector);
		
		
		
		/*
		 * crear un vector de 10 posiciones pedirle al usuario que cargue 10 valores
		 * para ese vector indicar cu?ntos n?meros pares y cu?ntos impares hay indicar
		 * cu?ntas veces se repiti? el n?mero 2
		 */
		
		int[] vector10posic= cargar10ElemEnArrayPorTeclado();
		int numPares = 0; 
		int numImpares = 0; 
		int numDos= 0;
		for (int i = 0; i < vector10posic.length; i++) {
			if(vector10posic[i]%2==0) {
				numPares +=1;
			}else {
				numImpares++;
			}
			
			if (vector10posic[i] == 2) {
				numDos++;
			}
			
			
		}
		
		System.out.println("LA cantidad de numeros pares: " + numPares);
		System.out.println("LA cantidad de numeros Impares: " + numImpares);
		System.out.println("LA cantidad de numeros dos que hay son: " + numDos);
		
	}
	
	public static void mostrarMayorMenor(int[] vector) {
		System.out.println("--------------------Calculo de Mayor----------------------------");

		// c?lculo del mayor de un array
		int mayor = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > mayor) mayor = vector[i];
		}
			
			
		System.out.println("El mayor es: " + mayor );
		
		
		System.out.println("--------------------Calculo de Menor----------------------------");

		// calculo del menor de un array
		int menor = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (menor > vector[i]) menor = vector[i];
		}
		System.out.println("El menor es: " + menor );
	}
	public static int[] cargar10ElemEnArrayPorTeclado() {
		
		Scanner teclado = new Scanner(System.in);
		// Asignando valor con for a un vector de 10 elementos a traves teclado
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese por teclado el valor para la posicion nro: " + i);
			//numeros[i] = teclado.nextInt();
			numeros[i]= i;
			System.out.println(numeros[i]);
		}
		mostrarElementosArray(numeros);
		return numeros;
	}
	
	public static void mostrarElementosArray(int[] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println(" ");
	}

}
