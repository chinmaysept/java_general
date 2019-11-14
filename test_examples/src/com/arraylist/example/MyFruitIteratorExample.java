package com.arraylist.example;

public class MyFruitIteratorExample {
    public static void main(String[] args) {
        
        MyOwnArrayList fruitList = new MyOwnArrayList();
        fruitList.add("Mango");
        fruitList.add("Strawaberry");
        fruitList.add("Papaya");
        fruitList.add("Watermalon");
        
        System.out.println("-----Calling my iterator on my ArrayList-----");
        FruitIterator it=fruitList.iterator();        
        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println("Value: "+s);
        }
        System.out.println("--Fruit List size: "+fruitList.size());
        fruitList.remove(1);
        System.out.println("--After removal, Fruit List size: "+fruitList.size());
    }
}
