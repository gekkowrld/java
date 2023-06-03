class DayOfTheWeekExercise_01{
	enum daysOfTheWeek {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args){
		daysOfTheWeek today = daysOfTheWeek.SATURDAY;

		System.out.println("Today is " + today);
	}
}
