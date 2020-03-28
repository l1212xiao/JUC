package com.mashibing.juc.c_022_RefTypeAndThreadLocal;

import java.io.IOException;

public class T01_NormalReference {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc(); //DisableExplicitGC

        System.in.read(); //为了阻塞当前线程
    }
}
