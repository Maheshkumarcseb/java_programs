interface Resizable
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable
{
    private int width;
    private int height;

public Rectangle(int width,int height)  // constructor of class
{
    this.width=width;
    this.height=height;
}
public void resizeWidth(int width)   // method of resizable interface
{
    this.width=width;
}
public void resizeHeight(int height)   // method of resizable interface
{
    this.height=height;
}
public int getWidth()
{
    return width;
}
public int getHeight()
{
    return height;
}

}
public class ResizableDemo{
        public static void main(String[] args)
        {
            Rectangle rectangle =new Rectangle(10, 20);
            System.out.println("original rectangle width="+rectangle.getWidth()+ ",Height="+rectangle.getHeight());
            rectangle.resizeWidth(15);
            rectangle.resizeHeight(30);
            System.out.println("resized rectangle:width="+rectangle.getWidth()+",Height="+rectangle.getHeight());

        }
    
}
