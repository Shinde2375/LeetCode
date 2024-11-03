//  2482. Difference Between Ones and Zeros in Row and Column    14/12/2023(Thursday);   

public class Solution44 {
    public int[][] onesMinusZeros(int[][] grid) {
     
        int m  = grid.length;
        int n = grid[0].length;

        int onesRow[] = new int[m];
        int onesCol[] = new int[n];

        //Storing all 1 in arrays
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }

            //creating new array & storing result ;

        int diff[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            int rowone = onesRow[i];
            int colone = onesCol[j];

            int zerosRow = n-rowone;
            int zerocol = m-colone;

            diff[i][j] = rowone+colone-zerosRow-zerocol;
        }
        }

        return diff;
    }
}
