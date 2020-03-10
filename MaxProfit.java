class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0) return 0;
        
        int profit = 0; 
        int slow = 0;
        int fast = 0;
        int n = prices.length -1;
            
        for(int i = 0 ; i < n ; i ++ ) {
            System.out.println("index " + i) ;
             int buyVal = 0 ;
            while( (i < n ) ) {
                if( prices[i] <  prices[i + 1]) {
                buyVal =  prices[i] ;
                 System.out.println("buyVal" + buyVal + "  index " + i) ;
                   
                    break;
                }
                i++;
            }
            if(i == n ) break;
             i++;
            System.out.println(buyVal) ;
            System.out.println("index2 " + i) ;
            int cellValue = 0;
            while (i < n ) {
                  
                  if ( prices[i + 1] < prices[i] )  {
                     cellValue = prices[i];
                      break;
                  }
                i++;
                
            }
            if(i == n) cellValue = prices[i];
            if(cellValue > buyVal) {
                profit = profit + (cellValue - buyVal) ;
            }
            
            
         }
        
        return profit;
        
    }
}
