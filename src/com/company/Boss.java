package com.company;

public class Boss extends GameEntity {

    private Weapon saber;

    public Weapon getSaber() {
        return saber;
    }

    public void setSaber(Weapon saber) {
        this.saber = saber;
    }

    public String printInfo() {
        return "\n\nStatistics: \n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon: " + getSaber().getNameOfWeapon() + "\n" +
                "Type: " + getSaber().getTypeOfWeapon();
    }
}

/*ДЗ на сообразительность:

● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
● Создать класс Скелетов, унаследовать от Босса.
● Добавить поле (кол-во стрел) и добавить геттеры.
● Переопределить родительский метод printInfo
● В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2
экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах*/