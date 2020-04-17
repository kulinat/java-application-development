package com.acme.dbo.txlog.writer;

public class ConsoleLogWriter implements LogWriter {

    @Override
    public void write (String decoratedMessage) {
        System.out.println(decoratedMessage);
    }
}