package br.com.hcode.solid.isp;

import br.com.hcode.solid.isp.vehicles.Car;
import br.com.hcode.solid.isp.vehicles.Motorcycle;

public class Main {
    private static String type;
    public static void main(String[] args) {

        type = "motorcycle";
        if (type == "car"){
            Car car = new Car("Azul", "2022", 2.6, 4);
        }else {
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 250);
        }
    }
}