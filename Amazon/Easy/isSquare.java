package Easy;

public class isSquare{

}

class GFG{
    
    //structure of point in 2D space
    static class Point{
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    };

    // A utility function to find square of distance 
    // from point 'p' to point 'q'

    static int distSq(Point p , Point q){
        return (p.x -q.x)*(p.x -q.x) + (p.y - q.y)*(p.y - q.y);
    }

    static boolean isSquare(Point p1, Point p2, Point p3, Point p4)
{
    int d2 = distSq(p1, p2); // from p1 to p2
    int d3 = distSq(p1, p3); // from p1 to p3
    int d4 = distSq(p1, p4); // from p1 to p4
 
    if (d2 == 0 || d3 == 0 || d4 == 0)   
        return false;
 
    // If lengths if (p1, p2) and (p1, p3) are same, then
    // following conditions must met to form a square.
    // 1) Square of length of (p1, p4) is same as twice
    // the square of (p1, p2)
    // 2) Square of length of (p2, p3) is same
    // as twice the square of (p2, p4)
 
    if (d2 == d3 && 2 * d2 == d4
        && 2 * distSq(p2, p4) == distSq(p2, p3))
    {
        return true;
    }
 
    // The below two cases are similar to above case
    if (d3 == d4 && 2 * d3 == d2
        && 2 * distSq(p3, p2) == distSq(p3, p4))
    {
        return true;
    }
    if (d2 == d4 && 2 * d2 == d3
        && 2 * distSq(p2, p3) == distSq(p2, p4))
    {
        return true;
    }
 
    return false;
}


}