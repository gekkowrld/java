class cardinal{
	enum cardinal_directions {
		NORTH,
		SOUTH,
		EAST,
		WEST
	}

	public static void main(String [] args){
		cardinal_directions n = cardinal_directions.NORTH;
		cardinal_directions s = cardinal_directions.SOUTH;
		cardinal_directions e = cardinal_directions.EAST;
		cardinal_directions w = cardinal_directions.WEST;

		System.out.println("The direction are "
					+ n + ", "
					+ s + ", "
					+ e + " and "
					+ w);
	}
}
