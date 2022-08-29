package br.com.hcode.solid.dip.fatory;

import br.com.hcode.solid.dip.model.Db;
import br.com.hcode.solid.dip.model.IDbProduct;
import br.com.hcode.solid.dip.model.MongoDpProduct;
import br.com.hcode.solid.dip.model.MySQLProduct;
public class DbProductFactory {
    public static IDbProduct create(Db type){
        if(type == Db.MYSQL) {
            return new MySQLProduct();
        }else {
            return new MongoDpProduct();
        }
    }
}