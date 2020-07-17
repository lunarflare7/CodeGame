
public class Levels {
	static double numofwalls;
	static double levelnum;
	static boolean[] collision;
	static double levelTo;
	public static double[] Level0() {
		double[] levelData = 
				{0, 0, 0, 0};
		levelTo = 1;
		return levelData;
	}
	public static double[] Level1() {
		double[] levelData = 
				{100, 0, 50, 200,
				600, 425, 40, 40,
				0 ,0, 0, 0,
				0, 0, 0, 0};
		numofwalls = 2;
		levelnum = 1;
		collision = new boolean[2];
		collision[0] = true;
		collision[1] = false;
		levelTo = 2;
		MoveCircle.button.setVisible(false);
		return levelData;
	}
	public static double[] Level2() {
		double[] levelData = 
			{400, 200, 400, 20,
			400, 580, 400, 20,
			800, 200, 20, 400,
			400 , 200, 10, 400,
			510, 710, 200, 10,
			510, 910, 200, 10,
			510, 710, 10, 200,
			710, 710, 10, 210,
			600, 800, 40, 40};
		numofwalls = 9;
		levelnum = 2;
		collision = new boolean[9];
		collision[0] = true;
		collision[1] = true;
		collision[2] = true;
		collision[3] = true;
		collision[4] = true;
		collision[5] = true;
		collision[6] = true;
		collision[7] = true;
		collision[8] = false;
		levelTo = 3;
		return levelData;
	}
	public double GetNumOfWalls() {
		return numofwalls;
	}
	public double GetLevelNum() {
		return levelnum;
	}
	public boolean[] GetCollisionBool() {
		return collision;
	}
	public double GetLevelTo() {
		return levelTo;
	}
}
