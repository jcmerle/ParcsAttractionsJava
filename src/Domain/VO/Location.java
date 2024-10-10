package Domain.VO;

import java.util.Objects;

public class Location {
    private final double x;
    private final double y;

    public Location(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean isNear(Location other, double distance){
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2)) <= distance;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Location other = (Location) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
