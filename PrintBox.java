public interface PrintBox {
    //принцип разделения интерфейса и единой ответственности.
    // Отдельно создан интерфейс, выводящий наполнение корзины.
    static public void printBox(Box <? extends Fruit> box){
        for (int i = 0; i <box.volume() ; i++) {
            System.out.println((i+1)+". "+box.get(i).toString());
        }
    }
}
