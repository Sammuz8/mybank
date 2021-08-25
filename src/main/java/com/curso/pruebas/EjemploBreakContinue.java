package com.curso.pruebas;

public class EjemploBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int limit = 20;
		// case1
		while (i <= limit) {
			System.out.println(i);
			i++;
		}
		// case2
		i = 1;
		while (i <= limit) {
			if (i % 2 == 0) {
				System.out.println(i + " par");
			} else {
				System.out.println(i + " inpar");
			}
			i++;
		}
		// case3 without continue
		i = 1;
		while (i <= limit) {
			if (i != 7) {
				if (i % 2 == 0) {
					System.out.println(i + " par");
				} else {
					System.out.println(i + " inpar");
				}
			}
			i++;
		}
		// case3 with continue
		i = 1;
		while (i <= limit) {
			if (i == 7) {
				i++;
				continue;
			}
			if (i % 2 == 0) {
				System.out.println(i + " par");
			} else {
				System.out.println(i + " inpar");
			}

			i++;
		}

	}

}
