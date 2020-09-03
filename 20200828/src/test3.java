public class test3 {
    public int minPathSum (int[][] grid) {
        // write code here
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(i==0&&j==0){
                    //说明是左上角的元素
                    grid[i][j]=grid[i][j];
                }else if(i==0){
                    //说明是第一行的元素，只有前面的数向右走才能得到这个数,
                    // 到这个元素的最小值就是前面的数+现在的数
                    grid[i][j]+=grid[i][j-1];
                }else if(j==0){
                    //说明是第一列的元素，只有前面的数向下走才能得到这个数。,
                    // 到这个元素的最小值就是前面的数+现在的数
                    grid[i][j]+=grid[i-1][j];
                }else{
                    //否则就是中间的元素，既可以向下走得到，也可以像右走得到。,
                    //就看上面的数，还是左边的数谁小就使用时谁.
                    int min=Math.min(grid[i][j-1],grid[i-1][j]);
                    grid[i][j]+=min;
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
