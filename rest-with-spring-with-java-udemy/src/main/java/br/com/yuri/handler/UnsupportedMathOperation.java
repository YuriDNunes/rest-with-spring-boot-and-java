package br.com.yuri.rest_with_spring_boot_and_java.exception.handler;

public class UnsupportedMathOperation extends RuntimeException {
    public UnsupportedMathOperation(String message) {
        super(message);
    }
}
