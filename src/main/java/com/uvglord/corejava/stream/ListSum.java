package com.uvglord.corejava.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSum {

	
	public static void main(String[] args) {
		List<Integer> list = getList();
		long start = System.currentTimeMillis();
		sumIterator(list);
		System.out.println(System.currentTimeMillis()-start);
		start = System.currentTimeMillis();
		sumIteratorStream(list);
		System.out.println(System.currentTimeMillis()-start);
	}

	private static void sumIteratorStream(List<Integer> list) {
		int sum = list.stream().filter(i->i>10).mapToInt(i->i).sum();
		System.out.println("stream "+sum);
	}

	private static void sumIterator(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		int sum=0;
		while(iterator.hasNext()) {
			int num=iterator.next();
			if(num>10)
				sum+=num;
		}
		System.out.println("normal "+sum);
	}

	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		for(int i=7; i<11119; i++) {
			list.add(i);
		}
		return list;
	}
}
