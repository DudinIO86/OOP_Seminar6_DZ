public class Apple<T>extends Fruit<T> {

    //соблюдаются прицип единной ответственности и принцип закрытости, для которого создан класс яблоко наследуемый
    // от общего класса фрукты
    public Apple() {
        super();
    }

    @Override
    public String toString(){
        return "Apple";
    }
}
