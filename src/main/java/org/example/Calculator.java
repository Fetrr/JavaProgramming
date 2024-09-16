package org.example;

class Calculator {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double multi(Double a, Double b) {
        return a*b;
    }

    public Double div(Double a, Double b) {
        if (b != 0) {
            return a/b;
        }
        return null;
    }
}
