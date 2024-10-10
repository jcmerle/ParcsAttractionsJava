package Domain.VO;

import java.util.ArrayList;
import java.util.Objects;

public class Parc {
    private int id;
    private String name;
    private Location location;
    private int capacity;
    private ArrayList<Attractions> attractions;
    private Time openingTime;
    private Time closingTime;
    private ArrayList<Restaurants> restaurants;

    public Parc(int id, String name, Location location, int capacity, ArrayList<Attractions> attractions, Time openingTime, Time closingTime, ArrayList<Restaurants> restaurants) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.attractions = attractions;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.restaurants = restaurants;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Attractions> getAttractions() {
        return attractions;
    }

    public Time getOpeningTime() {
        return openingTime;
    }

    public Time getClosingTime() {
        return closingTime;
    }

    public ArrayList<Restaurants> getRestaurants() {
        return restaurants;
    }
    
    public boolean isParcOpen(Time time){
        return time.compareTo(openingTime) >= 0 && time.compareTo(closingTime) <= 0;
    }

    public boolean isNear(Location other, double distance){
        return location.isNear(other, distance);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, location, capacity, attractions, openingTime, closingTime);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Parc other = (Parc) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(location, other.location) && Objects.equals(capacity, other.capacity) && Objects.equals(attractions, other.attractions) && Objects.equals(openingTime, other.openingTime) && Objects.equals(closingTime, other.closingTime);
    }

    @Override
    public String toString(){
        return name + " at " + location + " with " + attractions.size() + " attractions";
    }
}