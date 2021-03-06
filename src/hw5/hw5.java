package hw5;
/*
    Задачи на взаимодействие классов:
    1. Класс кота из прошлого ДЗ расширить функционалом потребления пищи. У каждого кота есть аппетит, т.е. количество еды, которое он съедает за один раз;
    2. Кот должен есть из миски. Создайте такую сущность, которая будет обладать объёмом и едой в ней, а также методами наполнения и получения информации о количестве еды;
    3. Метод из первого пункта ДЗ должен взаимодействовать с миской, т.е., конкретный кот ест из конкретной миски, уменьшая объём еды в ней;
    4. Предусмотрите проверку, при которой в миске не может получиться отрицательного количества еды (например, в миске 10 единиц еды, а кот пытается съесть 15);
    5. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось поесть (хватило еды), сытость = true;
    Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы);
    6. Создать массив котов и одну тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль;
    7. Когда еда в тарелке кончается, нужно оповещать об этом и наполнять её едой.
 */
public class hw5 {
    public static void main(String[] args) {
        //миска
        FoodContainer dish = new Dish(20);
        dish.setFoodVolume(15);
        //коты
        Cat[] cats = new Cat[3];
        cats[0]=new Cat();  //дефолтный кот, ест 10
        cats[1] = new Cat();
        cats[1].setEatLimit(5);  //котенок
        cats[2] = new Cat();
        cats[2].setEatLimit(24);  //обжора

        for (Cat cat : cats){  //Сat - ссылочный тип, поэтому можно и так обходить. Возможность менять объекты Cat не пропадает
            //пусть их именами остаются идентификаторы
            System.out.println("\nКот "+ cat.toString()+ " ест:");
            cat.eatFrom(dish);
            System.out.println("Сытость кота: "+cat.isSatiety());
        }
    }
}
