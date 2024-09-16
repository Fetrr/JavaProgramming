package org.example;

public interface CalculatorInterface<T> {
    T add(T a, T b);
    T multi(T a, T b);
    T div(T a, T b);
}
