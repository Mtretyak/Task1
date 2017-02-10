package com.tretyak.mihail;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

public class MinNumberWriterThread extends Thread {

    private ConcurrentSkipListSet<Integer> numbers;

    private volatile Wrapper stopWrapper;

    public MinNumberWriterThread(ConcurrentSkipListSet<Integer> numbers, Wrapper stopWrapper) {
        this.numbers = numbers;
        this.stopWrapper = stopWrapper;
    }

    @Override
    public void run() {
        while (!stopWrapper.isStop()) {
            try {
                if (!numbers.isEmpty()) {
                    System.out.println(numbers.pollFirst());
                } else {
                    System.out.println("No data contains");
                }
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}