package ru.kulikovaelena;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с ArrayList");
        ArrayListExample myArrayList = new ArrayListExample();
        myArrayList.print();
        myArrayList.addElement("1");
        myArrayList.addElement("1");
        myArrayList.addElement("5");
        myArrayList.addElement("3");
        myArrayList.addElement("50");
        myArrayList.print();
        myArrayList.removeElement("1");
        myArrayList.print();
        myArrayList.searchElement("3");
        System.out.println();

        System.out.println("Работа с ArrayDeque");
        ArrayDequeExample myArrayDeque = new ArrayDequeExample();
        myArrayDeque.print();
        myArrayDeque.addElement("1");
        myArrayDeque.addElement("1");
        myArrayDeque.addElement("5");
        myArrayDeque.addElement("3");
        myArrayDeque.addElement("50");
        myArrayDeque.print();
        myArrayDeque.removeElement("1");
        myArrayDeque.print();
        myArrayList.searchElement("3");
        System.out.println();

        System.out.println("Работа с HashMap");
        HashMapExample myHashMap = new HashMapExample ();
        myHashMap.print();
        myHashMap.addElement("1","один");
        myHashMap.addElement("1","один");
        myHashMap.addElement("5","пять");
        myHashMap.addElement("3","три");
        myHashMap.addElement("50","пятьдесят");
        myHashMap.print();
        myHashMap.removeElement("1");
        myHashMap.print();
        myHashMap.searchElement("3");
        System.out.println();

        System.out.println("Работа с HashSet");
        HashSetExample myHashSet = new HashSetExample ();
        myHashSet.print();
        myHashSet.addElement("1");
        myHashSet.addElement("1");
        myHashSet.addElement("5");
        myHashSet.addElement("3");
        myHashSet.addElement("50");
        myHashSet.print();
        myHashSet.removeElement("1");
        myHashSet.print();
        myHashSet.searchElement("3");
    }
}