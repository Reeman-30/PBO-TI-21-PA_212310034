import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan02 {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriks_A = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matriks_B = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < 2; i++) {
            matriks_A.add(new ArrayList<Integer>());
            for(int j = 0; j < 2; j++) {
                String values_A = JOptionPane.showInputDialog(null,
                                  "Masukkan angka : ",
                                  "Matriks A[" + i + "][" + j + "]",
                                  JOptionPane.INFORMATION_MESSAGE);
                int pValues_A = Integer.parseInt(values_A);
                matriks_A.get(i).add(j, pValues_A);
            }
        }

        for(int i = 0; i < 2; i++) {
            matriks_B.add(new ArrayList<Integer>());
            for(int j = 0; j < 2; j++) {
                String values_B = JOptionPane.showInputDialog(null,
                                  "Masukkan angka : ",
                                  "Matriks B[" + i + "][" + j + "]",
                                  JOptionPane.INFORMATION_MESSAGE);
                int pValues_B = Integer.parseInt(values_B);
                matriks_A.get(i).add(j, pValues_B);
            }
        }

        String outputA = "Matriks A\n" + printArr(matriks_A);
        String outputB = "\nMatriks B\n" + printArr(matriks_A);
        String outputArr = outputA + outputB;

        JOptionPane.showMessageDialog(null, outputArr, "Output Array", JOptionPane.INFORMATION_MESSAGE);

    }

    private static String printArr(ArrayList<ArrayList<Integer>> val) {
        String output = "";

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                output += val.get(i).get(j) + " ";
            }
            output += "\n";
        }

        return output;
    }

}
