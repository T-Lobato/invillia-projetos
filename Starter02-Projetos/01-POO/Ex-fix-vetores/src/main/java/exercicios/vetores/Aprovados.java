package exercicios.vetores;

import entities.Alunos;
import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entrada
        System.out.print("Quantos alunos serão digitados: ");
        int number = sc.nextInt();
        Alunos[] vect = new Alunos[number];
        int indice = 1;

        //Processamento
        for(int i = 0; i < vect.length; i++, indice++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", indice);
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Alunos(nome, nota1, nota2);
        }
        //Saída
        System.out.println("Alunos Aprovados:");
        for (Alunos alunos : vect) {
            if ((alunos.getNota1() + alunos.getNota2()) / 2 >= 6) {
                System.out.println(alunos.getNome());
            }
        }
        sc.close();
    }
}