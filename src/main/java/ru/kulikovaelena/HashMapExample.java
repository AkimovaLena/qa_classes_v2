package ru.kulikovaelena;

import java.util.*;

public class HashMapExample {

    private HashMap<String, String> hashMap;

    public HashMapExample() {
        this.hashMap = new HashMap<String, String>();
    }


    public void print() {
        if (hashMap.isEmpty()) {
            System.out.println("Элементы в коллекции отсутствуют");
            return;
        }
        System.out.println("Элементы коллекции: ");
        Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public void addElement(String key, String value) {
        hashMap.put(key, value);
        System.out.println("Добавлен элемент " + value + "ключом " + key);

    }

    public void removeElement(String key) {
        if (hashMap.containsKey(key)) {
            System.out.println("Был удален элемент " + hashMap.get(key) + " с ключом " + key);
            hashMap.remove(key);
        } else
            System.out.println("Элеменнт с данным ключом коллекции отсутствует");
    }


    public void searchElement(String key) {
        if (hashMap.containsKey(key)) {
            System.out.println("Был найден элемент " + hashMap.get(key) + " с ключом " + key);
        } else
            System.out.println("Элеменнт с данным ключом коллекции отсутствует");
    }
}
