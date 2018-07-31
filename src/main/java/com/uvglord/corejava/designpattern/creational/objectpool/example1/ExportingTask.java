package com.uvglord.corejava.designpattern.creational.objectpool.example1;

public class ExportingTask implements Runnable{

	private ObjectPool<ExportingProcess> pool;
	private int threadNo;
	public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
		this.pool=pool;
		this.threadNo=threadNo;
	}
	
	
	@Override
	public void run() {
		//get an object from the pool
		ExportingProcess exportingProcess = pool.borrowObject();
		System.out.println("Thread "+threadNo+": Object with process no. "
				+exportingProcess.getProcessNo()+" was borrowed");
		
		//Do some task here
		//..........
		
		//return ExportingProcess instance back to the poll
		pool.returnObject(exportingProcess);
		
		System.out.println("Thread "+threadNo+": Object with process no. "
				+exportingProcess.getProcessNo()+" was returned");
	}
}
