package sgaidai.springhibernate.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

     
// index.xhtml
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Friends")
@ManagedBean(name="friend")
public class Friend implements Serializable {
    
    @Getter
    @Setter
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Getter
    @Setter
    @Column(name="firstname")
    private String firstname;
    
    @Getter
    @Setter
    @Column(name="secondname")
    private String secondname;
    
    @Getter
    @Setter
    @Column(name="phone")
    private int phone;
    
    @Getter
    @Setter
    @Column(name="description")
    private String desc;
 
   }
