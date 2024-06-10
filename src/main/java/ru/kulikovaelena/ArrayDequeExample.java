package ru.kulikovaelena;

import java.util.ArrayDeque;
import java.util.Objects;

public class ArrayDequeExample {

    private ArrayDeque<String> arrayDeque;

    public ArrayDequeExample() {
        this.arrayDeque = new ArrayDeque<String>();
    }


    public void print() {
        if (arrayDeque.isEmpty()) {
            System.out.println("Элементы в коллекции отсутствуют");
            return;
        }
        System.out.print("Элементы коллекции: ");
        ArrayDeque<String> tmp= new ArrayDeque<String>(arrayDeque);
        while(tmp.peek()!=null){
          System.out.print(tmp.poll()+' ');
        }
        System.out.println();
    }

    public void addElement(String value) {
        arrayDeque.add(value);
        System.out.println("Добавлен элемент " + value);

    }

    public void removeElement(String value) {
        ArrayDeque<String> tmp = new ArrayDeque<String>();
        String tmpS;
        int i = 0;
        while(arrayDeque.peek()!=null) {
            tmpS = arrayDeque.pop();
            if (Objects.equals(tmpS, value)) {
                System.out.println("Был удален элемент с индексом " + i);
            } else             tmp.push(tmpS);
            i=i+1;
        }

        arrayDeque=tmp;
    }

   /* public void searchElement(String value) {
        for (int i = 0; i < arrayDeque.size(); i++) {
            if (Objects.equals(arrayDeque.get(i), value)) {
                arrayDeque.remove(i);
                System.out.println("Был найден элемент " + value + " с индексом " + i);
                return;
            }
        }

    }*/
}
