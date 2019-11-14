package com.design.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheMap<K, V> extends LinkedHashMap<K, V>{
@Override
protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
return size() > size;
}
@SuppressWarnings("compatibility:7854546038382053715")
private static final long serialVersionUID = -4607438325401116607L;
int size = 0;

public LRUCacheMap(int size) {
super(size, 0.25f, true);
this.size = size;
} 

public static <K,V>LRUCacheMap<K, V> newinstance(int size){
return new LRUCacheMap(size);
}

public void setMaxSize(int maxsize){
this.size = maxsize;
}

public static void main(String[] args) {
// LRUCacheMap lRUCacheMap = new LRUCacheMap();
LRUCacheMap<String,String> lruCache = LRUCacheMap.newinstance(3);

lruCache.put("1", "2");
lruCache.put("2", "3");
lruCache.put("3", "4");
lruCache.put("4", "2");
lruCache.put("5", "1");
System.out.println(lruCache);
}
}