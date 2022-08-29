package br.com.hcode.solid.lsp;

public class MainPayment {
    public static void main(String[] args) throws Exception {

//        CreditCard card = new CreditCard();
//        DebitCard card = new DebitCard();
        NubankRewards card = new NubankRewards();
        card.validate();
        card.collectPayment();
    }
}