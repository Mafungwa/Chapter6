package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Work;
import za.ac.cput.repository.WorkRepository;

import java.util.HashSet;
import java.util.Set;

public class WorkRepositoryImpl implements WorkRepository {

    private static WorkRepositoryImpl repository = null;
    private Set<Work> works;

    private WorkRepositoryImpl(){
        this.works = new HashSet<>();

    }
    public static WorkRepository getRepository(){
        if(repository == null) repository = new WorkRepositoryImpl();
        return repository;
    }

    public Set<Work> getAll() {
        return null;
    }

    public Work create(Work work) {
        return null;
    }

    public Work update(Work work) {
        return null;
    }

    public void delete(String s) {

    }

    public Work read(String s) {
        return null;
    }
}
