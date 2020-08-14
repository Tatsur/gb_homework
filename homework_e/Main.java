package ru.geekbrains.java_one.homework.homework_e;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Cat(),new Cat(),new Dog(),new Dog()};

        for(int i=0; i<animals.length;i++){
            animals[i].run(200);
            animals[i].swim(10);
            animals[i].jump(0.5);
        }
    }

}
