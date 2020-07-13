package ru.mad1337bat;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight() {
        float weight = 0.0f;

        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void portTo(Box<T> anotherBox) {
        System.out.println("Method for porting fruits from this box to another");
        anotherBox.box.addAll(box);
        box.clear();
    }

    // метод добавления фруктов в коробку
    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}