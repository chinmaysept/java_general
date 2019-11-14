package com.datastructure.algo.example;

public class HashTable {

    private Item[] data;
    private int capacity;
    private int size;
    private static final Item AVAILABLE = new Item("Available", null);

    public HashTable(int capacity) {

        this.capacity = capacity; 
        data = new Item[capacity];
        for(int i = 0; i < data.length; i++) {

            data[i] = AVAILABLE;
        }
        size = 0;
    }

    public int size() {

        return size;
    }

    public int hashThis(String key) {

        return key.hashCode() % capacity; 
    }

    public Object get(String key) {

        int hash = hashThis(key);

        while(data[hash] != AVAILABLE && data[hash].key() != key) {

            hash = (hash + 1) % capacity;
        }
        return data[hash].element();
    }

    public void put(String key, Object element) {

        if(key != null) {
            size++;
            int hash = hashThis(key);
            while(data[hash] != AVAILABLE && data[hash].key() != key) {

                hash = (hash + 1) % capacity;
            }

            data[hash] = new Item(key, element);

        }

    }

    public Object remove(String key) {
        // not important now.
        throw new UnsupportedOperationException("Can't remove");
    }

    public String toString() {
    	   String s = "<HashTable[";
    	   int i = 0;
    	   int count = 0;
    	   while(count < this.size()) {

    	        //Skip the AVAILABLE cells
    	        if(data[i] == AVAILABLE) {
    	            i++;
    	            continue;
    	        }

    	        s += data[i].toString();
    	        if(count < this.size() - 1) {
    	            s += ",";
    	        }
    	        count++;
    	    }
    	    s += "]>";
    	    return s;
    	}
    //Working code
    
    /*public String toString()
    {
        String s = "<HashTable[";
        for (int i = 0; i < this.capacity; i++)
        {
            if (data[i].Element != null)
            {
                s += data[i].toString();
                if (i < this.size - 1)
                {
                    s += ",";
                }
             }
         }
         s += "]>";
         return s;
    }*/

}
