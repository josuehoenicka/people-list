package logic;

import java.util.List;
import persistence.ControllerPersistence;

public class Controller {
    
    ControllerPersistence controlPersis = new ControllerPersistence();

    public Controller() {
    }
    
    public void addPeople(People people){
        controlPersis.addPeople(people);
    }
    
    public void deletePeople(int id) {
        controlPersis.deletePeople(id);
    }
    
    public void deletePeople(People people) {
        controlPersis.deletePeople(people);
    }
    
    public List<People> getPeople() {
        return controlPersis.getPeople();
    }
    
}
