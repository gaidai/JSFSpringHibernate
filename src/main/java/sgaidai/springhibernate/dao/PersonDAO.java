package sgaidai.springhibernate.dao;

import java.util.List;

import sgaidai.springhibernate.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}