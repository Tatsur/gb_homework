package ru.geekbrains.java_one.homework.homework_e;

public class Dog extends Animal{
    private static int number;
    public Dog() {
        number++;
        selfNumber = number;
        maxRunDistance = 400 + (int)(Math.random()*200);
        maxSwimDistance = 5 + (int)(Math.random()*10);
        maxJumpHeight = 0.3f +Math.random()*0.5f;
    }

    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println("Пёсик "+selfNumber+" пробежал");
        } else System.out.println("Пёсик "+selfNumber+" выдохся");
    }

    @Override
    protected void swim(int distance) {
        if (distance <= maxSwimDistance){
            System.out.println("Пёсик "+selfNumber+" доплыл");
        } else System.out.println("Пёсик "+selfNumber+" не решился плыть");
    }

    @Override
    protected void jump(double height) {
        if (height <= maxJumpHeight){
            System.out.println("Пёсик "+selfNumber+" перепрыгнул");
        } else System.out.println("Пёсик "+selfNumber+" не допрыгнул");
    }

}
