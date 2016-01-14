package myPackage;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		d.setMonth(1);
		d.setDay(14);
		
		d.addDays(5);
		System.out.println(d.dayOfWeek());
		System.out.println(d.isLeapYear());
		
		
	}

}
