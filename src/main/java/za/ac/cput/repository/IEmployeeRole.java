package za.ac.cput.repository;
/*
 * @author Reanetsi Sholoko
 * student no: 218160402
 *
 * */
import za.ac.cput.entity.EmployeeRole;

import java.util.Set;

public interface IEmployeeRole extends Irepository<EmployeeRole, String>{
    public Set<EmployeeRole> getAll();

}
