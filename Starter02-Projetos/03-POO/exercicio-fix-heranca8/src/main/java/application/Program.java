package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if( ch == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                Integer numberOfImployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfImployees));
            }
        }

        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for(TaxPayer tp : list){
            double tax = tp.tax();
            System.out.printf("%s: $ %.2f\n", tp.getName(), tp.tax());
            sum += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f\n", sum);
    }
}