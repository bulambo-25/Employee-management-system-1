package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
@Entity
public class EmployeeAddress {
    @Id
    private  String id;
    private  String employeeID;
    private  String employeeTypeID;

    public EmployeeAddress(Builder builder) {
        this.employeeID= builder.employeeID;
        this.employeeTypeID= builder.employeeTypeID;

    }

    public EmployeeAddress() {

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeTypeID() {
        return employeeTypeID;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "genderID='" + employeeID + '\'' +
                ", genderType='" +employeeTypeID + '\'' +

                '}';
    }

    public static class Builder{
        private  String employeeID;
        private  String employeeTypeID;

        public EmployeeAddress.Builder setEmployeeID(String employeeID) {
            this.employeeID= employeeID;
            return  this;
        }

        public EmployeeAddress.Builder setEmployeeTypeID(String employeeTypeID) {
            this.employeeTypeID= employeeTypeID;
            return  this;
        }

        public EmployeeAddress.Builder copy(EmployeeAddress employeeAddress) {
            this.employeeID =employeeAddress.employeeID;
            this.employeeTypeID=employeeAddress.employeeTypeID;


            return this;

        }
        public EmployeeAddress build() {

            return new EmployeeAddress(this);
        }
    }
}
