var maxProfit = function(prices) {
    
    var profit = [];
    var max = 0;
    var maximum = Math.max.apply(null, prices);
    
    
    for(var i=0; i<prices.length-1; i++) {
        for(var j=i+1; j<prices.length; j++) {
            if(prices[i] < prices[j]) {
                var temp = prices[j] - prices[i];
                
                if(temp > max) {
                    max = temp;
                }        
            }
        }
    }
    
    return max;
    
};
