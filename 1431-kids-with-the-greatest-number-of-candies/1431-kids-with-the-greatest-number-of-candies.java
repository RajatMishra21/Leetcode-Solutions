class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>res=new ArrayList<>();
        int n=candies.length;
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>max)
            max=candies[i];
        }
        for(int i=0;i<n;i++){
            int sum=candies[i]+ extraCandies;
            if(sum>=max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}