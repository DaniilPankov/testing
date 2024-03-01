public class Passenger extends Person {

    public Passenger(int luggageWeight, int limit) {
        super(luggageWeight, limit);
    }

    @Override
    protected void addLuggage(int weight) {
        luggageWeight += weight;
    }

    @Override
    public void reduceLuggage() {
        luggageWeight=0;
    }

    @Override
    public int getLuggageWeight() {
        return luggageWeight;
    }
}
