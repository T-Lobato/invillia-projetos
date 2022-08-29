package br.com.hcode.solid.dip.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String productID){
        return "MySQL: Exibindo dados do Produto " + productID;
    }
}