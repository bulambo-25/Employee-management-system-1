package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Gender;

import java.util.Set;

public interface IGender extends JpaRepository<Gender, String>
{

}

