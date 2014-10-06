package ua.natl.CSPinnerNested;

public class MyTest {

	public static class MyNested {
		public String nestedField = "Nested Class";
		public void nestedShow() {
			System.out.println(nestedField);
		}
	}
	
	public class MyInner {
		public String innerField = "Inner Class";
		public void innerShow() {
			System.out.println(innerField);
		}
	}
	
	public String outerField = "Test Class (outer)";
	public void show() {
		System.out.println(outerField);
	}	
}