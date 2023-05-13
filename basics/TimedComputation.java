import javax.swing.plaf.nimbus.State;

/**
 * This program performs some mathematical computations and displays
 * the results. It also displays the value of the constant MAth.PI.
 * It then reports the number of seconds that the computer spent on this task
 */

 public class TimedComputation{
	public static void main(String[] args){
		long startTime; // Starting time, in nano seconds
		long endTime; // Ending time, in nano seconds
		long compTime; // Run Time
		double seconds; // Time difference in seconds

		startTime = System.nanoTime();

		double width, height, hyp;
		width = 42.0;
		height = 17.0;
		hyp = Math.sqrt(Math.pow(width, 2) + Math.pow(width, 2));
		System.out.print("A triangle with sides 42 and 17 has hypotenuse ");
		System.out.println(hyp);

		System.out.println("\nMathematically, sin(x)*sin(x) + " + "cos(x)*cos(x) - 1 should be 0.");
		System.out.println("Let's check this for x = 100:");
		System.out.println("	sin(100)*sin(100) + cos(100)*cos(100) - 1 is: ");
		System.out.println(Math.sin(100)*Math.sin(100) + Math.cos(100)*Math.cos(100) -1);
		System.out.println("There can be round-off errors when" + " computing with real numbers!");
		System.out.print("\nHere is a random number: ");
		System.out.println(Math.random());
		System.out.print("\nThe value of Math.Pi is ");
		System.out.println(Math.PI);

		endTime = System.nanoTime();
		compTime = endTime - startTime;
		seconds = compTime / 1000000000.0;

		System.out.print("\nRun time in nanoseconds was: ");
		System.out.println(compTime);
		System.out.println("This is not perfectly accurate!");
		System.out.print("\nRun time in seconds was: ");
		System.out.println(seconds);
	} // end main()
 } // end class TimedComputation
