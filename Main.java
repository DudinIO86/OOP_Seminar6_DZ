import java.util.ArrayList;
import java.util.Iterator;

public class Main implements GenBox,PrintBox {
    /**
     В коде используются принципы единной ответственности, открытости и закрытости, подстаноки Лисков и разделения интерфеса
     **/

    public static void main(String[] args) {
        Box <Fruit> b=GenBox.getFruitBox();
        System.out.println("Состав корзины:");
        PrintBox.printBox(b);
    }

}
