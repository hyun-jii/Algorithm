import java.util.*;

class Solution {
    
    class Pos{
        double x;
        double y;
        
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(String dirs) {
        Pos pos = new Pos(0,0);
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<dirs.length(); i++) {
            char ch = dirs.charAt(i);
            
            if(ch == 'U' && pos.y < 5) {
                pos.y++;
                set.add(pos.x + "," + (pos.y - 0.5));
            }
            else if(ch == 'D' && pos.y > -5) {
                pos.y--;
                set.add(pos.x + "," + (pos.y + 0.5));
            }
            else if(ch == 'L' && pos.x > -5) {
                pos.x--;
                set.add((pos.x + 0.5) + "," + pos.y);
            }
            else if(ch == 'R' && pos.x < 5) {
                pos.x++;
                set.add((pos.x - 0.5) + "," + pos.y);
            }
        }
        
        return set.size();
        
    }
}
