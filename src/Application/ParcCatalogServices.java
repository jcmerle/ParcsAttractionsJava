package Application;

import java.util.ArrayList;

import Domain.VO.*;
import Domain.Aggregate.ParcCatalog;
import Domain.Repository.ParcCatalogRepository;
import Infrastructure.ParcCatalogRepositoryMem;

public class ParcCatalogServices {
    private final ParcCatalogRepository repo = new ParcCatalogRepositoryMem();
    private ParcCatalog lastParcCatalogUsed = null;

    private void getParcCatalog(String id){
        if(this.lastParcCatalogUsed == null || !this.lastParcCatalogUsed.getId().equals(id)){
            this.lastParcCatalogUsed = repo.findById(id);
        }
    }

    public void addParc(String id, Parc parc){
        getParcCatalog(id);
        lastParcCatalogUsed.addParc(parc);
        repo.save(lastParcCatalogUsed);
    }

    public void deleteParc(String id, Parc parc){
        getParcCatalog(id);
        lastParcCatalogUsed.removeParc(parc);
        repo.save(lastParcCatalogUsed);
    }

    public ArrayList<Parc> listParcByLocation(String id, Location location, double distance){
        getParcCatalog(id);
        return lastParcCatalogUsed.listParcByLocation(location, distance);
    }

    public ArrayList<Parc> listParcOpen(String id, Time time){
        getParcCatalog(id);
        return lastParcCatalogUsed.listParcOpen(time);
    }

    public void createCatalog(String id){
        ParcCatalog pc = new ParcCatalog(id);
        repo.save(pc);
    }
}
