package ru.geekbrains.java_one.homework.homework_e;

public class Cat extends Animal{
    private static int number;
    public Cat() {
        number++;
        selfNumber = number;
        maxRunDistance = 100 + (int)(Math.random()*200);
        maxJumpHeight = 1 + Math.random()*2;
    }

    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println("Котик " +selfNumber+" пробежал");
        } else System.out.println("Котик " +selfNumber+" выдохся");
    }

    @Override
    protected void swim(int distance) {
            System.out.println("Котик " +selfNumber+" не умеет плавать");
    }

    @Override
    protected void jump(double height) {
        if (height <= maxJumpHeight){
            System.out.println("Котик " +selfNumber+" перепрыгнул");
        } else System.out.println("Котик " +selfNumber+" не допрыгнул");
    }

}
