package ru.kulikovaelena;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    private HashSet<String> hashSet;

    public HashSetExample() {
        this.hashSet = new HashSet<String>();
    }


    public void print() {
        if (hashSet.isEmpty()) {
            System.out.println("Элементы в коллекции отсутствуют");
            return;
        }
        System.out.print("Элементы коллекции: ");
        Iterator<String> i = hashSet.iterator();
        while (i.hasNext())
            System.out.print(i.next()+" ");
        System.out.println();
    }

    public void addElement( String value) {
        hashSet.add(value);
        System.out.println("Добавлен элемент " + value);

    }

    public void removeElement(String value) {
        if (hashSet.contains(value)) {
            System.out.println("Был удален элемент " + value);
            hashSet.remove(value);
        } else
            System.out.println("Элеменнт в коллекции отсутствует");
    }


    public void searchElement(String value) {
        boolean found = hashSet.contains(value);
        if (found) {
            System.out.println("Элемент "+ value+" в коллекции  найден");
        }
    }
}
