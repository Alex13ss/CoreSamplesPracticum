
public class AnonMain {
	
	public static final long STEPS = 1000000L;
	public static double Integral(double a, double b, MathFunction f) {
		double h = (b - a) / STEPS;
		double summa = 0.0;
		for (long i = 0; i < STEPS; i++) {
			double x = a + h * i + h / 2;
			double y = f.F(x);
			summa += y*h;
		}
		return summa;
	}

	public static void main(String[] args) {
		// If we don't use Anonymous class:
		//Sin2 s = new Sin2();
		double r = Integral(0, Math.PI/2, 
				
				// Start Anonymous class (like a parameter)
				new MathFunction() {
					@Override
					public double F(double x) {
						return Math.pow(Math.sin(x), 2.0);
					}
				}
				// End Anonymous class
		
		);
		System.out.printf("Integral: %g", r);
	}
}

// We can make another class with Interface implementation, 
// to use it instead of Anonymous class:

/*
class Sin2 implements MathFunction {
	@Override
	public double F(double x) {
		return Math.pow(Math.sin(x), 2.0);
	}
}
*/