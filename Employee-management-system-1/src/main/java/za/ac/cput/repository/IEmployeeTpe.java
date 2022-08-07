package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.EmployeeType;

import java.util.Set;
@Repository
public interface IEmployeeTpe extends JpaRepository<EmployeeType, String>
{

}
