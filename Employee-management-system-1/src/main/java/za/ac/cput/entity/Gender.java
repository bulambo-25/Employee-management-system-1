package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.SEQUENCE;

/*
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022
*/
@Entity
public class Gender {
    @Id
    @SequenceGenerator(name ="genderID_Sequence",sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 7,initialValue = 200171763)
    @GeneratedValue(strategy = SEQUENCE ,generator = "genderID_Sequence")
    private  String genderID;
    private  String genderType;
    private  String description;
    public Gender(Builder builder) {
        this.genderID= builder.genderID;
        this.genderType = builder.genderType;
        this.description= builder.description;
    }

    public Gender() {

    }

    public String getGenderID() {
        return genderID;
    }

    public String getGenderType() {
        return genderType;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "Gender{" +
                "genderID='" + genderID + '\'' +
                ", genderType='" + genderType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private  String genderID;
        private  String genderType;
        private  String description;

        public Builder setGenderID(String genderID) {
            this.genderID = genderID;
            return  this;
        }

        public Builder setGenderType(String genderType) {
            this.genderType= genderType;
            return  this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return  this;
        }

        public Builder copy(Gender gender) {
            this.genderID =gender.genderID;
            this.genderType=gender.getGenderType();
            this.description =gender.description;

            return this;

        }
        public Gender build() {

            return new Gender(this);
        }
}}
