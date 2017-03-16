package Hijo;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Hijo {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String mensaje = sc.nextLine();
		while (mensaje != null) {
 			System.out.println(mensaje.toUpperCase());
			mensaje = sc.nextLine();
		}


	}
}