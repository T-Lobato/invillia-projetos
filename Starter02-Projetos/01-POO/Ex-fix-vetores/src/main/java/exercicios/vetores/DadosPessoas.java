package exercicios.vetores;

import entities.Pessoas;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        //Objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entradas
        System.out.print("Quantas pessoas serão digitadas? ");
        int number = sc.nextInt();
        Pessoas[] vect = new Pessoas[number];
        int indice = 1;
        double menorAltura, maiorAltura, mediaAlturaMulheres;
        double alturaMulheres = 0.0;
        int quantHomens = 0;
        int quantMulheres = 0;

        //Processamento
        for(int i = 0; i < vect.length; i++, indice++){
            System.out.printf("Altura da %da pessoa: ", indice);
            double altura = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", indice);
            char genero = sc.next().charAt(0);
            vect[i] = new Pessoas(altura, genero);
        }

        menorAltura = vect[0].getAltura();
        maiorAltura = vect[0].getAltura();

        //for para determinar a menorAltura e a maiorAltura respectivamente.
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getAltura() < menorAltura){
                menorAltura = vect[i].getAltura();
            }
            if(vect[i].getAltura() > maiorAltura){
                maiorAltura = vect[i].getAltura();
            }
        }

        //for para deteminar a media da altura das mulheres e o número total de homens.
        for(int i = 0; i < vect.length; i++){
           if(vect[i].getGenero() == 'F'){
               alturaMulheres += vect[i].getAltura();
               quantMulheres++;
           }
           else if(vect[i].getGenero() == 'M'){
               quantHomens++;
           }
        }
        mediaAlturaMulheres = alturaMulheres / quantMulheres;
        //Saída
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Número de homens %d\n", quantHomens);
        sc.close();
    }
}