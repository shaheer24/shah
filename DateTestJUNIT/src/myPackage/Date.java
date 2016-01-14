package myPackage;

public class Date {
	
	public int day;
	public int month;
	public int year;
	
	public String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
	
	public Date(int year, int month, int day) {
		// TODO Auto-generated constructor stub
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay(){
		return day;
	}
	
	public void addDays(int days){
		int daysFinal = this.day + days;
		if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12){
			if(daysFinal > 31){
				//int check = this.day - 31;
				daysFinal = daysFinal - 31;
				System.out.println(daysFinal);
			}
			System.out.println(daysFinal);		
		}
		
	}
	
	public int daysInMonth(){
	
		int daysInMonth = 0;
		if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12){
			daysInMonth = 31;
		}else if(this.month == 2){
			daysInMonth = 28;
		}else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
			daysInMonth = 30;
		}else {
			System.out.println("Error in Days");
		}
		
		return daysInMonth;
	}
	
	public String dayOfWeek(){
	
		String day="";
		int check = 0;
		/*for(int i = 0; i < 5; i++){
			if(this.day / 7 == 0){
				
			}
		}*/
		
		if(this.day < 8){
			day = days[this.day-1];
		}
		else if(this.day >= 8){
			for(int i = 0; i < 5; i++){
				check = this.day % 7;
				if(check == 0){
					day = days[check];
					break;
				}else {
				day = days[check-1];
				break;
				}
			}
		}
		return day;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public boolean isLeapYear()
	{
		if(this.month == 2){
			return true;
		}
		return false;
	}
	
}
