package sgaidai.springhibernate.service;

import java.util.List;

import sgaidai.springhibernate.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}