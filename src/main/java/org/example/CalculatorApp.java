package org.example;

public class CalculatorApp implements CalculatorInterface<Double> {
    private final Calculator calc;

    public CalculatorApp(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public Double add(Double a, Double b) {
        return calc.add(a, b);
    }

    @Override
    public Double multi(Double a, Double b) {
        return calc.multi(a, b);
    }

    @Override
    public Double div(Double a, Double b) {
        return calc.div(a, b);
    }
}
