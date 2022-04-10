package za.ac.cput.entity;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
public class EmployeeGender {
    private  String EmployeeId;
    private  String genderID;

    public EmployeeGender(Builder builder) {
        this.genderID= builder.genderID;
        this.EmployeeId= builder.EmployeeId;

    }
    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getGenderID() {
        return genderID;
    }


    @Override
    public String toString() {
        return "EmployeeGender{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }
    public static class Builder{
        private  String EmployeeId;
        private  String genderID;
        public EmployeeGender.Builder setEmployeeId(String employeeId) {
            this.EmployeeId= employeeId;
            return  this;
        }

        public EmployeeGender.Builder setGenderID(String genderID) {
            this.genderID= genderID;
            return  this;
        }

        public EmployeeGender.Builder copy(EmployeeGender employeeGender) {
            this.genderID =employeeGender.genderID;
            this.EmployeeId=employeeGender.EmployeeId;


            return this;

        }
        public EmployeeGender build() {

            return new EmployeeGender(this);
        }
    }


}
