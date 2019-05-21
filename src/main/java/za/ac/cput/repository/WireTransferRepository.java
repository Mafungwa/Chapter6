package za.ac.cput.repository;

import za.ac.cput.domain.WireTransfer;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface WireTransferRepository extends IRespository<WireTransfer,String> {
    Set<WireTransfer> getAll();

}
