package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Item;
import za.ac.cput.repository.ItemRepository;

import java.util.HashSet;
import java.util.Set;

public class ItemRepositoryImpl implements ItemRepository {

    private static ItemRepositoryImpl repository = null;
    private Set<Item> items;

    private ItemRepositoryImpl(){
        this.items = new HashSet<>();

    }
    public static ItemRepository getRepository(){
        if(repository == null) repository = new ItemRepositoryImpl();
        return repository;
    }

    public Set<Item> getAll() {
        return null;
    }

    public Item create(Item item) {
        return null;
    }

    public Item update(Item item) {
        return null;
    }

    public void delete(String s) {

    }

    public Item read(String s) {
        return null;
    }
}
