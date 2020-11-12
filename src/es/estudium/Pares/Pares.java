package es.estudium.Pares;

import java.util.Scanner;

public class Pares
{

	public static void main(String[] args)
	{
		// Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		// Declaramos las variables necesarias
		int i, num1, num2;
		// Pedimos datos al usuario
		System.out.println("Ingrese un número entero: ");
		// Leemos lo que se escribe por teclado
		num1 = teclado.nextInt();
		System.out.println("Ingrese otro número entero: ");
		num2 = teclado.nextInt();
		// Realizamos la tarea solicitada
		for (i = num1; i <= num2; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
			{
				// Cerramos el acceso al teclado
				teclado.close();
			}
		}
	}

}
