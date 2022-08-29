package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        //Objeto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("How many numbers will you type? ");
        int number = sc.nextInt();
        double[] vect = new double[number];
        double soma = 0;

        //Processamento & Saída
        for(int i = 0; i < vect.length; i++){
            System.out.print("Write a number: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.print("Valores = ");
        for (double j: vect) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", soma / vect.length);
    }
}