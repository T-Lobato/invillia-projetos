package exercicios.vetores;

import entities.Pessoas;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int number = sc.nextInt();
        Pessoas[] vect = new Pessoas[number];
        int indice = 1;
        int menoresDeDezesseis = 0;
        double percent;
        double media = 0;

        //Processamento
        for(int i = 0; i < vect.length; i++, indice++){
            System.out.printf("Dados da %da pessoa:\n", indice);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        for (Pessoas value : vect) {
            media += value.getAltura();
            if (value.getIdade() < 16) menoresDeDezesseis++;
        }
        System.out.println();
        System.out.printf("Altura média: %.2f\n", media / vect.length);

        //Saída
        percent = (menoresDeDezesseis * 100.0) / vect.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);
        for (Pessoas alturas : vect) {
            if (alturas.getIdade() < 16) System.out.println(alturas.getNome());
        }
        sc.close();
    }
}