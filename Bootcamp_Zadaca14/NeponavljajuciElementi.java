package Bootcamp_Zadaca14;

public class NeponavljajuciElementi {

	public static int[] generateArray() {

		int[] nasumicniArray = new int[10];
		int index = 0;
		boolean contains = false;

		while (index < 10) {

			nasumicniArray[index] = (int) (Math.random() * 101);

			for (int i = 0; i < index; i++) {
				if (nasumicniArray[index] == nasumicniArray[i]) {
					contains = true;
					break;
				} else
					contains = false;
			}

			if (!contains)
				index++;
		}
		return nasumicniArray;
	}

	public static void main(String[] args) {

		int[] nasumicniArray = generateArray();
		System.out.print("10 generisanih elemenata koji se ne ponavljaju su: ");
		for (int i = 0; i < 10; i++)
			System.out.print(nasumicniArray[i] + " ");
	}
}
