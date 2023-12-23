

class MyPoint{
    private int x;
    private int y;
   
    public MyPoint()
    {
        this(0, 0);
    }
    public MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getXY()
    {
        return new int[] { x, y};
    }
    public double distance(int x, int y)
    {
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another)
    {
        return distance(another.x, another.y);
    }
    public double distance()
    {
        return distance(0, 0);
    }
    public String toString()
    {
        return "(" + x + " ,"+ y+")";
    }
}
class TestMyPoint
{
    public static void main(String[] args) {
        MyPoint point1=new MyPoint();
        MyPoint point2=new MyPoint(3, 4);
        System.out.println("point 1:"+point1.toString());
        System.out.println("point 2:"+point2.toString());
        point1.setXY(5,6);
        System.out.println("new coordinates for point 1:"+point1.toString());
        int[] coordinates=point2.getXY();
        System.out.println("coordinates for point 2:"+("coordinates[0]"+","+"coordinates[1]"));
        double distance1=point1.distance(8, 10);
        System.out.println("distance from point 1 to(8,10):"+distance1);
        double distance2=point1.distance(point2);
        System.out.println("distance from point 1 to point 2:"+(int)distance2);
        double distance3=point1.distance();
        System.out.println("distance from point 1 to origin(0, 0)"+(int)distance3);
    }
}
