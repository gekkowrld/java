
/**
 * We are going to use indexOf method
 * It can take two arguments
 * If one is specified, then it starts from the start
 * else it starts from where you have specified
 * For one argument it is str.indexOf(char)
 * For two arguments str.indexOf(char, position)
 * It can take both char and string
 */

public class IndexOf{
	public static void main(String[] args){
		// We declare and initialize the strings that we are using

		String str = "Hello, World";
		String str1 = "World";

		// I have tried to implement "all" the use cases but their is more implementation

		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf('o', 5));
		System.out.println(str.indexOf(str1));
		System.out.println(str.indexOf(str1, 3));
	}
}
