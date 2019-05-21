package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Payment;
import za.ac.cput.repository.PaymentRepository;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepositoryImpl implements PaymentRepository {

    private static PaymentRepositoryImpl repository = null;
    private Set<Payment> payments;

    private PaymentRepositoryImpl(){
        this.payments = new HashSet<>();

    }
    public static PaymentRepository getRepository(){
        if(repository == null) repository = new PaymentRepositoryImpl();
        return repository;
    }

    public Set<Payment> getAll() {
        return null;
    }

    public Payment create(Payment payment) {
        return null;
    }

    public Payment update(Payment payment) {
        return null;
    }

    public void delete(String s) {

    }

    public Payment read(String s) {
        return null;
    }
}
