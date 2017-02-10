package com.tretyak.mihail;

import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class NumberReaderThread extends Thread {

    private ConcurrentSkipListSet<Integer> numbers;

    private volatile Wrapper stopWrapper;

    public NumberReaderThread(ConcurrentSkipListSet<Integer> numbers, Wrapper stopWrapper) {
        this.numbers = numbers;
        this.stopWrapper = stopWrapper;
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int parsedNumber;
        String number;
        Parser parser = new Parser();
        while (!stopWrapper.isStop()) {
            number = in.nextLine().trim();
            if (number.equals("exit")) {
                stopWrapper.getStopped();
            } else {
                parsedNumber = parser.parseStr(number);
                if (parsedNumber != -1)
                    numbers.add(parsedNumber);
                else {
                    System.err.println("Invalid input");
                }
            }
        }
    }
}