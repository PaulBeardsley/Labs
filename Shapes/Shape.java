package lab09;

public class Shape {
	
	public int x, y, w, h;
	private int dirX, dirY;
	public static int worldW;
	public static int worldH;
	private SHAPE_TYPE shape_type;
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, SHAPE_TYPE sType)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
        this.shape_type = sType;
    }

    public Shape(int x, int y, int w, int h, SHAPE_TYPE sType)  
    {
    	this(x,y,w,h,10,10,sType);
    }
    
    public SHAPE_TYPE getShape_Type()
    {
    	return this.shape_type;
    }
    
    public void Move()
    {
        x += dirX;
        y += dirY;

        if (x < 0)
        {
            x = 0;
            dirX *= -1;
        }

        if (y < 0)
        {
            y = 0;
            dirY *= -1;
        }

        if (x > (Shape.worldW -w))
        {
            x = Shape.worldW - w;
            dirX *= -1;
        }

        if (y > (Shape.worldH - h))
        {
            y = Shape.worldH - w;
            dirY *= -1;
        }

    } // end of move
    
    public static void setWorld(int w, int h) {
    	Shape.worldW = w;
    	Shape.worldH = h;
    	
    }


}
