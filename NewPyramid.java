import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
public class NewPyramid{
    //field
    private Point pos;
    private Color stairColor;
    private Color brickColor;
    //constructors
    public NewPyramid(){
        stairColor = Color.BLACK;
        brickColor = Color.YELLOW;
        pos = new Point();
        
    }
    //use this() for the duplicates
    public NewPyramid(int x, int y){
        this();
        pos = new Point(x,y);
    }
    //methods
    public void setStairColor(Color c){
        stairColor = c; 

    }
    
    
    public void setBrickColor(Color c){
        brickColor = c;
        
    }
    public void draw(Graphics g){
        g.setColor(brickColor);
		g.fillRect(100+pos.x,285+pos.y,200, 30);
		g.fillRect(114+pos.x, 255+pos.y, 170, 30);	
        g.fillRect(128+pos.x, 225+pos.y, 144, 30);		
        g.fillRect(142+pos.x, 195+pos.y, 118, 30);	
        g.fillRect(156+pos.x, 155+pos.y, 92, 60);
		//stairs
		g.setColor(stairColor);
		g.drawLine(156+pos.x, 305+pos.y, 235+pos.x, 305+pos.y);
		g.drawLine(166+pos.x, 295+pos.y, 225+pos.x, 295+pos.y);
		g.drawLine(176+pos.x, 285+pos.y, 215+pos.x, 285+pos.y);
		g.drawLine(186+pos.x, 275+pos.y, 205+pos.x, 275+pos.y);
		g.drawLine(192+pos.x, 265+pos.y, 197+pos.x, 265+pos.y);
		g.drawOval(160+pos.x, 160+pos.y, 85, 25);
		
    }

}