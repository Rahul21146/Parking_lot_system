import models.*;
import models.VehicleModels.Car;

public class Main {

    public static void main(String[] args) {

        PArkingLotSystem system = PArkingLotSystem.getInstance();

        Entrance entrance = new Entrance(1);
        Exit exit = new Exit(1);

        system.addEntrance(entrance);
        system.addExit(exit);

        Car car = new Car("UP32AB1234");

        ParkingTicket ticket = entrance.getTicket(car);

        try {
            Thread.sleep(3000);
        } catch (Exception e){}

        exit.validateTicket(ticket);

        System.out.println("Parking completed");

    }
}