package Domain.Repository;

import Domain.Aggregate.ParcCatalog;

public interface ParcCatalogRepository {
    public ParcCatalog findById(String id);
    public void save(ParcCatalog parcCatalog);
}
