package models;

import Interface.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {

    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id){
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    public void showFree(){

        System.out.println("Free Parking Spots:");

        for(String type : parkingSpots.keySet()){

            int free = 0;

            for(ParkingSpot spot : parkingSpots.get(type)){
                if(spot.getIsFree()){
                    free++;
                }
            }

            System.out.println(type + " -> " + free);
        }
    }

    public void sendParkingFullNotification(){
        System.out.println("Parking is FULL");
    }

    public void addParkingSlot(String spotType,List<ParkingSpot> spots){

        parkingSpots.put(spotType,spots);

    }
}