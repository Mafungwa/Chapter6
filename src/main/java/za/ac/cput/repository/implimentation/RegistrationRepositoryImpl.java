package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Registration;
import za.ac.cput.repository.RegistrationRepository;

import java.util.HashSet;
import java.util.Set;

public class RegistrationRepositoryImpl implements RegistrationRepository {

    private static RegistrationRepositoryImpl repository = null;
    private Set<Registration> registrations;

    private RegistrationRepositoryImpl(){
        this.registrations = new HashSet<>();

    }
    public static RegistrationRepository getRepository(){
        if(repository == null) repository = new RegistrationRepositoryImpl();
        return repository;
    }

    public Set<Registration> getAll() {
        return null;
    }

    public Registration create(Registration registration) {
        return null;
    }

    public Registration update(Registration registration) {
        return null;
    }

    public void delete(String s) {

    }

    public Registration read(String s) {
        return null;
    }
}
