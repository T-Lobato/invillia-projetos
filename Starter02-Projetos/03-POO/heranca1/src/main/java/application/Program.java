package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

//        Account acc = new Account(1001, "Alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//
//        // UPCASTING
//        // Atribuindo um objeto da subclasse (bacc) a um objeto da superclasse (acc1).
//        Account acc1 = bacc;
//        // Atribuindo um objeto da subclasse para a super classe.
//        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//        // Atribuindo um objeto da subclasse para a super classe.
//        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//
//        // DOWNCASTING
//        // Um erro é informado ao tentar atribuir um objeto da superclasse (acc2) a um objeto da subclasse(acc4);
//          BusinessAccount acc4 = acc2;
//        // Para que isso seja possível, é necessário "forçar" a operação, fazendo um casting!
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
//        //Neste caso temos um erro pois a variável acc3 foi instanciada como SavingsAccount anteriormente.
//        // E não como Account ou como BusinessAccount.
//        // O programa não consegue dinstinguir isso por isso o erro só é acusado quando tentamos roda-lo.
//          BusinessAccount acc5 = (BusinessAccount) acc3;
//        // Para evitar este tipo de erro, podemos testar se o objeto pretendido é compatível com o casting que estamos
//        //tentando fazer!
//        if(acc3 instanceof BusinessAccount) {
//            BusinessAccount acc5 = (BusinessAccount)acc3;
//            acc5.loan(200.0);
//              System.out.println("Loan!");
//        }
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//              System.out.println("Updated!");
//        }

//        // Exemplo de Sobrescrita
//        // Testando o método withDraw da classe Account
//        Account acc1 = new Account(1001, "Alex", 1000.0);
//        acc1.withDraw(200.0);
//        System.out.println(acc1.getBalance());

//        // Testando o método withDraw da classe SavingsAccount (sobrescrito sem a taxa de 5).
//        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        acc2.withDraw(200.0);
//        System.out.println(acc2.getBalance());
//
//        // Testando a chamada de um método da superclasse através do 'super'.
//        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
//        acc3.withDraw(200.0);
//        System.out.println(acc3.getBalance());
//
//        // Entendendo Polimorfismo
//        // Chamando a mesma operacao, em variaveis do mesmo tipo (x e y) obtendo resultados diferentes.
//        Account x = new Account(1020, "Alex", 1000.0);
//        Account y = new SavingsAccount(1023,"Maria", 1000.0, 0.01);
//
//        x.withDraw(50.0);
//        y.withDraw(50.0);
//
//        System.out.println(x.getBalance());
//        System.out.println(y.getBalance());

//        //Entendendo o abstract
//        // Usando o abstract na classe Account ela não pode mais ser instanciada.
//        Account acc1 = new Account(1001, "Alex", 1000.0);
//        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
//
//        Locale.setDefault(Locale.US);
//        List<Account> list = new ArrayList<>();
//
//        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
//        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
//        list.add(new SavingsAccount(100, "Bob", 300.00, 0.01));
//        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
//
//        double sum = 0.0;
//        for(Account acc : list){
//            sum += acc.getBalance();
//        }
//f
//        System.out.printf("Total balance: %.2f\n", sum);
//
//        for(Account acc : list){
//            acc.deposit(10.0);
//        }
//        for(Account acc : list){
//            System.out.printf("Updated balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
//        }
    }
}