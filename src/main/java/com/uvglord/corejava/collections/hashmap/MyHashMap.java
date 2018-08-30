package com.uvglord.corejava.collections.hashmap;

import java.util.ArrayList;
import java.util.List;

/*
 * This is a Map implementation using ArrayList
 */
public class MyHashMap {

	class Container {
		Object key;
		Object value;

		public void insert(Object k, Object v) {
			this.key = k;
			this.value = v;
		}
	}

	private Container c;
	private List<Container> recordList;

	public MyHashMap() {
		this.recordList = new ArrayList<Container>();
	}

	public void put(Object k, Object v) {
		this.c = new Container();
		c.insert(k, v);
		// check for the same key before insertion
		int index = -1;
		for (Container ct : recordList) {
			index++;
			if (ct.key.equals(k)) {
				recordList.remove(index);
				break;
			}
		}
		recordList.add(c);
	}

	public Object get(Object k) {
		for (Container ct : recordList) {
			if (ct.key.toString() == k.toString()) {
				return ct.value;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		MyHashMap hm = new MyHashMap();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		System.out.println(hm.get("3"));
		hm.put("3", "4");

		System.out.println(hm.get("1"));
		System.out.println(hm.get("3"));
		System.out.println(hm.get("8"));

	}

}
