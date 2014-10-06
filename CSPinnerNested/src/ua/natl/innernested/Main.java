package ua.natl.innernested;

import ua.natl.CSPinnerNested.*;

public class Main {

	public static void main(String[] args) {
		MyTest test = new MyTest();
		test.show();
		
		MyTest.MyNested nested = new MyTest.MyNested();
		nested.nestedShow();
		
		MyTest.MyInner inner = test.new MyInner();
		inner.innerShow();
	}
}