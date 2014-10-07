package ua.natl.typepar;

public class Accumulator<AccType> {
	private AccType acc;
	public Accumulator(AccType a) {
		acc = a;
	}
	public AccType getAcc() {
		return acc;
	}
	@SuppressWarnings("unchecked")
	public void Add(AccType a) {
		if (a instanceof String)
			acc = (AccType)((String)acc + (String)a);
		if (a instanceof Integer)
			acc = (AccType)(Integer)((Integer)acc + (Integer)a);
	}
}