package com.company;

public class Skeletons extends Boss {
    private int arrows = 25;

    public Skeletons(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }


    public String printInfo() {
        return super.printInfo() + getArrows();
    }

    public int getArrows() {
        return arrows;
    }
}



/*ДЗ на сообразительность:

● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
● Создать класс Скелетов, унаследовать от Босса.
● Добавить поле (кол-во стрел) и добавить геттеры.
● Переопределить родительский метод printInfo
● В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2
экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах*/
