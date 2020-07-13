package ru.mad1337bat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //for Task1
        Integer arr1[] = {1, 10, 100, 333, 500, 555, 600};
        String arr2[] = {"Hello", "world", "and space"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);
        //for Task2
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        //for Task3
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        System.out.println("Task3");
        System.out.println("____addFruit: ");
        orange.addFruit(new Orange(), 5);
        orange1.addFruit(new Orange(), 10);
        apple.addFruit(new Apple(), 3);
        apple1.addFruit(new Apple(), 15);
        System.out.println("Box 1: " + orange.getWeight());
        System.out.println("Box 2: " + orange1.getWeight());
        System.out.println("Box 3: " + apple.getWeight());
        System.out.println("Box 4: " + apple1.getWeight());

        System.out.println("3.2 - compare(): ");
        System.out.println("Box 1 equals box 3: " + orange.compare(apple));
        System.out.println("Box 2 equals box 4: " + orange1.compare(apple1));

        System.out.println("3.3 - portTo(): ");
        orange.portTo(orange1);
        apple.portTo(apple1);

        System.out.println("3.1 - getWeight(): ");
        System.out.println("Box 1: " + orange.getWeight());
        System.out.println("Box 2: " + orange1.getWeight());
        System.out.println("Box 3: " + apple.getWeight());
        System.out.println("Box 4: " + apple1.getWeight());
    }


    public static void swap(Object[] arr, int n1, int n2) {
        System.out.println("Method for replace element of array with another element");
        System.out.println("Task1 (before): " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("The result of the replacement (after): " + Arrays.toString(arr) + "\n--------------------");
    }

    public static <T> void asList(T[] arr) {
        System.out.println("Method for alter array to ArrayList");

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Task2 (before): arrayOfStrings = {\"A\", \"B\", \"C\", \"D\"}");
        System.out.println("Task2 - result of the conversion : " + alt + "\n------------------------");
    }
}

