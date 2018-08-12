package com.uvglord.corejava.exception;

import java.io.IOException;

public class TestExceptionPropagation2 {

	public static void main(String[] args) {
		TestExceptionPropagation2 tp = new TestExceptionPropagation2();
		tp.p();
		System.out.println("normal flow");
	}

	void p() {
		try {
			n();
		}catch(Exception e) {
			System.err.println("exception handeled ->"+e.getMessage());
		}
	}

	void n() throws IOException {
		m();
	}

	void m() throws IOException {
		// will not allow IOEx, either declare or surround with try catch
		//throw new IOException("device error");
		throw new RuntimeException();
	}
}
