package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantos elementos vai ter o vetor? ");
        int indice = sc.nextInt();
        int[] vetor = new int[indice];
        int somaPares = 0;
        double media;
        double quantPares = 0;

        //Processamento
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantPares++;
            }
        }
        if(somaPares == 0) System.out.println("Nenhum número par!");
        else {
            media = (double) somaPares / quantPares;
            System.out.printf("Média dos pares = %.1f\n", media);
        }
    }
}