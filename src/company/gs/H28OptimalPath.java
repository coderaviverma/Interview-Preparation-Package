package company.gs;/*
** Instructions to candidate.
**  1) You are an avid rock collector who lives in southern California. Some rare 
**     and desirable rocks just became available in New York, so you are planning 
**     a cross-country road trip. There are several other rare rocks that you could 
**     pick up along the way. 
**     
**     You have been given a grid filled with numbers, representing the number of 
**     rare rocks available in various cities across the country.  Your objective 
**     is to find the optimal path from So_Cal to New_York that would allow you to 
**     accumulate the most rocks along the way. 
**     
**     Note: You can only travel either north (up) or east (right).
**  2) Consider adding some additional tests in doTestsPass().
**  3) Implement optimalPath() correctly.
**  4) Here is an example:
**                                                           ^
**                 {{0,0,0,0,5}, New_York (finish)           N
**                  {0,1,1,1,0},                         < W   E >
**   So_Cal (start) {2,0,0,0,0}}                             S
**                                                           v 
**   The total for this example would be 10 (2+0+1+1+1+0+5).
*/

class   H28OptimalPath {

	public static void optimalPathFinder(Integer[][] grid, int row, int col, int[][] gridValue) {
		int val = 0;
		System.out.println(row + " " + col);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	if (row == 0 && col == 0) {
			gridValue[0][0] = grid[0][0];
			return;
		}
		if (row > 0) {
			if (gridValue[row - 1][col] == -1) {
				optimalPathFinder(grid, row - 1, col, gridValue);
			}
			val = gridValue[row - 1][col];
		}
		if (col < grid[0].length - 1) {
			if (gridValue[row][col + 1] == -1) {
				optimalPathFinder(grid, row, col + 1, gridValue);
			}
			val = Math.max(val, gridValue[row][col + 1]);
			// if(val < gridValue[row][col-1]) {
			// val = gridValue[row][col-1]
			// }
		}
		gridValue[row][col] = grid[row][col] + val;
//		System.out.println(val + " " + grid[row][col] + " " + gridValue[row][col]);
		return;
	}


	public static Integer optimalPath(Integer[][] grid) {
		if (grid.length == 0) {
			return 0;
		}
		int[][] gridValue = new int[grid.length][grid[0].length];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				gridValue[i][j] = -1;
			}
		}
		optimalPathFinder(grid, grid.length - 1, 0, gridValue);
//		System.out.println(gridValue[0][grid[0].length - 1]);
		return gridValue[grid.length - 1][0];
//		return 0;
	}

	public static boolean doTestsPass() {
		boolean result = true;
		result &= optimalPath(new Integer[][] { { 0, 0, 0, 0, 5 },
												{ 0, 1, 1, 1, 0 },
												{ 2, 0, 0, 0, 0 } }) == 10;
		return result;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}
}