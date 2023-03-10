package practicaJava;

import java.util.Scanner;
public class Practica2 {
	
	static void firtsNumber() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	static void addTwoNumbers(int num1,int num2) {
		while(num1>0) {
			num2++;
			num1--;
		}
		while(num1<0) {
			num2--;
			num1++;
		}
		System.out.println(" Tu suma sin suma es: "+num2);
	}
	
	static void palindrom(int number) {
		int reve = 0,cifra;
		int aux = number;
        while (aux!=0){
            cifra = aux % 10;
            reve = reve * 10 + cifra;
            aux = aux / 10;
        }
    
        if(number == reve){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindormo :c");
        }
	}
	 
	//Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	static void withoutLoops(int number) {
		int unidad, decena,suma;
		if(number >= 10 && number <= 99) {
			decena = number/10;
			unidad = number%10;
			suma = decena+unidad;
			System.out.println(" La suma de su digito: "+number+ " es "+suma);
		}else {
			System.out.println("Error! Solo se admiten numeros de 2 digitos");
		}
	}
	
	//Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	static void withoutSpace(String word) {
		System.out.println("Tu palabra "+word+ " sin espacios es: "+word.replace(" ", ""));
	}
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	static void reverword(String word) {
		StringBuilder reverse = new StringBuilder(word);
		reverse.reverse();
		System.out.println("Su palabra invertida es: "+reverse.toString());
	}
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	public static int factorial(int n) {
	    // Caso base: si n es 0 o 1, el factorial es 1
	    if (n == 0 || n == 1) {
	        return 1;
	    }
	    // Caso recursivo: calcular el factorial de n - 1 y multiplicarlo por n
	    return factorial(n - 1) * n;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Scanner readS = new Scanner (System.in);
		int option = 1, number1,number2;
		String word;
		do {
			System.out.println("Menu ejercicios 2 Java");
			System.out.println("1.Numeros primeros 2. Suma sin suma 3. Numero Palindromo 4. Sin Loops 5. Sin espacio 6. Palabra al reves 7. Factorial 8. Salir");
			option = read.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Mostrando los primero 100 números primos");
					firtsNumber();
				break;
				case 2:
					System.out.println("Suma sin sumar ");
					System.out.println("Ingrese los 2 numeros");
					number1 = read.nextInt();
					number2 = read.nextInt();
					addTwoNumbers(number1,number2);
				break;
				case 3:
					palindrom(33);
				break;
				case 4:
					System.out.println("Determinar los digitos");
					System.out.println("Ingrese el digito");
					number1 = read.nextInt();
					withoutLoops(number1);
				break;
				case 5:
					System.out.println("Ingresa la palabra ");
					word = readS.nextLine();
					withoutSpace(word);
				break;
				case 7:
					System.out.println("Ingrese el numero a ser factorial");
					number1 = read.nextInt();
					System.out.println(factorial(number1));
				break;
			}
		}while(option != 8);
		
		read.close();
	}

}

}
