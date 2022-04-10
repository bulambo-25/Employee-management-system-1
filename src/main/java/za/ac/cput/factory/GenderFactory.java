package za.ac.cput.factory;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.Gender;
import za.ac.cput.util.Helper;

public class GenderFactory {

    public  static Gender createGender( String genderType, String description ){
        Gender gender=new Gender.Builder().setGenderID(Helper.generateID())
                .setGenderType(genderType).setDescription(description).build();
        return gender;
    }
}
