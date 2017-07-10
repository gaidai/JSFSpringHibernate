package sgaidai.springhibernate.security.service;
 
import java.util.List; 
import sgaidai.springhibernate.exception.UserNotFoundException;
import sgaidai.springhibernate.model.User;
        
/**
 *
 * @author Raichand
 */
public interface UserService {
    
    public User create(User user);   
    public List<User> findAll();   
    public User findById(Integer id);
    public  int CreateNewUserId();
    
    
}
