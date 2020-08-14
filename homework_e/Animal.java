package ru.geekbrains.java_one.homework.homework_e;

public abstract class Animal {
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected double maxJumpHeight;
    protected int selfNumber;

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
    protected abstract void jump(double height);

}
