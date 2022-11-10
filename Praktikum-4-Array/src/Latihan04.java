import javax.swing.JOptionPane;

public class Latihan04 {
	
	public static void main(String[] args) {
		String panjangArray = JOptionPane.showInputDialog(null, "Masukkan jumlah array", "Input", JOptionPane.INFORMATION_MESSAGE);
		int jumlahArray = Integer.parseInt(panjangArray);
		
		int[] angka = new int[jumlahArray];
		
		for(int i = 0; i < jumlahArray; i++) {
			String valuesAngka = JOptionPane.showInputDialog(null, "Masukkan angka:", "Data array ke - " + i, JOptionPane.QUESTION_MESSAGE);
			angka[i] = Integer.parseInt(valuesAngka);
		}
		
		int maxAngka = angka[0];
		int minAngka = angka[0];
		
		String output = "";
		
		for(int j = 0; j < jumlahArray; j++) {
			if(angka[j] > maxAngka) {
				maxAngka = angka[j];
			} else if(angka[j] < minAngka) {
				minAngka = angka[j];
			}
			output += "Array angka[" + j + "] = " + angka[j] + "\n";
		}
		
		output += "\nNilai terbesar adalah " + maxAngka + "\n";
		output += "Nilai terkecil adalah " + minAngka + "\n";
		
		JOptionPane.showMessageDialog(null, output, "Ouput Array", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
