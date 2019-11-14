package com.arraylist.example;

public class FruitIterator {
    private MyOwnArrayList fruitList;
    private int position;

    public FruitIterator(MyOwnArrayList fruitList) {
        this.fruitList = fruitList;
    }

    public boolean hasNext() {
        if (position < fruitList.size())
            return true;
        else
            return false;
    }

    public Object next() {
        Object aniObj = fruitList.get(position);
        position++;
        return aniObj;
    }
    public void remove() {
        fruitList.remove(position);
    }
}
