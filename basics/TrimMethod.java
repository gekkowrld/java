/**
 * We are going to be looking at the `trim` method
 * It is used to trim off non-printable characters like
 * tab and spaces at the end and beginning of a word(s)
 * It can be used where you don't want trailing whitespace
 */

 class TrimMethod{
	public static void main(String [] args){
		String s1 = "   \tHello";
		System.out.println(s1.trim());
	}
 }
