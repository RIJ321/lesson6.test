package com.company;

public class Main {

    public static void main(String[] args) {
        /*Boss boss = new Boss();
        boss.setBossDefenseType("Magic");
        boss.setBossHealth(800);
        boss.setBossDamage(45);
        boss.saber.setNameOfWeapon("Baranda");
        boss.saber.setTypeOfWeapon("Physical");*/

        Boss boss=new Boss(400, 50,
                new Weapon("Baranda","Physical"));

        Skeletons skeleton1=new Skeletons(300,28,
                new Weapon("Bow","Fire arrows: "));

        Skeletons skeleton2=new Skeletons(330,22,
                new Weapon("Cross bow","Ice arrows: "));

        System.out.println(
                boss.printInfo() + skeleton1.printInfo() + skeleton2.printInfo()
        );
        /*System.out.println("Boss info: \n health: " + boss.getBossHealth() +
                "\n damage: " + boss.getBossDamage() + "\n defense type: " + boss
                .getBossDefenseType() + "\n\n Boss weapon: " + boss.saber.getNameOfWeapon() +
                "\n type of weapon: " + boss.saber.getTypeOfWeapon()) ;}*/

                /*Weapon w = new Weapon();

        Boss boss = new Boss();

        boss.setHealth(800);
        boss.setDamage(50);
        w.setNameOfWeapon("Baranda");
        w.setTypeOfWeapon("Physical");
        boss.setSaber(w);

        Weapon w1=new  Weapon();

        Skeletons skeleton1 = new Skeletons();
        skeleton1.setHealth(270);
        skeleton1.setDamage(12);
        w1.setNameOfWeapon("Bow");
        w1.setTypeOfWeapon("Fire arrows: ");
        skeleton1.getArrows();
        skeleton1.setSaber(w1);

        Weapon w2=new  Weapon();

        Skeletons skeleton2 = new Skeletons();
        skeleton2.setHealth(230);
        skeleton2.setDamage(15);
        w2.setNameOfWeapon("Bow");
        w2.setTypeOfWeapon("Ice arrows: ");
        skeleton2.getArrows();
        skeleton2.setSaber(w2);*/

    }
}



/*ДЗ на сообразительность:
● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
● Создать класс Скелетов, унаследовать от Босса.
● Добавить поле (кол-во стрел) и добавить геттеры.
● Переопределить родительский метод printInfo
● В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2
экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах*/