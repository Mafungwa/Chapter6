package za.ac.cput.service;

import za.ac.cput.domain.Catalog_Item;
import za.ac.cput.service.IService;

import java.util.Set;

public interface Catalog_ItemService extends IService<Catalog_Item,String>{
    Set<Catalog_Item> getAll();
}
