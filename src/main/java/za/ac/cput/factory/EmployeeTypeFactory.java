package za.ac.cput.factory;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.EmployeeType;
import za.ac.cput.util.Helper;

public class EmployeeTypeFactory {

    public  static EmployeeType createGender(String streetName, String postalCode,String areaName,String City){
        EmployeeType gender=new EmployeeType.Builder()

                .setStreetName(streetName).setPostalCode(postalCode).setAreaName(areaName).setCity(City).setEmployeeType(Helper.generateID()).build();
        return gender;
    }
    public static void main(String[] args) {
        System.out.println(EmployeeTypeFactory.createGender("","","",""));
    }
}
