package za.ac.cput.service;

import za.ac.cput.domain.Admin;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AdminService extends IService<Admin, String> {
    Set<Admin> getAll();
}
