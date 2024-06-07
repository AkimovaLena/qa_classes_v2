package ru.kulikovaelena;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListExample {

    private List<String> arrayList ;

    public ArrayListExample() {
        this.arrayList = new ArrayList<String>();
    }


    public void printArrayList() {
        if (arrayList.isEmpty()) {
            System.out.println("Элементы в коллекции отсутствуют");
            return;
        }
        System.out.print("Элементы коллекции: ");
        for (String s : arrayList) {
            System.out.print(s + ' ');
        }
        System.out.println();
    }

    public void addElement(String value) {
        arrayList.add(value);
        System.out.println("Добавлен элемент " + value);

    }

    public void removeElement(String value) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i), value)) {
                arrayList.remove(i);
                System.out.println("Был удален элемент с индексом " + i);
                return;
            }
        }

    }

    public void searchElement(String value) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i), value)) {
                arrayList.remove(i);
                System.out.println("Был найден элемент " + value + " с индексом " + i);
                return;
            }
        }

    }
}
