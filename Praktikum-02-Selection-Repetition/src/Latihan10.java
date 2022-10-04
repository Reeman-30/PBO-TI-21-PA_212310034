import java.util.Scanner;

public class Latihan10 {
	
	static long saldo = 15000000;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String pin = "212310034"; // variabel konstan pin
		boolean isValid = true;
		String inputPin;
		int pinValid = 1; // variabel validasi kesalahan masukan pin
		
		while(isValid) {
			System.out.print("Masukkan pin Anda = ");
			inputPin = input.next();
			
			if(!inputPin.equals(pin)) {
				System.out.println("Pin salah!");
				
				// kondisi jika pin salah sebanyak 3 kali
				if(pinValid == 3) {
					System.out.println("Maaf, kartu Anda terblokir. Silahkan hubungi Call Center");
					isValid = false;
				}
				
				pinValid++;
			} else {
				menuBank();
			}
		}
		input.close(); // menutup proses input user
	}
	
	static void menuBank() {
		Scanner inputVal = new Scanner(System.in);
		boolean isUlang = true;
		long saldoSetor, tarikTunai;
		byte pilihanMenu;
		String varUlang;
		
		while(isUlang) {
			System.out.println("====SISTEM BANK MINI====\n");
			System.out.println("SELAMAT DATANG DI BANK MINI IBI KESATUAN");
			System.out.println("Silahkan pilih menu :");
			System.out.println("1. Lihat Saldo\n"
					+ "2. Setor Tunai\n"
					+ "3. Tarik Tunai\n"
					+ "4. Keluar\n");
			System.out.print("Pilihan : ");
			pilihanMenu = inputVal.nextByte();
			inputVal.nextLine(); // Agar proses input user pada line 79 tidak di-skip atau dilewati secara otomatis
			
			switch(pilihanMenu) {
				case 1:
					cekSaldo(saldo);
				break;
				case 2:
					System.out.print("Masukkan jumlah setoran: Rp ");
					saldoSetor = inputVal.nextLong();
					setorSaldo(saldoSetor);
				break;
				case 3:
					System.out.print("Masukkan jumlah penarikan uang: Rp ");
					tarikTunai = inputVal.nextLong();
					tarikSaldo(tarikTunai);
				break;
				case 4:
					System.out.println("Terima kasih atas kunjungannya");
					isUlang = false;
					System.exit(0);
				break;
				default:
					System.out.println("Masukkan salah!");
			}
			
			while(true) {
			System.out.print("Keluar aplikasi? [Y/N] = ");
			varUlang = inputVal.next();
			
			System.out.println();
			
				if(varUlang.equalsIgnoreCase("N")) {
					break;
				} else if(varUlang.equalsIgnoreCase("Y")){
					System.out.println("Terima kasih atas kunjungannya");
					System.exit(0); // Melakukan exit atau teriminasi pada program 
				} else {
					System.out.println("Masukkan salah!");
					continue;
				}
				
			}
			
		}
		inputVal.close(); // menutup proses input user
	}
	
	static void cekSaldo(long val) {
		System.out.println("Saldo Anda : Rp " + val);
	}
	
	static void setorSaldo(long val) {
		System.out.println("Setoran berhasil!");
		val += saldo;
		saldo = val;
		cekSaldo(saldo);
	}
	
	static void tarikSaldo(long val) {
		if(saldo > val) {
			saldo -= val;
			System.out.println("Silahkan ambil uangnya");
			cekSaldo(saldo);
		} else {
			System.out.println("Maaf saldo tidak cukup untuk melakukan penarikan");
		}
	}

}