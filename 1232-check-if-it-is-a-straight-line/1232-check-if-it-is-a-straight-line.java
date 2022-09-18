class Solution {
    public boolean checkStraightLine(int[][] c) {
        if (c.length==2){
            return true;
        }
        int x=(c[1][1]-c[0][1]);
        int y=(c[1][0]-c[0][0]);
        for(int i=2;i<c.length;i++){
            if(x*(c[i][0]-c[1][0])!=y*(c[i][1]-c[1][1])){
                return false;
            }
        }
        
        return true;
    }
}