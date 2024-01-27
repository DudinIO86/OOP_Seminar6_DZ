import java.util.ArrayList;

public class Box <T extends Fruit>{
    //соблюдается принцип единой ответственности
    private ArrayList<T> boxFruit;

    public Box (){
        boxFruit=new ArrayList<>();
    }

    public void put(T item){
        boxFruit.add(item);
    }

    public T get(int index){
        return (T) boxFruit.get(index);
    }

    public int volume(){
        return boxFruit.size();
    }


}
