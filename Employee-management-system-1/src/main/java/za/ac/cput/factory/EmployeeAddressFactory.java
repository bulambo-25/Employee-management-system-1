package za.ac.cput.factory;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.util.Helper;

public class EmployeeAddressFactory {
    public  static EmployeeAddress createEmployeeAddress(String employeeID, String employeeTypeID){

        return new EmployeeAddress.Builder().setEmployeeID(employeeID).setEmployeeTypeID(employeeTypeID).build();

    }
}
