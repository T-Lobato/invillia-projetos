package exercicios.vetores;

import entities.PessoasPensionato;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("How many rooms will be rented? ");
        int number = sc.nextInt();
        PessoasPensionato[] vect = new PessoasPensionato[10];

        //Processamento
        for(int i = 0, indice; i < number; i++){
            System.out.printf("Rent #%d:\n", (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            System.out.println();
            indice = quarto;
            vect[indice] = new PessoasPensionato(nome, email, quarto);
        }
        //Saída
        System.out.println("Busy rooms:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.printf("%d: %s, %s\n", i, vect[i].getNome(), vect[i].getEmail());
            }
        }
    }
}