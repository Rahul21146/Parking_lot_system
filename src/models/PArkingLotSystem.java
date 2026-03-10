package models;

import Interface.ParkingSpot;
import Interface.Vechile;

import java.util.HashMap;
import java.util.Map;

public class PArkingLotSystem {

    private int id;
    private String name;
    private String address;

    private final int MAX_CAPICITY = 40000;

    private Map<String, Entrance> entrance = new HashMap<>();
    private Map<String, Exit> exit = new HashMap<>();

    // ✅ Missing Map
    private Map<String, ParkingSpot> parkingSpot = new HashMap<>();

    private static PArkingLotSystem parkinglot = null;

    // Singleton Constructor
    private PArkingLotSystem(){}

    public static PArkingLotSystem getInstance(){

        if(parkinglot == null){
            parkinglot = new PArkingLotSystem();
        }

        return parkinglot;
    }

    // Generate ticket
    public ParkingTicket getParkingTicket(Vechile vechile){

        Entrance e = entrance.values().stream().findFirst().orElse(null);

        if(e == null){
            System.out.println("No entrance available");
            return null;
        }

        return e.getTicket(vechile);
    }

    // Add entrance
    public boolean addEntrance(Entrance e){
        entrance.put("E" + entrance.size(), e);
        return true;
    }

    // Add exit
    public boolean addExit(Exit e){
        exit.put("X" + exit.size(), e);
        return true;
    }

    // Check if parking full
    public boolean ifFull(){

        return parkingSpot.size() >= MAX_CAPICITY;
    }

    // Add parking spot
    public boolean addParkingSpot(String id, ParkingSpot spot){

        if(ifFull()){
            System.out.println("Parking Full");
            return false;
        }

        parkingSpot.put(id, spot);

        System.out.println("Parking Spot Added: " + id);

        return true;
    }

}