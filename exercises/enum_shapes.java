class geometric_shapes{
	enum shape {
		CIRCLE,
		TRIANGLE,
		SQUARE,
		RECTANGLE,
		PENTAGON,
		HEXAGON,
		OCTAGON,
		DECAGON
	}

	public static void main(String [] args){
		shape sh1 = shape.CIRCLE;
		shape sh2 = shape.SQUARE;

		System.out.print("I got a " + sh1);
		System.out.println(" and a " + sh2);

	}
}
