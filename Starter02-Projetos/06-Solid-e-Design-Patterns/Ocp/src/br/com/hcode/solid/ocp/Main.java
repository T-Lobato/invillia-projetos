package br.com.hcode.solid.ocp;

import br.com.hcode.solid.ocp.vehicles.Car;
import br.com.hcode.solid.ocp.vehicles.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {

        typeVehicle = TypeVehicle.MOTORCYCLE;

        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Azul","2022",  2.6, 4);
        }else if (typeVehicle == TypeVehicle.MOTORCYCLE){
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 250);
        }
    }
}