import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[6][6];
        int x, confirma=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.println("Digite o valor da coluna: "+i+" posição: "+j+"\n> ");
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Que valor você deseja buscar dentro da matriz: ");
        x = scan.nextInt();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(x==mat[i][j]){
                    System.out.println("\n\nO numero que você deseja existe na coluna "+i+" linha: "+j);
                    confirma=1;
                }
            }
        }
        if(confirma==0){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nNão encontrado");
        }
    }
}
