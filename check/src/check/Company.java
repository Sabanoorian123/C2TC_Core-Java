package check;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		Company c1 = c;
		c1.name = "C2TC";
		c = null;
		System.Out.println(c.name);

	}

}
