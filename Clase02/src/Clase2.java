
public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Operadores

		/*
		 * Operadores aritm�ticos: + suma - resta / divisi�n multiplicaci�n % m�dulo o
		 * resto de la divisi�n Operadores binarios (necesitan dos operandos) los
		 * operandos son num�ricos el resultado num�rico
		 */

		int nro1 = 10;
		int nro2 = 2;
		System.out.println("nro1 " + nro1 + " nro2= " + nro2);

		// Suma

		System.out.println("Suma: ");
		System.out.println(nro1 + nro2);

		// Resta
		System.out.println("Resta:");
		System.out.println(nro1 - nro2);

		// divisi�n
		System.out.println("divisi�n");
		System.out.println(nro1 / nro2);

		// multiplicaci�n
		System.out.println("multiplicaci�n");
		System.out.println(nro1 * nro2);

		// m�dulo o resto de la divisi�n
		System.out.println("m�dulo o resto de la divisi�n");
		System.out.println(nro1 % nro2);

		/*
		 * Operadores de asignaci�n nro1 2
		 */
		System.out.println("Operadores de asignaci�n");

		// +=
		System.out.println("+=");

		System.out.println(nro1 += 2);
		// -=
		System.out.println("-=");

		System.out.println(nro1 -= 2);
		// *=
		System.out.println("*=");
		System.out.println(nro1 *= 2);
		// /=

		System.out.println("/=");
		System.out.println(nro1 /= 2);

		// Operadores incrementales y decrementales ++ --

		System.out.println("++");
		nro1 = 10;
		// nro1++ >> nro1 += 1 >> nro1 = nro1 + 1
		nro1++;
		System.out.println(nro1);

		System.out.println("--");
		nro1--;

		System.out.println(nro1);

		// Operadores relacionales
		/*
		 * > mayor < menor >= mayor o igual <= menor o igual == igual != distinto
		 * operador binario los operadores son num�ricos el resultado el booleano
		 */

		nro1 = 10;
		nro2 = 20;

		System.out.println(">");

		System.out.println(nro1 > nro2);

		System.out.println("<");

		System.out.println(nro1 < nro2);

		System.out.println(">=");

		System.out.println(nro1 >= nro2);

		System.out.println("Nro1 >= 10  --> " + (nro1 >= 10));
		
		System.out.println("<=");

		System.out.println(nro1 <= nro2);
		
		System.out.println("Nro1 <= 10  --> " + (nro1 <= 10));
		
		/*
        A   B   AND OR
        V   V   V   V
        V   F   F   V
        F   V   F   V
        F   F   F   F
    
        negaci�n
        A   NOT
        V   F
        F   V
		 */
		
		boolean log1 = true; 
		boolean log2 = false; 
		
		System.out.println("AND &&");
		System.out.println(log1 && log2);
		
		System.out.println("OR ||");
		System.out.println(log1 || log2);
		
		System.out.println("NOT !");
		
		System.out.println(log1);
		System.out.println(!log1);
		
		
		//Condicionales
		
		// Estructura IF
		
		
		int nro3 = 155;
		int nro4 = 155; 
		
		System.out.println("Estructura del IF");
		if (nro3 == nro4) {
			System.out.println("Son iguales");
		}
		
		
		if (nro3 > nro4) {
			System.out.println("Es mayor");
		}else if (nro3 < nro4) {
			System.out.println("No es mayor");
		}else {
			System.out.println("son iguales");
		}
		
		
		nro4 =4;
		
		if (nro3 != nro4) {
			System.out.println("Son distintos");
		}
		
		if (12 < 4) {
			System.out.println("Es menor");
		} else {
			System.out.println("No es menor");
		}
		
		
		//SWITCH
		
		System.out.println("Ejemplo de switch");
		int dia = 50;
		switch (dia) {
		case 1: {
			
			System.out.println("El dia es 1");
			break;
		}
		case 2: {
			
			System.out.println("El dia es 2");
			break;
		}
		case 3: {
			
			System.out.println("El dia es 3");
			break;
		}
		case 14: System.out.println("El dia es 14"); 
			break;
		default:
			System.out.println("No conozco que valor es");
		}
		

		
		
		
		
	}

	
	
}
