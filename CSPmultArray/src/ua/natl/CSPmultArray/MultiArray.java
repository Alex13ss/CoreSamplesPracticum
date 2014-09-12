package ua.natl.CSPmultArray;

public class MultiArray {

	public static void main(String[] args) {
	
		// Initialization of two dimensional array without auto filling:
		// int[][] m = {{1,2,3},{9,5,1},{4,7,2}};
		
		int[][] m = new int[3][3];
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				
				// Now let's fill our array with some values
				m[row][col] = row + col;
				// Which values each of indexes have? Let's see:  
				System.out.print(row + "" + col + "=" + m[row][col] + "  ");
				
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			}
		System.out.println();
		}
	}
}