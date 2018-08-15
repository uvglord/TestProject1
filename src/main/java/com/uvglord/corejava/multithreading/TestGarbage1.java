package com.uvglord.corejava.multithreading;

public class TestGarbage1 {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestGarbage1 gc1 = new TestGarbage1();
		TestGarbage1 gc2 = new TestGarbage1();
		
		gc1 = null;
		gc2 = null;
		
		//both will not run, need to comment any one
		//Runtime.getRuntime().gc();
		System.gc();
		Thread.sleep(500);
		System.out.println("Before exit msg check");
		//System.exit(0);
		Runtime.getRuntime().exit(0);
		System.out.println("After exit msg check");
		
	}

}
