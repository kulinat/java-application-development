package com.acme.dbo.txlog;

public class Facade {

    private static final String PRIMITIVE = "primitive: ";
    private static final String CHAR = "char: ";
    private static final String STRING = "string: ";
    private static final String REFERENCE = "reference: ";

    public static void log(int message) {
        printMsg(PRIMITIVE + message);
    }

    public static void log(byte message) {
        printMsg(PRIMITIVE + message);
    }

    public static void log(char message) {
        printMsg(CHAR + message);
    }

    public static void log(String message) {
        printMsg(STRING + message);
    }

    public static void log(boolean message) {
        printMsg(PRIMITIVE + message) ;
    }

    public static void log(Object message) {
        printMsg(REFERENCE + message);
    }

    private static void printMsg(String msg) {
        System.out.println(msg);
    }
}
