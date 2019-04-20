package Bootcamp_Zadaca18;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(double[] array) {

		for (int i = 0; i < array.length; i++) {

			double min = array[i];
			int index = i;

			for (int j = i; j < array.length; j++) {

				if (array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
		}

	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double[] array = new double[10];

		System.out.print("Unesite 10 brojeva: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = unos.nextDouble();
		}
		unos.close();

		bubbleSort(array);

		System.out.print("Sortiran niz: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
