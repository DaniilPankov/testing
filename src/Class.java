import java.util.ArrayList;
import java.util.List;

abstract public class Class implements PersonComponent {
    protected List<PersonComponent> people = new ArrayList<>();
    @Override
    public int getLuggageWeight() {
        int sum = 0;
        for (PersonComponent person : people) {
            sum += person.getLuggageWeight();
        }
        return sum;
    }

    @Override
    public void reduceLuggage() {
        for (PersonComponent person : people) {
            person.reduceLuggage();
        }
    }
}
