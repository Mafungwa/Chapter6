package za.ac.cput.service;

import za.ac.cput.domain.Login;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String>{
    Set<Login> getAll();
}
