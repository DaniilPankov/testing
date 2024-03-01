import java.util.Iterator;

public class EconomClass extends Class{

    public EconomClass() {
        for (int i = 0; i < 150; i++) {
            people.add(new Passenger(40, 20));
        }
    }

    
    public Iterator<PersonComponent> getIterator(){
        return people.iterator();
    }
}
