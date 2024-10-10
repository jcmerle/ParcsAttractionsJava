package Domain.Aggregate;

import java.util.ArrayList;

import Domain.VO.*;

public class ParcCatalog {
    private final String id;
    private final ArrayList<Parc> parcs;
    
    public ParcCatalog(String id){
        this.id = id;
        this.parcs = new ArrayList<Parc>();
    }

    public String getId(){
        return id;
    }

    public void addParc(Parc parc){
        parcs.add(parc);
    }

    public void removeParc(Parc parc){
        parcs.remove(parc);
    }

    public ArrayList<Parc> getParcs(){
        return parcs;
    }

    public ArrayList<Parc> listParcByLocation(Location location, double distance){
        ArrayList<Parc> result = new ArrayList<>();
        for(Parc parc : parcs){
            if(parc.isNear(location, distance)){
                result.add(parc);
            }
        }
        return result;
    }

    public ArrayList<Parc> listParcOpen(Time time){
        ArrayList<Parc> result = new ArrayList<>();
        for(Parc parc : parcs){
            if(parc.isParcOpen(time)){
                result.add(parc);
            }
        }
        return result;
    }

}
