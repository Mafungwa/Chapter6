package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface PaymentRepository extends IRespository<Payment,String> {
    Set<Payment> getAll();

}
