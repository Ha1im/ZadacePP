package Bootcamp_Zadaca15;

import java.util.Arrays;
import java.util.Scanner;

public class KombinacijeParovaBrojeva {

	public static int[] distinctArr(int[] arr) {

		int[] placeHolderArray = new int[arr.length];
		boolean isDistinct;
		int distinctCounter = 0;

		Arrays.fill(placeHolderArray, -1);

		for (int i = 0; i < arr.length; i++) {
			isDistinct = true;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == placeHolderArray[j]) {
					isDistinct = false;
					break;
				}
			}
			if (isDistinct) {
				placeHolderArray[distinctCounter] = arr[i];
				distinctCounter++;
			}
		}

		int[] distinctNumbersArray = new int[distinctCounter];

		for (int i = 0; i < distinctCounter; i++)
			distinctNumbersArray[i] = placeHolderArray[i];

		return distinctNumbersArray;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] brojeviArr = new int[10];
		int brojKombinacija = 0;

		System.out.print("Unesite 10 brojeva: ");
		for (int i = 0; i < brojeviArr.length; i++) {
			brojeviArr[i] = unos.nextInt();
		}
		unos.close();

		int[] disinctNumberstArray = distinctArr(brojeviArr);
		Arrays.sort(disinctNumberstArray);

		for (int i = 0; i < disinctNumberstArray.length; i++) {
			for (int j = (i + 1); j < disinctNumberstArray.length; j++) {

				System.out.print(disinctNumberstArray[i] + " " + disinctNumberstArray[j] + " | ");
				brojKombinacija++;
			}
			System.out.println();
		}

		System.out.println("Broj mogucih kombinacija je " + brojKombinacija);
	}
}
