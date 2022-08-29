package exercicios.vetores;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantos números você vai digitar: ");
        int number = sc.nextInt();
        int[] vect = new int[number];
        int quantPares = 0;

        //Processamento
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        //Saída
        System.out.println("Números pares:");
        for (int j : vect) {
            if (j % 2 == 0) {
                quantPares++;
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.printf("Quantidade de pares = %d\n", quantPares);
        sc.close();
    }
}