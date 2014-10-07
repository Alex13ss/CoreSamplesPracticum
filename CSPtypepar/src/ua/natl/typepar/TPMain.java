package ua.natl.typepar;

public class TPMain {

	public static void main(String[] args) {
		Accumulator<String> acc1 = new Accumulator<String>("Start");
		acc1.Add(" Hello ");
		Accumulator<Integer> acc2 = new Accumulator<Integer>(123);
		acc2.Add(137);
		System.out.printf("%s %d", acc1.getAcc(), acc2.getAcc());
	}
}