package br.com.hcode.solid.dip.model;

public class MongoDpProduct implements IDbProduct{
    public String getProductById(String productID){
        return "MongoDB: Exibindo dados do Produto " + productID;
    }
}