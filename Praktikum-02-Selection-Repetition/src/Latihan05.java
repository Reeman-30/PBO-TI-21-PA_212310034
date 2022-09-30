	import java.util.Scanner;
	
	public class Latihan05 {
		
		public static void main(String[] args) {
			Scanner inputData = new Scanner(System.in);
			int baris;
			
			System.out.print("Masukkan banyaknya baris: ");
			baris = inputData.nextInt();
			
			for(int i = 0; i < baris; i++) {
				for(int j = baris; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int x = 0; x < baris; x++) {
				for(int y = 0; y <= x; y++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println();
			
			for(int a = baris; a > 0 ; a--) {
				for(int b = baris; b > a; b--) {
					System.out.print(" ");
				}
				for(int c = 0; c < a; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int m = 0; m < baris ; m++) {
				for(int n = baris; n > m; n--) {
					System.out.print(" ");
				}
				for(int l = 0; l <= m; l++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			inputData.close();
		}
	
	}
