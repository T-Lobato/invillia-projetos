package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

         /*  Conceito de injeção de dependência com inversão de controle e também interface.
         Onde o Programa principal, nesse caso o 'Program' fica responsável por instanciar
         um objeto na classe ContractService.
         A classe ContractService fica responsável apenas por receber um objeto
         do tipo OnlinePaymentService que é uma interface.
         A interface OnlinePaymentService por sua vez, tem seus métodos a seres implementados,
         permitindo que outras classes possam implementa-la, deixando assim uma organização melhor,
         pois como já vimos, a classe ContractService apenas recebe um objeto genérico do tipo OnlinePaymentService,
         o que possibilita, ao programa principal, instanciar qualquer classe que implemente essa interface,
         como por exemplo PaypalService que temos no programa, porém também poderiamos ter um GoogleWalletService,
         MercadoPagoService... e por aí vai.
         O x da questão é que, independente do tipo de serviço que apareça, a classe ContracService não precisará
         sofrer alterações.   */
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Installments:");
        for (Installment x : contract.getInstallments()) {
            System.out.println(x);
        }
        sc.close();
    }
}