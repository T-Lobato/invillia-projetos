package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int codeStudent;

        System.out.print("How many students for course A: ");
        int numberEnter = sc.nextInt();
        for(int i = 0; i < numberEnter; i++) {
            codeStudent = sc.nextInt();
            a.add(codeStudent);
        }

        System.out.print("How many students for course B: ");
        numberEnter = sc.nextInt();
        for(int i = 0; i < numberEnter; i++) {
            codeStudent = sc.nextInt();
            b.add(codeStudent);
        }

        System.out.print("How many students for course C: ");
        numberEnter = sc.nextInt();
        for(int i = 0; i < numberEnter; i++) {
            codeStudent = sc.nextInt();
            c.add(codeStudent);
        }

        b.addAll(a); // Soma os valores existentes em 'a' com os valores existentes em 'b' - Excluindo números repetidos
        c.addAll(b); // Soma os valores existentes em 'b' com os valores existentes em 'c' - Excluindo números repetidos

        System.out.printf("Total students: %d\n", c.size()); // Imprime o tamanho do Set 'c'.
        sc.close();

    }
}