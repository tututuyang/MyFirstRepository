package com.test;

import org.junit.Test;

/**
 * @author: create by Bingda
 * @version: v1.0
 * @description: com.test
 * @date:2020/3/24
 **/
public class ThreadTest {
    class Foo {
        private volatile int step = 1;
        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            step++;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (step < 2) {

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            step++;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (step < 3) {

            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
    class print implements Runnable {

        public void run() {
            System.out.println();
        }
    }
    @Test
    public void ThreadTest() {
        Foo foo = new Foo();
//        new Thread(()->foo.first())
    }
}
