package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWeapon;

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public Weapon setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        return null;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public Weapon setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
        return null;
    }


}



/*ДЗ на сообразительность:

● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
● Создать класс Скелетов, унаследовать от Босса.
● Добавить поле (кол-во стрел) и добавить геттеры.
● Переопределить родительский метод printInfo
● В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2
экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах*/