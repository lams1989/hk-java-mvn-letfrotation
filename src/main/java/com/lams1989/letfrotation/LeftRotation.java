package com.lams1989.letfrotation;

public class LeftRotation {

	public static int[] leftRotation(int[] v, int r) {
		for (int k = 0; k < r; k++) {
			int aux = v[0];
			int[] auxv = new int[v.length + 1];
			for (int i = 0; i < v.length; i++) {
				auxv[i] = v[i];
			}
			auxv[v.length] = aux;
			for (int i = 0; i < auxv.length - 1; i++) {

				v[i] = auxv[i + 1];
			}
		}
		return v;

	}

	public static void printLeftRotation(int[] v) {

		for (int i = 0; i < v.length; i++) {
			System.out.println("" + v[i] + " ");
		}
	}
}
