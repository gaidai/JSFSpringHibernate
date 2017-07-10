package sgaidai.springhibernate.security.service;

import java.util.List; 
import sgaidai.springhibernate.model.Role;
        
/**
 *
 * @author Raichand
 */
public interface RoleService {
    
    public Role create(Role userrole);
   
    public List<Role> findAll();
   
    public Role findById(Integer userRoleId);
    public  int CreateNewRoleId();
    
}
