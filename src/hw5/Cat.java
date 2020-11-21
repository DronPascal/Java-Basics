package hw4;

public class Cat extends Animal {
    public Cat() {
        super(200, 2, 0);
    }

    /*
     * Для добавления разброса можно добавить методы  для настройки каждого параметра индивидуально, но мне кажется,
     * в задании хотят, чтобы это было реализовано в виде конструктора (хотя для большей гибкости надо и то и другое)
     */
    public Cat(double runLimit, double jumpLimit, double swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
        //если добавится еще какое-то ограничение, то будем его описывать тут + добавим поле для этого ограничения в этом классе
    }
}
