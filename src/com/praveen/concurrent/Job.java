package com.praveen.concurrent;

import java.util.concurrent.Callable;

import com.praveen.logic.SubClass;

public class Job implements Callable<String> {

	@Override
	public String call() throws Exception {
		//Thread.currentThread();
		System.out.println("delay");
		Thread.sleep(100);
		return new SubClass().m();
	}

}
