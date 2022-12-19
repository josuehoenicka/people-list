package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.People;
import persistence.exceptions.NonexistentEntityException;

public class ControllerPersistence {
    
    PeopleJpaController peopleJPA = new PeopleJpaController(); 

    public ControllerPersistence() {
    }
    
    public void addPeople(People people) {
       peopleJPA.create(people);
    }
    
    public void deletePeople(int id) {
        try {
            peopleJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletePeople(People people) {
        try {
            peopleJPA.destroy(people.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<People> getPeople() {
        return peopleJPA.findPeopleEntities();
    }

    
}
