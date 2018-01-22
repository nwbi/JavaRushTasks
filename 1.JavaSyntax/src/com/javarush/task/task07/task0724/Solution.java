package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //Human (4 объекта без отца и матери и 5 объектов с ними)
        Human hum1 = new Human("Пётр", true, 21);
        Human hum2 = new Human("Слава", true, 25);
        Human hum3 = new Human("Женя", false, 5);
        Human hum4 = new Human("Максим", true, 35);
        Human hum5 = new Human("Максим", true, 35, hum1, hum3);
        Human hum6 = new Human("Юра", true, 34, hum1, hum3);
        Human hum7 = new Human("Юля", false, 41, hum1, hum3);
        Human hum8 = new Human("Антон", true, 22, hum1, hum3);
        Human hum9 = new Human("Вася", true, 30, hum1, hum3);
        System.out.println(hum1.toString());
        System.out.println(hum2.toString());
        System.out.println(hum3.toString());
        System.out.println(hum4.toString());
        System.out.println(hum5.toString());
        System.out.println(hum6.toString());
        System.out.println(hum7.toString());
        System.out.println(hum8.toString());
        System.out.println(hum9.toString());



        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















