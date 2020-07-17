
public class Levels {
	static double numofwalls;
	public static double[] Level1() {
		double[] levelData = 
				{100, 0, 50, 200,
				0 ,0, 0, 0,
				0 ,0, 0, 0,
				0 ,0, 0, 0};
		numofwalls = 1;
		return levelData;
	}
	public static double[] Level2() {
		double[] levelData = 
			{400, 200, 400, 20,
			400, 580, 400, 20,
			800, 200, 20, 400,
			400 ,450, 10, 150,
			400 ,200, 10, 250};
		numofwalls = 5;
		return levelData;
	}
	public double GetNumOfWalls() {
		double currentnumofwalls = numofwalls;
		return currentnumofwalls;
	}

}
