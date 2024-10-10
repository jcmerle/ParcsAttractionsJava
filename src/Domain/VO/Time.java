package Domain.VO;

import java.util.Objects;

public class Time {
   private final int h;
   private final int m;
   
   public Time(int h, int m){
        this.h =h;
        this.m =m;
   }

   public int getHour(){
       return h;
   }

   public int getMinute(){
       return m;
   }

    public int compareTo(Time other){
          if(h < other.h){
                return -1;
          }
          if(h > other.h){
                return 1;
          }
          if(m < other.m){
                return -1;
          }
          if(m > other.m){
                return 1;
          }
          return 0;
    }
    
   @Override
   public int hashCode(){
        return Objects.hash(h, m);
   }
   
   @Override
   public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Time other = (Time) obj;
        return h== other.h && m == other.m;
   }

   @Override
   public String toString(){
    return h + ":" + m;
   }
}
