public class Stewardess extends Person{

    public Stewardess() {
        super(0,0);
    }

    @Override
    protected void addLuggage(int weight) {
        System.out.println("У стюардессы нет багажа.");
    }

    @Override
    public void reduceLuggage() {
        System.out.println("У стюардессы нет багажа.");
    }

    @Override
    public int getLuggageWeight() {
        return 0;
    }
}
