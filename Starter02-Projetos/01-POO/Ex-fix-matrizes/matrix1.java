import java.util.Scanner;

public class matrix1{
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Qual será a ordem da matriz? ");
        int ordem = sc.nextInt();
        int[][] mat = new int[ordem][ordem];
        int negativeNumbers = 0;

        //Processamento
        for(int i = 0; i < ordem; i++){
            for(int j = 0; j < ordem; j++){
                //System.out.print("Digite um número: ");
                mat[i][j] = sc.nextInt();
            }
        }

        //Saída
        System.out.println("Main Diagonal:");
        for(int i = 0; i < ordem; i++){
            for(int j = 0; j < ordem; j++){
                if(i == j){
                    System.out.println(mat[i][j] + " ");
                }
            }
        }

        for(int i = 0; i < ordem; i++){
            for(int j = 0; j < ordem; j++){
                if(mat[i][j] < 0){
                    negativeNumbers++;
                }
            }
        }
        System.out.printf("Negative numbers = %d.\n", negativeNumbers);
        sc.close();
    }
}