package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.General_Worker;
import za.ac.cput.repository.General_WorkerRepository;

import java.util.HashSet;
import java.util.Set;

public class General_WorkerRepositoryImpl implements General_WorkerRepository {

    private static General_WorkerRepositoryImpl repository = null;
    private Set<General_Worker> general_workers;

    private General_WorkerRepositoryImpl(){
        this.general_workers = new HashSet<>();

    }
    public static General_WorkerRepository getRepository(){
        if(repository == null) repository = new General_WorkerRepositoryImpl();
        return repository;
    }

    public Set<General_Worker> getAll() {
        return null;
    }

    public General_Worker create(General_Worker general_worker) {
        return null;
    }

    public General_Worker update(General_Worker general_worker) {
        return null;
    }

    public void delete(String s) {

    }

    public General_Worker read(String s) {
        return null;
    }
}
