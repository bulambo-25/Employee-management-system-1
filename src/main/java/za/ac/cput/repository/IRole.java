package za.ac.cput.repository;
/*
 * @author Reanetsi Sholoko 218160402
 *
 * */
import za.ac.cput.entity.Role;

import java.util.Set;

public interface IRole extends Irepository<Role, String> {
    public Set<Role> getAll();
}
