package src1.tareas;

import libs.Input;

/*Implementa un programa que muestre el numero minimo de monedas necesarias para darle el cambio a un usuario.

$ ./minimo_monedas
Hola!  Cuanto cambio te debo?O hai!
0.41
4


Consideraciones:  
25c
10c
5c
1c

algoritmo seguirian
45c
25c - 1 => 20c
10c - 2 => 0c
5c  - 0 => 0c
1c  - 0 -> 0c

$1.23
25c - 4 => 23c
10c - 2 => 3c
5c  - 0 => 3c
1c  - 3 -> 0c

1.  /pedir al usuario cuanto es el cambio en fraccion.
2.  /tener un acumulador de monedas
3.  tener un contador del resto de cambio sobrante
4.  dividir por la moneda de 25c, sacar cuantas monedas de 25c necesito, y sumarlas al acumulador.
5.  sacar el residuo para obtener el resto de cambio sobrante.
6.  dividir por la moneda de 10c. sacar.........
7.  repetir el paso 5 con la moneda de 10c
8.  repetir el paso 4 con la moneda de 5c
9   repetir el paso 5 con la moneda de 5c
10. repetir el paso 4 con la moneda de 1c
11. repetir el paso 5 con la moneda de 1c
12  imprimir el numero de monedas en el acumulador.  

*/
public class minimoMonedas {
	static int [] acumuladorMonedas;//Arreglo acumulador de monnedas
	static int faltante=0;
	public static void main(String[] args) {
		int cambio=0;
		acumuladorMonedas = new int[4];
				//Pide al usuario los centavos
		System.out.println("¿Cuanto es el cambio en centavos? ");
		cambio= Input.get_int();
		faltante=cambio;
		
		//System.out.println(cambio);
/*		acumuladorMonedas[0]=25;
		acumuladorMonedas[1]=;
		acumuladorMonedas[2]=;
		acumuladorMonedas[3]=;*/
		
		ModCambio();
		System.out.println("\t Monedas de 25 \t Monedas de 10 \t  Monedas de  5\t Monedas de  1");
		imprimeAcumulador();		
	}
	public static void imprimeAcumulador()
	{
		int aux;//auxiliar del ciclo for
		
		for(aux=0;aux<4;aux++)
		{
			System.out.print("\t| \t"+acumuladorMonedas[aux]);
		}
	}
	public static void ModCambio()
	{
		//int division, modulo;
		if(faltante>24)
	      {
			acumuladorMonedas[0]=faltante/25;
			faltante=faltante%25;
	      }
		if(faltante>9)
	      {
			acumuladorMonedas[1]=faltante/10;
			faltante=faltante%10;
	      }
		if(faltante>4)
	      {
			acumuladorMonedas[2]=faltante/5;
			faltante=faltante%5;  
	      }
		if(faltante>1)
	      {
			acumuladorMonedas[3]=faltante/1;
			faltante=faltante%1;
	      }
	}

}
