public class Pilot extends Person{

    public Pilot() {
        super(0,0);
    }

    @Override
    protected void addLuggage(int weight) {
        System.out.println("У пилота нет багажа.");
    }






    @Override
    public void reduceLuggage() {
        System.out.println("У пилота нет багажа.");
    }

    @Override
    public int getLuggageWeight() {
        return 0;
    }

    public void test3(){
        System.out.println("test3");
    }
}
