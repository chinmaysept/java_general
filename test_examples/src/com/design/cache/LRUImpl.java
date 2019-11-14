package com.design.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUImpl {
	
	private static final int String = 0;

	public interface CacheStrategy<K, T>{
		T get(K key);
		void put(K key,T data);
	}
	
	class CacheStrategyLRU<K, T> implements CacheStrategy<K, T> {
		
		class Node{
			K key;
			T data;
			Node next;
			Node prev;
			
			public Node(K key, T data){
				this.key = key;
				this.data = data;
			}
		}
		
		Node head,tail;
		Map< K, Node> map;
		int maxsize;
		
		public CacheStrategyLRU(int mxsize){
			this.maxsize = mxsize;
			map = new HashMap<K ,Node>();
			head =  new Node(null,null);
			tail = new Node(null,null);
			head.next=tail;
			tail.prev=head;
		}
		
		private void  attach(Node head,Node node){
			node.prev = head;
			node.next = head.next;
			head.next.prev=node;
			head.next = node;
		}
		
		private void remove(Node node){
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		
		
		@Override
		public T get(K key) {
			Node node = map.get(key);
			if(node==null){
				return null;
			}
			
			if(map.size()==1){
				return node.data;
			}
			remove(node);
			attach(head,node);
			return node.data;
		}

		@Override
		public void put(K key, T data) {
			if(maxsize<=0){
				return;
			}
			Node node = map.get(key);
			if(node!=null){
				remove(node);
				attach(head,node);
				node.data = data;
			}else{
				if(map.size() >= maxsize){
					remove(tail.prev);//tail is node pointer ,its not containg any node so delete tail.prev
					map.remove(tail.prev.key);
				}
				Node nd = new Node(key,data);
				map.put(key, nd);
				attach(head,nd);
			}
			
		}
    	
    }  
	
}