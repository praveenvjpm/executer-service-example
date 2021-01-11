package com.praveen.logic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubClass {
	
	public String m() throws InterruptedException {
		Thread.sleep(200);
		System.out.println("sssss");
		return Thread.currentThread().getName();
		
	}

}
