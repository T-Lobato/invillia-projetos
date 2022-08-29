package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Objetos
        System.out.print("Quantos elementos vai ter o vetor? ");
        int number = sc.nextInt();
        double[] vetor = new double[number];
        double total = 0.0;
        double media;

        //Processamento
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            total += vetor[i];
        }

        media = total / vetor.length;
        System.out.println();
        System.out.printf("Média do vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da média:");
        for (double v : vetor) {
            if (v < media) System.out.println(v);
        }
        sc.close();
    }
}