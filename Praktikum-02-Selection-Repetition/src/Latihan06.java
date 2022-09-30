import javax.swing.JOptionPane;

public class Latihan06 {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "====PROGRAM PILIH MENU SARAPAN====");
		boolean isPilih = true;
		int pilihanUlang;
		while(isPilih) {
			String masukkan = JOptionPane.showInputDialog(null, "Menu Sarapan: \n"
					+ "1. Nasi Goreng\n"
					+ "2. Bubur Ayam\n"
					+ "3. Soto Ayam\n\n"
					+ "Pilihan : ");
			
			int pilihan = Integer.parseInt(masukkan);
			
			switch(pilihan) {
			case 1:
				JOptionPane.showMessageDialog(null, "Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Anda memesan Soto Ayam dengan harga Rp 25.000,-");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Maaf menu yang Anda masukkan salah");
			}
			
			pilihanUlang = JOptionPane.showConfirmDialog(null, "Apakah ingin mengulang? [Yes/No]");
			
			if(pilihanUlang == JOptionPane.YES_OPTION) {
				continue;
			} else if(pilihanUlang == JOptionPane.NO_OPTION) {
				isPilih = false;
				JOptionPane.showMessageDialog(null, "Terima kasih telah memesan");
				System.exit(0);
			}
			
		}
	}
}
