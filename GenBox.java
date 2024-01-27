public interface GenBox {
    //принцип разделения интерфейса и единой ответственности.
    // Отдельно создан интерфейс, генерирующий наполнение корзины.
    static public Box<Fruit> getFruitBox(){
        Box<Fruit> newBox=new Box<>();
        Fruit<Apple> apple=new Apple<>();//Принцип подставновки Лисков. Тип указан базового класса, но при этом создаем объект подкласса
        Fruit<Orange> orange=new Orange<>();//Принцип подставновки Лисков. Тип указан базового класса, но при этом создаем объект подкласса

        for (int i = 0; i < 5; i++) {
            newBox.put(apple);
            newBox.put(orange);

        }
        return newBox;
    }


}
