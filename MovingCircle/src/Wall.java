
public class Wall {
	public static Levels data = new Levels();
	public double[] lastPos = {0,0};
	public double[] WallCollision(double[] playerPos, double[] wallData) {
		double[] moveTo = {0, 0, 0};
		int scany1 = 1;
		int scany2 = 3;
		int scanx1 = 0;
		int scanx2 = 2;
		double x = 0;
		double y = 0;
		x = playerPos[0];
		y = playerPos[1];
		for(int i = 0; i < data.GetNumOfWalls(); i++) {
			if(x < wallData[scanx1] + wallData[scanx2] - 2 &&
				x > wallData[scanx1] - 39 &&
				y < wallData[scany1] + wallData[scany2] - 2 &&
				y > wallData[scany1] - 39) {
				moveTo[2] = 1;
			}
			scany1 += 4;
			scany2 += 4;
			scanx1 += 4;
			scanx2 += 4;
		}
		if(moveTo[2] == 0) {
			lastPos[0] = playerPos[0];
			lastPos[1] = playerPos[1];
		}
		if (moveTo[2] == 1) {
			moveTo[0] = lastPos[0];
			moveTo[1] = lastPos[1];
		}
		return moveTo;
	}
}
