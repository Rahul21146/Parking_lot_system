package Interface;

public abstract class ParkingSpot {

    protected int id;
    protected boolean isFree = true;
    protected Vechile vechile;

    public ParkingSpot(int id){
        this.id = id;
    }

    public boolean getIsFree(){
        return isFree;
    }

    public void assignVehicle(Vechile v){
        this.vechile = v;
        this.isFree = false;
        System.out.println("Vehicle parked at spot: " + id);
    }

    public void removeVehicle(){
        this.vechile = null;
        this.isFree = true;
        System.out.println("Parking spot " + id + " is now free");
    }

    public int getId(){
        return id;
    }
}