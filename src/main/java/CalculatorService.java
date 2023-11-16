public class CalculatorService implements CalculatorRepo {
    @Override
    public Double addition(Double a, Double b) {
        return a+b;
    }

    @Override
    public Double multiplication(Double a, Double b) {
        return a*b;//return multiplication de a*b
    }

    @Override
    public Double division(Double a, Double b) {
        return b == 0 ? null : a / b;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        return a-b;
    }

    @Override
    public Boolean isPrime(Integer val) {
        if (val <= 1)
            return null;
        for (int i = 2; i < val; i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
}
