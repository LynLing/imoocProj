package com.imooc;

public class Letter implements Runnable {
    @Override
    public void run() {
        char letter = 'a';
        for(int i = 0; i < 26; i++){

            System.out.print((char) (letter + i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
