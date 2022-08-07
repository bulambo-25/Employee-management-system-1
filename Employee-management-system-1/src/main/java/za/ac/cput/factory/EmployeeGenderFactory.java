package za.ac.cput.factory;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */

import za.ac.cput.entity.EmployeeGender;
import za.ac.cput.util.Helper;

public class EmployeeGenderFactory {
    public  static EmployeeGender createEmployeeGender( String EmployeeId, String genderID){

        return new EmployeeGender.Builder().setEmployeeId(EmployeeId).setGenderID(genderID).build();
}

}
