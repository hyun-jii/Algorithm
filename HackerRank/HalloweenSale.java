static int howManyGames(int p, int d, int m, int s) {
        int game = 0;
        int price = p;
        int leftMoney = s;

        while(leftMoney > 0) {
            
            leftMoney -= price;

            if(leftMoney < 0) {
                return game;
            }

            if(price - d <= m) {
                price = m;
            }
            else {
                price -= d;
            }
              
            game ++;
        }
            
        return game;
 }
