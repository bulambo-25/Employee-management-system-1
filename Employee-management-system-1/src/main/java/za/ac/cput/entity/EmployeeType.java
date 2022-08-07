package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
@Entity
public class EmployeeType
{     @Id
    private  String id;
    private  String streetName;
    private  String postalCode;
    private  String areaName;
    private  String City;
    private  String addressTypeID;
    public EmployeeType(Builder builder) {

        this.streetName = builder.streetName;
        this.postalCode= builder.postalCode;
        this.areaName = builder.areaName;
        this.City= builder.City;
        this.addressTypeID= builder.addressType;
    }

    public EmployeeType() {

    }

    public String getAddressType() {
        return addressTypeID;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getCity() {
        return City;
    }


    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "streetName='" + streetName + '\'' +
                ", addressType ='" + addressTypeID  + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
    public static class Builder{
        private  String addressType;
        private  String streetName;
        private  String postalCode;
        private  String areaName;
        private  String City;

        public EmployeeType.Builder setAddressType(String addressType) {
            this.addressType= addressType;
            return  this;
        }


        public EmployeeType.Builder setStreetName(String streetName) {
            this.streetName= streetName;
            return  this;
        }

        public EmployeeType.Builder setPostalCode(String postalCode) {
            this.postalCode= postalCode;
            return  this;
        }
        public EmployeeType.Builder setAreaName(String areaName) {
            this.areaName= areaName;
            return  this;
        }

        public EmployeeType.Builder setCity(String City) {
            this.City= City;
            return  this;
        }
        public EmployeeType.Builder setEmployeeType(String streetName) {
            this.streetName= streetName;
            return  this;
        }

        public EmployeeType.Builder copy(EmployeeType employeeType) {
            this.streetName=employeeType.streetName;
            this.addressType=employeeType.addressTypeID;
            this.postalCode =employeeType.postalCode;
            this.areaName=employeeType.areaName;
            this.City =employeeType.City;

            return this;

        }
        public EmployeeType build() {

            return new EmployeeType(this);
        }
    }

}
