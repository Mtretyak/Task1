package com.tretyak.mihail;

import java.util.concurrent.ConcurrentSkipListSet;

public class MainApp {
    public static void main(String... args) throws Exception {
        ConcurrentSkipListSet<Integer> numbers = new ConcurrentSkipListSet<>();
        Wrapper stopWrapper = new Wrapper(false);
        Thread t1 = new NumberReaderThread(numbers, stopWrapper);
        Thread t2 = new MinNumberWriterThread(numbers, stopWrapper);
        t1.start();
        t2.start();

    }
}

