package com.itheima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReadEnhance extends Reader {

    private BufferedReader bufferedReader;

    private int read = 0;

    public BufferedReadEnhance(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readLine() throws IOException {
        return ++read + "\t" + bufferedReader.readLine();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
       return bufferedReader.read();
    }

    @Override
    public boolean ready() throws IOException {
        return bufferedReader.ready();
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
