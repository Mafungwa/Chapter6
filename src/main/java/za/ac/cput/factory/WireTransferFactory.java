package za.ac.cput.factory;

import za.ac.cput.domain.WireTransfer;
import za.ac.cput.util.Misc;

public class WireTransferFactory {
    public static WireTransfer getWireTransfer(String bankIdF,String bankNameF){
        return new WireTransfer.Builder()
                .bankId(bankIdF)
                .bankName(bankNameF)
                .bankId(Misc.generateId())
                .build();
    }
}
