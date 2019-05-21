package za.ac.cput.service;

import za.ac.cput.domain.Registration;
import za.ac.cput.service.IService;

import java.util.Set;

public interface RegistrationService extends IService<Registration,String>{
    Set<Registration> getAll();
}
