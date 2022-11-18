"# Matriz-1" 
import java.util.Random;
public class q1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int sum=0;
        int[][] num = new int[21][11];
        int[] soma = new int[num.length];
        int[][] mult = new int[num.length][num.length];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j] = ran.nextInt(5)+1;
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                soma[i] += num[i][j];
            }
        }

        for(int i=0; i<num.length;i++){
            for (int j = 0; j < num[i].length; j++) {
                mult[i][j] = num[i][j]*soma[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("\n\n");
            System.out.println("==============================================================");
            System.out.println("\t\t\tCOLUNA "+i);
            System.out.println("==============================================================");
            System.out.println("\n\n");
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("======================");
                System.out.println("coluna: "+i+" linha: "+j+" = "+num[i][j]);
                System.out.println("soma da coluna: "+soma[i]);
                System.out.println("multiplicação da linha com a soma: "+mult[i][j]);
                System.out.println("======================");
            }
        }
    }
}
        
