package practicaJava;

import java.lang.Math;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Practica {
	//(l1==l2 && l2 !=l3) || (l2==l3 && l3!=l1) || (l1==l3 && l3 !=l2)
	static void areaT(double l1,double l2,double l3) {
		double auxm, auxM;
		double area = 0;
		if(l1>0 && l2>0 && l3> 0) {
			if(l1==l2 && l2==l3) {
				System.out.println("Triangulo Equilatero");
				area = (l1 * l2)/2;
				System.out.println("El area de tu traingulo es: "+ area + " cm2 ");
			}else if(l1 != l2 && l2 != l3) {
				System.out.println("Triangulo escaleno");
				if(l1 < l2 && l1 <l3) {
					auxm = l1;
				}else if(l2<l1 && l2 < l3) {
					auxm = l2;
				}else {
					auxm =l3;
				}
				if(l1 > l2 && l2 > l3) {
					auxM = l1;
				}else if(l2 > l1 && l1>l3){
					auxM = l2;
				}else {
					auxM = l3;
				}
				area = (auxm * auxM)/2;
				System.out.println("Su area es : "+ area + "cm2");
			}else {
				System.out.println("Triangulo Isosceles");
				if(l1==l2 && l2!=l3) {
					area = (l1 * l3)/2;
				}else if(l3==l2 && l2 != l1) {
					area = (l2 *l1)/2;
				}
				System.out.println("El area es: "+ area+"cm2");
			}
		}else {
			System.out.println("Error!: Datos mayores a 0");
		}
		
	}
	
	static void areaCircle(float radio) {
		if(radio > 0) {
			System.out.println("El area de tu circulo es: "+(Math.PI *radio*radio));
		}else {
			System.out.println("Error! Ingrese datos mayores a 0");
		}
	}
	
	static void timeNow() {
		LocalDateTime datetime = LocalDateTime.now();
		int hours = datetime.getHour();
		int minutes = datetime.getMinute();
		int seconds = datetime.getSecond();
		System.out.println("La hora es "+hours + ":" + minutes + ":"+seconds);
	}
	
	static void secondsToOthers(int seconds) {
		int hour = seconds / 3600;
		int minutes = seconds / 60;
		System.out.println(" Los "+seconds+ " en horas es "+ hour + " en minutos "+minutes);
	}
	
	static void volSphera(float radio) {
		if(radio > 0) {
			float volumen = 0.0f;
			volumen = (float) ((Math.PI * Math.pow(radio,3)*4)/3);
			System.out.println("El volumen de tu esfera con: "+ radio + " de radio es: "+volumen);
		}else {
			System.out.println("Error! Ingrese valores validos");
		}
		
	}
	
	static void volCono(float radio,float altura) {
		if(radio>0 && altura>0) {
			float volumen = 0.0f;
			volumen = (float) (Math.PI * Math.pow(radio, 2) * altura)/3;
			System.out.println("El volumen del cono con: "+ radio +" y de altura "+altura+ " es: "+volumen);
		}else {
			System.out.println("Error ingrese valores validos");
		}
	}
	
	static void cuboSupeficial(float lado) {
		float area = lado*lado;
		float areaSuper = 6*area;
		System.out.println("El arae superficial de un cubo con medidas "+lado + " es: "+areaSuper);
	}
	
	static void bisiesto (int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
	}
	
	public static void main(String[] args) {
		double l1,l2,l3;
		float radio,altura;
		int option=1, second = 0;
		Scanner read = new Scanner(System.in);
		do {
			System.out.println(" El menu de ejercicios \n");
			System.out.println("1. Triangulo 2. Circulo 3. Hora actual 4. Conversion Segundos \n 5. Volumen esfera 6. Volumen cono 7. Area Cuadrado Superficial  8. Bisisesto 9.Salir ");
			option = read.nextInt();
			switch(option){
				case 1:
					System.out.println("Menu de area de triangulos");
					System.out.println(" Ingrese los valores de los 3 lados del triangulo: ");
					l1 = read.nextDouble();
					l2 = read.nextDouble();
					l3 = read.nextDouble();
					areaT(l1,l2,l3);
				break;
				case 2:
					System.out.println("Area circulo");
					System.out.println(" Ingrese el valor del radio ");
					radio = read.nextFloat();
					areaCircle(radio);
				break;
				case 3:
					System.out.println("Hola ...");
					timeNow();
				case 4:
					System.out.println("Conversion de segundos a horas y minutos");
					System.out.println("Ingrese los segundos a convertir ");
					second = read.nextInt();
					secondsToOthers(second);
				break;
				case 5:
					System.out.println("Volumen de una esfera ");
					System.out.println(" Ingrese el radio ");
					radio = read.nextFloat();
					volSphera(radio);
				break;
				case 6:
					System.out.println("Volumen de un cono");
					System.out.println("Ingrese el valor del radio");
					radio = read.nextFloat();
					System.out.println("Ingrese el valor de la altura");
					altura = read.nextFloat();
					volCono(radio,altura);
				break;
				case 7:
					System.out.println("Area supeficial de un cubo ");
					System.out.println("Ingrese el valor de un lado ");
					altura = read.nextFloat();
					cuboSupeficial(altura);
				break;
				case 8:
					System.out.println("Año bisiesto");
					System.out.println("Ingrese el año a determinar");
					second = read.nextInt();
					bisiesto(second);
				break;
				default:
					System.out.println("Gracias por usar el sistema de ejercicios");
			}
		}while(option!=9);	
		read.close();
	}
}