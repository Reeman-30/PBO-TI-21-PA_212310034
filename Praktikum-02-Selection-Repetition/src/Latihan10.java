import java.util.Scanner;

public class Latihan10 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String pin = "3030"; // variabel konstan pin
		boolean isSama = true;
		String inputPin;
		byte pilihMenu;
		long saldo = 5000000; // 5.000.000
		int tarikSaldo, setorSaldo;
		int percobaan = 0;
		
		System.out.println("===PROGRAM ATM SEDERHANA===");
		
		while(isSama) {
			System.out.print("Masukkan PIN = ");
			inputPin = input.nextLine();
			
			if(inputPin.equals(pin)) {
				isSama = false;
			} else if(!inputPin.equals(pin) && percobaan < 3) {
				System.out.println("Pin salah! Silahkan coba lagi");
				
				if(percobaan == 3) {
					System.out.println("Maaf Anda salah password sebanyak 3 kali, silahkan coba lagi dalam waktu 30 menit");
					System.exit(0);
				}
				
				percobaan++;
				System.out.println(percobaan);
			} 
			
		}
				
		while(true) {
			System.out.println("Pilih menu ATM:");
			System.out.println("1. Lihat Saldo\n"
					+ "2. Setor Tunai\n"
					+ "3. Tarik Tunai\n"
					+ "4. Keluar\n");
			System.out.print("Pilih : ");
			pilihMenu = input.nextByte();
			
			switch(pilihMenu) {
				case 1:
					getSaldo(saldo);
				break;
				
				case 2:
					System.out.print("Masukkan nominal setor tunai = Rp ");
					setorSaldo = input.nextInt();					
					saldo += setorSaldo;
					System.out.println("Setoran tunai berhasl!\n");
					
					getSaldo(saldo);
					
					System.out.println();
				break;					
			}
		}
	}
	
	static void getSaldo(long valSaldo) {
		System.out.println("Saldo Anda = Rp " + valSaldo);
	}

}
