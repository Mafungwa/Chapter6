package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.WireTransfer;
import za.ac.cput.repository.WireTransferRepository;

import java.util.HashSet;
import java.util.Set;

public class WireTransferRepositoryImpl implements WireTransferRepository {

    private static WireTransferRepositoryImpl repository = null;
    private Set<WireTransfer> wireTransfers;

    private WireTransferRepositoryImpl(){
        this.wireTransfers = new HashSet<>();

    }
    public static WireTransferRepository getRepository(){
        if(repository == null) repository = new WireTransferRepositoryImpl();
        return repository;
    }

    public Set<WireTransfer> getAll() {
        return null;
    }

    public WireTransfer create(WireTransfer wireTransfer) {
        return null;
    }

    public WireTransfer update(WireTransfer wireTransfer) {
        return null;
    }

    public void delete(String s) {

    }

    public WireTransfer read(String s) {
        return null;
    }
}
