import java.util.Scanner;

public class Latihan02	{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] angka = new int[5];
		final int sizeAngka = angka.length;
		int valueAngka;
		
		for(int i = 0; i < sizeAngka; i++) {
			System.out.print("Masukkan nilai array angka indeks ke - " + i + " = ");
			valueAngka = userInput.nextInt();
			angka[i] = valueAngka;
		}
		
		System.out.println();
		
		for(int j = 0; j < sizeAngka; j++) {
			System.out.println("Array angka[" + j + "] = " + angka[j]);
		}
		
		userInput.close();
	}

}