package za.ac.cput.service;

import za.ac.cput.domain.Payment;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PaymentService extends IService<Payment,String>{
    Set<Payment> getAll();
}
