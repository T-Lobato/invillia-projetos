package br.com.hcode.solid.lsp;

public class CreditCard extends NubankCard{
    @Override
    public void validate() throws Exception{
        //validação do cartão de crédito
        System.out.println("Validando Limite!");
        System.out.println("Limite Ok!");
    }
}