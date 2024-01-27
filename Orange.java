public class Orange<T> extends Fruit<T>{

    //соблюдаются прицип единной ответственности и принцип закрытости, для которого создан класс апельсин наследуемый
    // от общего класса фрукты
    public Orange() {
        super();
    }

    @Override
    public String toString(){
        return "Orange";
    }

}
