package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Login;
import za.ac.cput.repository.LoginRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginRepositoryImpl implements LoginRepository {

    private static LoginRepositoryImpl repository = null;
    private Set<Login> logins;

    private LoginRepositoryImpl(){
        this.logins = new HashSet<>();

    }
    public static LoginRepository getRepository(){
        if(repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    public Set<Login> getAll() {
        return null;
    }

    public Login create(Login login) {
        return null;
    }

    public Login update(Login login) {
        return null;
    }

    public void delete(String s) {

    }

    public Login read(String s) {
        return null;
    }
}
