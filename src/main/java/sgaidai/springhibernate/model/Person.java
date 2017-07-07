package sgaidai.springhibernate.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//person.xhtml
@ToString
@Entity
@Table(name="Person")
@ManagedBean(name="person")
public class Person implements Serializable {
    @Getter
    @Setter
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Getter
    @Setter
    private String name;
    
    @Getter
    @Setter
    private String country;
 
}