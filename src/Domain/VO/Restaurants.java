package Domain.VO;

import java.util.Objects;

public class Restaurants{
    private final String name;
    private final int capacity;
    private final Meals meal;

    public Restaurants(String name, int capacity, Meals meal){
        this.name = name;
        this.capacity = capacity;
        this.meal = meal;
    }

    public String getName(){
        return name;
    }

    public int getCapacity(){
        return capacity;
    }

    public Meals getMeal(){
        return meal;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, capacity, meal);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Restaurants other = (Restaurants) obj;
        return Objects.equals(name, other.name) && capacity == other.capacity && meal.equals(other.meal);
    }

    @Override
    public String toString(){
        return name + "[capacity: " + capacity + ", serves: " + meal + "]";
    }
}
