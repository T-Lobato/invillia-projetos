package br.com.hcode.solid.ocp.vehicles;

public interface IVehicleCar {
    public void configureVehicle(String color, String year, double engine, int seats);
    public void startVehicle();
}
