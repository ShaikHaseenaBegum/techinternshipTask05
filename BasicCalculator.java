package internsavy_task05;

	interface Calculator {
	    double add(double a, double b);
	    double subtract(double a, double b);
	    double multiply(double a, double b);
	    double divide(double a, double b);
	}

	class BasicCalculator implements Calculator {
	    @Override
	    public double add(double a, double b) {
	        return a + b;
	    }

	    @Override
	    public double subtract(double a, double b) {
	        return a - b;
	    }

	    @Override
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    @Override
	    public double divide(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	    }
}
