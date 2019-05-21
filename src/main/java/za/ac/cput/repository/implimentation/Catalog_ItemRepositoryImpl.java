package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Catalog_Item;
import za.ac.cput.repository.Catalog_ItemRepository;

import java.util.HashSet;
import java.util.Set;

public class Catalog_ItemRepositoryImpl implements Catalog_ItemRepository {

    private static Catalog_ItemRepositoryImpl repository = null;
    private Set<Catalog_Item> catalog_items;

    private Catalog_ItemRepositoryImpl(){
        this.catalog_items = new HashSet<>();

    }
    public static Catalog_ItemRepository getRepository(){
        if(repository == null) repository = new Catalog_ItemRepositoryImpl();
        return repository;
    }


    public Set<Catalog_Item> getAll() {
        return null;
    }
    public Catalog_Item create(Catalog_Item catalog_item) {
        return null;
    }
    public Catalog_Item update(Catalog_Item catalog_item) {
        return null;
    }
    public void delete(String s) {

    }
    public Catalog_Item read(String s) {
        return null;
    }
}
