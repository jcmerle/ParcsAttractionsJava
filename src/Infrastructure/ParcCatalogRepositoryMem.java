package Infrastructure;

import java.util.HashMap;

import Domain.Repository.ParcCatalogRepository;
import Domain.Aggregate.ParcCatalog;

public class ParcCatalogRepositoryMem implements ParcCatalogRepository {
    private final HashMap<String, ParcCatalog> repo = new HashMap<String, ParcCatalog>();

    @Override
    public ParcCatalog findById(String id){
        return repo.get(id);
    }

    @Override
    public void save(ParcCatalog pc){
        repo.put(pc.getId(), pc);
    }
}
