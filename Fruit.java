public class Fruit <T>{
    //соблюдаются прицип единной ответственности и принцип закрытости, для которого создан общий класс фрукты, а далее
    //уже создаются подклассы от родительского яблоко и апельсин
    T fr;
    public Fruit(T ob){
        this.fr=ob;
    }

    public Fruit() {

    }

    @Override
    public String toString(){
        return fr.toString();
    }
}
