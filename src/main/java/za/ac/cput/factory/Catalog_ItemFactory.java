package za.ac.cput.factory;

import za.ac.cput.domain.Catalog_Item;
import za.ac.cput.util.Misc;

public class Catalog_ItemFactory {
    public static Catalog_Item getCatalog_Item(int qtyF, String taxStatusF){
        return new Catalog_Item.Builder()
                .qty(qtyF)
                .taxStatus(taxStatusF)
                .taxStatus(Misc.generateId())
                .build();
    }
}
