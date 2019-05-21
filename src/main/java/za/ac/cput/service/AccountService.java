package za.ac.cput.service;

import za.ac.cput.domain.Account;
import za.ac.cput.service.IService;


import java.util.Set;

public interface AccountService extends IService<Account, String>{
    Set<Account> getAll();

}
