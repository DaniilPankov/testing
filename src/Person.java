public abstract class Person implements PersonComponent {
    protected final int limit;
    protected int luggageWeight = 0;

    protected Person(int luggageWeight, int limit) {
        this.luggageWeight = luggageWeight;
        this.limit = limit;
    }


    abstract protected void addLuggage(int weight);

    abstract public void reduceLuggage();

    abstract public int getLuggageWeight();

}
