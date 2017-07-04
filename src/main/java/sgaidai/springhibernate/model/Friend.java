package sgaidai.springhibernate.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

// index.xhtml

@Entity
@Table(name="Friends")
@ManagedBean(name="friend")

public class Friend implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="firstname")
    private String firstname;
    
    @Column(name="secondname")
    private String secondname;
    
    
    @Column(name="phone")
    private int phone;
    
    @Column(name="description")
    private String desc;
 
   
    public Friend (){
    }

    public Friend(int id, String firstname, String secondname, int phone, String desc) {
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.phone = phone;
        this.desc = desc;
    }
    
    
    
     public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    
   
}
