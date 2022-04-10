package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */

import za.ac.cput.entity.EmployeeType;

import java.util.Set;

public interface IEmployeeTpe extends  Irepository<EmployeeType, String>
{



    public Set<EmployeeType> getAll();
}
