package Domain.VO;

import java.util.Objects;

public class Attractions {
    private final String name;
    private final int duration;
    private final int capacity;

    public Attractions(String name, int duration, int capacity) {
        this.name = name;
        this.duration = duration;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(name, duration, capacity);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Attractions other = (Attractions) obj;
        return Objects.equals(name, other.name) && duration == other.duration && capacity == other.capacity;
    }

    @Override
    public String toString(){
        return name + "[duration: " + duration + ", max capacity: " + capacity + "]";
    }
}
