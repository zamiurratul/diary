package com.zamiur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.A;

@SpringBootApplication
public class DiaryApplication {

	public static void main(String[] args) {
//		Thread t1 = new Thread(new TestClass());
//		t1.start();
		SpringApplication.run(DiaryApplication.class, args);
		doTest();
		System.gc();
	}

	static void doTest(){
		A a = new A();
		a.foo();
		System.out.println("____________________________A was created!");
	}

	static class TestClass implements Runnable {

		@Override
		public void run() {
			for(int i=0; i< 100000; i++) {
				System.out.println("Inside Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}



}
