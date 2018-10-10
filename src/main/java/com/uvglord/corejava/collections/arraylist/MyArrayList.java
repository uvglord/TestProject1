package com.uvglord.corejava.collections.arraylist;

public class MyArrayList {

	private static final int SIZE_FACTOR = 5;

	private Object data[];

	private int index;

	private int size;

	public MyArrayList() {
		this.data = new Object[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
	}

	public void add(Object o) {
		System.out.println("index:" + this.index + ", size:" + this.size + ", length:" + this.data.length);
		if (this.index == this.size - 1) {
			increaseSizeAndReallocate();
		}
		data[this.index] = o;
		this.index++;

	}

	private void increaseSizeAndReallocate() {
		this.size = this.size + SIZE_FACTOR;
		Object newData[] = new Object[this.size];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
		System.out.println("***index:" + this.index + ", size:" + this.size + ", length:" + this.data.length);
	}

	public Object get(int index) throws Exception {
		if (index < 0 || index > this.index - 1) {
			throw new Exception("ArrayOutOfBoundException");
		}
		return this.data[index];
	}

	public void remove(int index) throws Exception {
		if (index < 0 || index > this.index - 1) {
			throw new Exception("ArrayOutOfBoundException");
		}
		System.out.println("Object getting removed:" + this.data[index]);
		for (int i = index; i < this.data.length - 1; i++) {
			data[i] = data[i + 1];
		}
		this.index--;
	}

	public static void main(String[] args) throws Exception {
		MyArrayList mal = new MyArrayList();
		mal.add("0");
		mal.add("1");
		mal.add("2");
		mal.add("3");
		mal.add("4");
		mal.add("5");
		mal.add("6");
		mal.add("7");
		mal.add("8");
		mal.add("9");

		mal.remove(5);
		System.out.println(mal.get(7));

	}

}
