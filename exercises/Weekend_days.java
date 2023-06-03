
class weekend{
	enum weekend_days {
		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args){
		weekend_days day1 = weekend_days.SATURDAY;
		weekend_days day2 = weekend_days.SUNDAY;

		System.out.println("First day of the weekend is " + day1);
		System.out.println("Second day of the weekend is " + day2);
	}
}
