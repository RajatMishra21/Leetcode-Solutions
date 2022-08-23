class Solution {
    public double average(int[] salary) {
        double mins=Integer.MAX_VALUE;
        double maxs=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            mins=Math.min(mins,salary[i]);
            maxs=Math.max(maxs,salary[i]);
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(mins!=salary[i]&&maxs!=salary[i])
                sum+=salary[i];
        }
        return sum/(salary.length-2);
    }
    
}