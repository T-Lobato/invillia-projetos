package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantos números você vai digitar? ");
        int number = sc.nextInt();
        double[] vect = new double[number];
        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        //Processamento
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < vect.length; i++) {
            if(vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }
        //Saída
        System.out.println();
        System.out.printf("Maior valor = %.1f\n", maiorValor);
        System.out.printf("Posição do maior valor = %d", posicaoMaiorValor);
        sc.close();
    }
}