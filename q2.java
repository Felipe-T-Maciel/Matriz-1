import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mat1 = new int[5][5];
        int[][] mat2 = new int[mat1.length][mat1.length];
        int[][] maior = new int[mat2.length][mat2.length];

        System.out.println("MATRIZ 1");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.println("Digite o valor da coluna: "+i+" posição: "+j+"\n> ");
                mat1[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\n=========");
        System.out.println("MATRIZ 2");
        System.out.println("=========");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                System.out.println("Digite o valor da coluna: "+i+" posição: "+j+"\n> ");
                mat2[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<maior.length;i++){
            for(int j=0;j<maior[i].length;j++){
                if(mat1[i][j]>mat2[i][j]){
                    maior[i][j] = mat1[i][j];
                }
                else{
                    maior[i][j] = mat2[i][j];
                }
            }
        }

        for(int i=0;i<maior.length;i++){
            System.out.println("\n\n");
            System.out.println("==============================================================");
            System.out.println("\t\t\tCOLUNA "+i);
            System.out.println("==============================================================");
            for(int j=0;j<maior[i].length;j++){
                System.out.println("======================");
                System.out.println("coluna: "+i+" linha: "+j+" = "+maior[i][j]);
                System.out.println("======================");
            }
        }
    }
}
