import java.util.Scanner;

public class Latihan04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilaiFaktor;
		
		System.out.print("Masukkan nilai faktor = ");
		nilaiFaktor = input.nextInt();
		
		if(nilaiFaktor >= 20) {
			System.out.print("Faktor " + nilaiFaktor + " adalah ");
			int pembagi = 0;
			for(int i = 0; i <= nilaiFaktor; i++) {
				pembagi++;
				if(nilaiFaktor % pembagi == 0) {
					System.out.printf("%d ", pembagi);
				}
			}
		} else {
			System.out.println("Maaf nilai yang Anda masukkan kurang dari 20");
		}
		
		input.close();
	}
	
}