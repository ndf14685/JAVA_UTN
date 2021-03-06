import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Clase07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7 6 5 4 3 2 1
		// Suma de Numeros 
		int numero=7;
		int resultado = sumaNumerosRecursivos(numero);
		System.out.println("El resultado es: "+ resultado);
		//System.out.println(SubClase07.getPatente());
		System.out.println(SubClase07.getPatente());
		
		SubClase07 estaEsOtraClase = new SubClase07();
		System.out.println("Esta es otra instancia y devuelve: " + estaEsOtraClase.getPatente());
		/*
		 Explicacion de la funcion recursiva: 
		 
		 sumaNumerosRecursivos(7) = 7 + sumaNumerosRecursivos(6)
		 sumaNumerosRecursivos(6) = 7 + sumaNumerosRecursivos(5)
		 sumaNumerosRecursivos(5) = 7 + sumaNumerosRecursivos(4)
		 sumaNumerosRecursivos(4) = 7 + sumaNumerosRecursivos(3)
		 sumaNumerosRecursivos(3) = 7 + sumaNumerosRecursivos(2)
		 sumaNumerosRecursivos(2) = 7 + sumaNumerosRecursivos(1)
		 sumaNumerosRecursivos(1) = 1   ---> Caso Base que me hace salir de la recursividad
		 Comienza a mostrar resultado
		 sumaNumerosRecursivos(1) = 1
		 sumaNumerosRecursivos(2) = 2 +1 = 3
		 sumaNumerosRecursivos(3) = 3 + 3 = 6
		 sumaNumerosRecursivos(4) = 4 + 6 = 10
		 sumaNumerosRecursivos(5) = 5 + 10 = 15
		 sumaNumerosRecursivos(6) = 6 + 15 = 21
		 sumaNumerosRecursivos(7) = 7 + 21 = 28  --> Resultado Final
		 
		 */
		
		// En base a un array de numeros enteros, hacer la suma de los numeros que contiene usando recursividad
		
		int[] arreglo= {1,2,4,5,8};
		resultado = sumarArray(0, arreglo.length-1,arreglo);
		
		System.out.println(resultado);
		
		//Ejercicio Factorial
		//Ejemplo: !6=1*2*3*4*5*6 = 720
		int valor= 6; 
		
		resultado = factorial(valor);
		
		System.out.println("El factorial de: " + valor + " es " + resultado);
	}

	private static int factorial(int valor) {
		int resultado; 
		
		if(valor == 1) {
			return 1;
		}else {
			resultado = valor * factorial(valor-1);
			
			return resultado;
		}
		
	}

	private static int sumarArray(int inicio,int fin, int[] array) {
		// TODO Auto-generated method stub
		
		int resultado; //{1,2,4,5,8}
		//ARranco con indice inicio y (termino con indice array.lenght-1), con un valor fin
		if (inicio==fin) {
			//Caso base, es el pone fin a la recursividad
			return array[inicio];
		}else {
			int mitad = (inicio + fin)/2;
			int mitad1 = sumarArray(inicio, mitad, array);
			int mitad2 = sumarArray(mitad+1, fin, array);
			
			return mitad1 + mitad2;
		}
		
		
	}
//HACER
/*	private static int sumarArray(int[] array) {
		// TODO Auto-generated method stub
		
		int resultado; //{1,2,4,5,8}
		int fin = array.length-1;
		//ARranco con indice inicio y (termino con indice array.lenght-1), con un valor fin
		if (fin==0) {
			//Caso base, es el pone fin a la recursividad
			return array[0];
		}else {
			resultado = array[fin] + sumarArray(array.);
			
			
			return mitad1 + mitad2;
		}
		
		
	}*/

	
	public static int sumaNumerosRecursivos(int numero) {
		// TODO Auto-generated method stub
		int result=1; 
		if (numero ==1 )
			return 1; 
		
		if (numero != 1)
			result = numero + sumaNumerosRecursivos(numero-1);
		
		
		return result; 
	}

}
