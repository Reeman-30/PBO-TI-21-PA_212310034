import java.util.Scanner;

public class Latihan02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NPM;
		
		System.out.print("Masukkan NPM Anda = ");
		NPM = input.nextInt();
		
		if(NPM % 2 == 1 || NPM == 2) {
			System.out.println("Termasuk bilangan PRIMA");
		} else {
			System.out.println("Bukan termasuk bilangan PRIMA karena dapat dibagi dengan 2");
		}
		
		input.close();
	}

}
