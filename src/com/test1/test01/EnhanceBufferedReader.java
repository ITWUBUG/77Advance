package com.test1.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * BufferedReader增强类
 */
public class EnhanceBufferedReader extends BufferedReader {

    /**
     * 组合BufferedReader
     */
    private Reader bufferedReader;

    /**
     * 文本行号
     */
    private int read = 0;

    public EnhanceBufferedReader(Reader in) {
        super(in);
        this.bufferedReader = in;
    }

    @Override
    public String readLine() throws IOException {
        return (++read) + super.readLine();
    }
}
