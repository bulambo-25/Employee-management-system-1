package za.ac.cput.factory;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */

import za.ac.cput.entity.EmployeeGender;
import za.ac.cput.util.Helper;

public class EmployeeGenderFactory {
    public  static EmployeeGender createEmployeeGender( ){
    EmployeeGender employeeGender=new EmployeeGender.Builder().
            setEmployeeId(Helper.generateID()).setGenderID(Helper.generateID()).build();
        return employeeGender;
}

}
