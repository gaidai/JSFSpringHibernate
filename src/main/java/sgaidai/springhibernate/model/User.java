package sgaidai.springhibernate.model;




import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
@ManagedBean(name="user")
public class User  implements java.io.Serializable {

    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="user_id")
    private int userId;
    
    @Getter
    @Setter 
    @Column(name="first_name")
    private String firstName;
    
    @Getter
    @Setter 
    @Column(name="last_name")
    private String lastName;
    
    @Getter
    @Setter
    @Column(name="email")
    private String email;
    
    @Getter
    @Setter 
    @Column(name="user_name")
    private String username;
    
    @Getter
    @Setter 
    @Column(name="password")
    private String password;
    
    @Getter
    @Setter 
    @Column(name="enabled")
    private Boolean enabled; 
       
    @Getter
    @Setter
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="user")
    private Set<Role> roles = new HashSet<Role>(0);


public void reset(){
        this.userId = 0;
        this.firstName ="";
        this.lastName ="";
        this.email ="";
        this.password = "";
        this.username ="";
        this.roles = null;
        this.enabled= true;
        
    }

}


