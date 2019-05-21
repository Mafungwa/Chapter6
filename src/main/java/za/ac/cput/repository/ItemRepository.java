package za.ac.cput.repository;

import za.ac.cput.domain.Item;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface ItemRepository extends IRespository<Item,String> {
    Set<Item> getAll();

}
