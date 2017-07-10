package sgaidai.springhibernate.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sgaidai.springhibernate.model.Role;

/**
 *
 * @author Raichand
 */
public interface RoleRepository extends JpaRepository<Role,Integer>{
    
    @Query("SELECT max(r.roleId) FROM Role r")//Retrieving Maximun Id of UserRole Record
   int getMaxRoleId();
    
}
