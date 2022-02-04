class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPri = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPri = Math.min(minPri, prices[i]);
            maxPro = Math.max(prices[i]-minPri, maxPro);
        }
        return maxPro;
    }
}
