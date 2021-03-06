
public class Clase06 {
	
	double valorIVA= 1.21;
	public static void main(String[] args) {
		int numero = 10;
		System.out.println(sumaRecursiva(numero));

		// procedimiento que hace algo
		// no devuelve nada
		// en la declaracion tiene palabra void
		// Metodo que salude
		saludar();
		String nombre = "Pepe";
		int dni = 232323;
		saludarNombreMostrarDNI(nombre, dni);

		int base = 5;
		int altura = 3;
		calcularAreaRectangulo(base, altura);
		calcularAreaTriangulo(base, altura);
		
		
		int[] vector = {2,3,4,67,89,20};
		mostrarVector(vector);
		
		//String result = mostrarVector(vector);
		
		//FUNCIONES
		//Metodo que me sume dos enteros y que me devuelva el resultado
		int a = 2;
		int b = 3; 
		int result = sumarDosNros(a, b);
		System.out.println(result);
		System.out.println(sumarDosNros(a, b));
		
		//Funcion que me sume el IVA; 
		double money = 10;
		double moneyIVAincl = sumarIVA(money);
		System.out.println(moneyIVAincl);
		
		//Funcion que me diga si un numero es PAR
		int valor= 2; 
		
		boolean resultPAR = esPAR(valor);
		if (resultPAR) {
			System.out.println("El numero: " + valor + " es par");
			
		}else {
			System.out.println("El numero: " + valor + " NO es par");
		}
	}



	private static boolean esPAR(int i) {
		
		return i%2==0;
	}



	private static double sumarIVA(double importe) {
		
		double impConIVA= importe * 1.21;
		
		return impConIVA;
	}



	private static int sumarDosNros(int a, int b) {
		// TODO Auto-generated method stub
		return a +b; 
	}



	private static void mostrarVector(int[] vector) {
		for (int a:vector) System.out.println(a);
		
	}



	// Toma un numero y me suma recursivamente hasta llegar a uno
	public static int sumaRecursiva(int numero) {
		int resultado;
		if (numero == 1) {
			System.out.println(" 1 ");
			return 1; // Caso Base o de fin de recursividad
		} else {
			// System.out.print("Numero: " + numero);
			// System.out.println("--------");
			resultado = numero + sumaRecursiva(numero - 1);
			// System.out.println(resultado);
		}
		return resultado;

	}

	public static void saludar() {
		System.out.println("Hello world");
	}

	public static void saludarNombreMostrarDNI(String nombre, int dni) {
		System.out.println("Hola " + nombre + "Dni: " + dni);

	}

	// Procedimiento que calcule area de un rectangulo (Base x Altura)
	public static void calcularAreaRectangulo(int base, int altura) {
		int resultado = base * altura;
		System.out.println("El area del rectangulo es: " + resultado);
	}

	// Procedimiento que calcule area de un rectangulo (Base x Altura/2)
	public static void calcularAreaTriangulo(double base, double altura) {
		double resultado = base * altura / 2;
		System.out.println("El area del triangulo es: " + resultado);
	}
	
	
	
}
