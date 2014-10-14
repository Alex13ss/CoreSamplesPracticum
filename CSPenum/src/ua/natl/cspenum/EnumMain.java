package ua.natl.cspenum;

public class EnumMain {
	enum Color {
		red, green, blue;
		@Override
		public String toString() {
			return String.format("Color: %s", super.toString()) ;
		}
		public String translate() {
			if (this.equals(Color.red))
				return "chervonyi";
			if (this.equals(Color.green))
				return "zelenyi";
			if (this.equals(Color.blue))
				return "synii";
			return "";
		}
	}
	enum Weekdays {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

	public static void main(String[] args) {
		Color color = Color.green;
		System.out.println(color);
		System.out.println(color.translate());
		System.out.println(color.ordinal());
		System.out.println(color.name());
		for (Color c : Color.values()) {
			System.out.println(c);
		}
		Color c1 = Color.valueOf("red");
		System.out.println(c1);
	}
}