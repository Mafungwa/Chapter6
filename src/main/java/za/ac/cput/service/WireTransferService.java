package za.ac.cput.service;

import za.ac.cput.domain.WireTransfer;
import za.ac.cput.service.IService;

import java.util.Set;

public interface WireTransferService extends IService<WireTransfer,String>{
    Set<WireTransfer> getAll();
}
