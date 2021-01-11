package com.praveen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.praveen.concurrent.Job;
import com.praveen.logic.SubClass;

public class Executor {
	static List<String> li = new ArrayList<>();			

	public static void main(String[] args) {
		
		
		ExecutorService s = (ThreadPoolExecutor) Executors.newFixedThreadPool(30);
		SubClass sb = new SubClass();
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			Job j = new Job();
			Future<String> u =s.submit(j);
			try {
				li.add(u.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		s.shutdown();
		
		try {
			s.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
			System.out.println("Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(String k : li) {
			System.out.println(k);
		}
		
		

	}

}
