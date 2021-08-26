package com.curso.pruebas;

public class EjemploBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ini = 1;
		int limit = 20;
		// case1
		while (ini <= limit) {
			System.out.println(ini);
			ini++;
		}
		// case2
		ini = 1;
		while (ini <= limit) {
			if (ini % 2 == 0) {
				System.out.println(ini + " par");
			} else {
				System.out.println(ini + " inpar");
			}
			ini++;
		}
		// case3 without continue
		ini = 1;
		while (ini <= limit) {
			if (ini != 7) {
				if (ini % 2 == 0) {
					System.out.println(ini + " par");
				} else {
					System.out.println(ini + " inpar");
				}
			}
			ini++;
		}
		// case3 with continue
		ini = 1;
		while (ini <= limit) {
			if (ini == 7) {
				ini++;
				continue;
			}
			if (ini % 2 == 0) {
				System.out.println(ini + " par");
			} else {
				System.out.println(ini + " inpar");
			}

			ini++;
		}
		//case4
		/*
		 *  4.   con form 5 veces mostrar las letras de la A a la F.
		 */
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
			}
			System.out.println();
		}
		
		// break sin etiqueta
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') break;  //salta linea 78
			}
			System.out.println();
		}
		
		System.out.println(".........");
		// break con etiqueta
		bucle1:
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') break bucle1;  //salta linea 91
			}
			System.out.println();
		}
		
		System.out.println("......... contintue .... ");
		//continute  sin etiqueta
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') continue;  //salta 96 no imprime *
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("......... contintue con eti.... ");
		//continute  sin etiqueta
		buclefuera:
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') continue buclefuera;  //salta 108 
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
