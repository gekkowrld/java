public class StringEquality{
	public static void main(String[] args)
	{
		String str_1 = "This is a string to be tested";
		String str_2 = "This is a String to be tested";

		// This is when we test it in case sensitive mode
		System.out.println("When case sensitive is ON");
		System.out.println(str_1 + " equals " + str_2  + " : " + str_1.equals(str_2));
		System.out.println("When case sensitive is OFF");
		System.out.println(str_1 + " equals " + str_2  + " : " + str_1.equalsIgnoreCase(str_2));

		// This is test for length

		String s_1 = "Some text with length";
		String s_2 = "Some text";

		System.out.println(s_1 + " equals " + s_2  + " : " + s_1.equals(s_2));
	}
}
