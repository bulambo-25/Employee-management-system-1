package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.Gender;

import java.util.Set;

public interface IGender extends  Irepository<Gender, String>
{



public Set<Gender> getAll();
        }

