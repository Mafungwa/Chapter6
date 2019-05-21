package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Job_History;
import za.ac.cput.repository.Job_HistoryRepository;

import java.util.HashSet;
import java.util.Set;

public class Job_HistoryRepositoryImpl implements Job_HistoryRepository {

    private static Job_HistoryRepositoryImpl repository = null;
    private Set<Job_History> job_histories;

    private Job_HistoryRepositoryImpl(){
        this.job_histories = new HashSet<>();

    }
    public static Job_HistoryRepository getRepository(){
        if(repository == null) repository = new Job_HistoryRepositoryImpl();
        return repository;
    }

    public Set<Job_History> getAll() {
        return null;
    }

    public Job_History create(Job_History job_history) {
        return null;
    }

    public Job_History update(Job_History job_history) {
        return null;
    }

    public void delete(String s) {

    }

    public Job_History read(String s) {
        return null;
    }
}
