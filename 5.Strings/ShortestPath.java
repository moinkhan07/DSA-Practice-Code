public class ShortestPath {

    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;
        for(int i = 0;i < str.length();i++){
            char direction = str.charAt(i);
            //South
            if(direction == 'S'){
                y--;
            // North
            }else if(direction == 'N'){
                y++;
            // West
            }else if(direction == 'W'){
                x--;
            // East
            }else{
                x++;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;
        return (float)Math.sqrt(xSquare+ySquare);
        
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
    
}
