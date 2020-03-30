// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	int numberAmazonGoStores(int rows, int column, List<List<Integer> > grid)
	{
		int numberOfStores = 0;
		// converting to Array for better access time O(1)
		Integer[][] gridArray = grid.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);

		for(int row = 0; row < rows; row++){
			for(int col = 0; col < column; col++){
				int currentBlock = gridArray[row][col];
				if(currentBlock == 1){ 
					// additional check against ArrayIndexOutOfBoundsException
					if(col != (column - 1)){
						int horizontalNeighborBlock = gridArray[row][col + 1];
						// check adjacent cell in row for 1
						if(horizontalNeighborBlock == 1){
							numberOfStores++;
						}
						if(col > 0){
							// check neither of adjacent cells is 1
							int horizontalPreviousBlock = gridArray[row][col - 1];
							if(horizontalNeighborBlock == 0 && horizontalPreviousBlock == 0){
								numberOfStores++;
							} 
						}
					}
					if(row != (rows - 1)){
						int verticalNeighborBlock = gridArray[row + 1][col];
						if(verticalNeighborBlock == 1){
							numberOfStores++;
						} 
					}
				}
			}
		}
		return numberOfStores;
	}
	// METHOD SIGNATURE ENDS
}
