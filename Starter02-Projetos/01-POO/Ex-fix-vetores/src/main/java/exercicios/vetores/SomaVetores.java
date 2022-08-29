package exercicios.vetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantos valores vai ter cada vetor? ");
        int number = sc.nextInt();
        int[] vectA = new int[number];
        int[] vectB = new int[number];
        int[] vectC = new int[number];

        //Processamento
        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vectA.length; i++){
            vectB[i] = sc.nextInt();
        }

        //Saída
        System.out.println("Vetor Resultante:");
        for(int i = 0; i < vectA.length; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }
        sc.close();
    }
}