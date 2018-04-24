package com.example.dockerhelloworld.services;

public class RunnableExample {

    public static void main(String[] args) {
        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        });
        thread.run();

        Thread lambdaThread = new Thread(()-> System.out.println("Hello runnable Lambdaa"));
        lambdaThread.run();
    }
}
