package za.ac.cput.repository;

import za.ac.cput.domain.Catalog_Item;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface Catalog_ItemRepository extends IRespository<Catalog_Item,String> {
    Set<Catalog_Item> getAll();

}
