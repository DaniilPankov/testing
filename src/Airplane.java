import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Airplane {
    protected final int LUGGAGELIMIT = 5000;
    protected List<Pilot> pilots = new LinkedList<>();
    protected List<Stewardess> flightAttendants = new LinkedList<>();
    protected FirstClass firstClass;
    protected BussinesClass bussinesClass;
    protected EconomClass economClass;

    public Airplane(){
        pilots.add(new Pilot());
        pilots.add(new Pilot());

        for(int i = 0; i < 6; i++){
            flightAttendants.add(new Stewardess());
        }

        firstClass = new FirstClass();
        bussinesClass = new BussinesClass();
        economClass = new EconomClass();
    }

    private int getLuggageWeight(){
        int sum = 0;
        sum += firstClass.getLuggageWeight() + bussinesClass.getLuggageWeight() + economClass.getLuggageWeight();
        return sum;
    }
    public void takeOff(){
        System.out.printf("Вес багажа пассажиров первого класса - %d кг\n", firstClass.getLuggageWeight());
        System.out.printf("Вес багажа пассажиров бизнес класса - %d кг\n", bussinesClass.getLuggageWeight());
        System.out.printf("Вес багажа пассажиров эконом класса - %d кг\n", economClass.getLuggageWeight());
        System.out.printf("Итого                               - %d ru\n", getLuggageWeight());
        if(pilots.size() != 2){
            System.out.println("Самолет не может взлететь: в нем не 2 пилота");
        }else if(flightAttendants.size() != 6){
            System.out.println("Самолет не может взлететь: в нем не 6 стюардесс");
        } else if(getLuggageWeight() > LUGGAGELIMIT){
            System.out.println("Самолет не может взлететь: Перегруз");
            System.out.println("Начинаем снимать с рейса багаж пассажиров эконом класса");
            Iterator<PersonComponent> iter = economClass.getIterator();
            int counter = 1;
            while (getLuggageWeight() > LUGGAGELIMIT){
                PersonComponent person = iter.next();
                person.reduceLuggage();
                System.out.printf("Пассажир с номером %d лишился багажа\n", counter);
                counter++;
            }
            System.out.printf("Текущий вес самолета - %d\n", getLuggageWeight());
            System.out.println("Самолет готов к вылету!!!");
        }
    }


}
