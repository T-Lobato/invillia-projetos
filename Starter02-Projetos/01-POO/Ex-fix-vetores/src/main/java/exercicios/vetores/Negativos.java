package exercicios.vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entrada
        System.out.print("How many number will you type? ");
        int number = sc.nextInt();
        int[] vect = new int[number];

        //Processamento
        for(int i = 0; i < vect.length; i++){
            System.out.print("Write a number: ");
            vect[i] = sc.nextInt();
        }
        //Saída
        System.out.println("Negative Numbers:");
        for (int j : vect) {
            if (j < 0) System.out.println(j);
        }
        sc.close();
    }
}