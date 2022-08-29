package exercicios.vetores;

import entities.Pessoas;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantas pessoas você vai digitar? ");
        int number = sc.nextInt();
        Pessoas[] vect = new Pessoas[number];
        int indice = 1;
        int idadeDoMaisVelho = 0;
        String nomeDoMaisVelho = "";

        for(int i = 0; i < vect.length; i++, indice++){
            System.out.printf("Dados da %da pessoa:\n", indice);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoas(nome, idade);
        }

        for (Pessoas pessoas : vect) {
            if (pessoas.getIdade() > idadeDoMaisVelho) {
                idadeDoMaisVelho = pessoas.getIdade();
                nomeDoMaisVelho = pessoas.getNome();
            }
        }

        System.out.printf("Pessoa mais velha: %s\n", nomeDoMaisVelho);
        sc.close();
    }
}