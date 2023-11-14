import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Pyramid extends JPanel {
	//NewPyramid objects
	NewPyramid building;
	NewPyramid building2;

	public Pyramid() {
		//instantiate NewPyramid objects
		building = new NewPyramid();
		building2 = new NewPyramid(50, -50);
		//set color with methos from NewPyramid Class
		building2.setBrickColor(Color.RED);
		building2.setStairColor(Color.BLUE);
}

	@Override
	public void paintComponent(Graphics g) {
		var up = -50;
		var w = getWidth();
		var h = getHeight();
		
		//drawing the sky blue sky
		g.setColor(Color.CYAN);
		g.fillRect(0,0,w,h);
		
		//drawing the trees
		g.setColor(Color.GREEN);
		g.fillOval(90, 100, 140, 300);
        g.setColor(Color.GREEN);
		g.fillOval(150, 120, 175, 300);
        g.setColor(Color.GREEN);
        g.fillOval(270, 140, 200, 300);
        g.setColor(Color.GREEN);
		g.fillOval(-90, 100, 175, 300);
        g.setColor(Color.GREEN);
		g.fillOval(0, 125, 175, 300);
		
		//draw land
		g.setColor(new Color(100,240,100)/*Color.GREEN*/);
		g.fillRect(0, 275, 400,400);

		
		//draw sun
		g.setColor(Color.YELLOW);
		g.fillOval(30,20,80,80);
		//draw clouds
		g.setColor(Color.WHITE);
		g.fillOval(80, 20, 150, 40);
		g.fillOval(70, 40, 100, 40);
		g.fillOval(150, 30, 50, 40);
		g.fillOval(150, 10, 40, 40);
		//2 cloud
		g.fillOval(280, 20, 40, 40);
		g.fillOval(260, 30, 40, 50);
		g.fillOval(280, 20, 40, 70);
		//3 cloud
		g.fillOval(300, 90, 90, 40);
		g.fillOval(330, 80, 40, 50);
		g.fillOval(330, 70, 40, 70);
		
		//draw the pyramid
		building.draw(g);
		building2.draw(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(310, 255, 70, 30);
		g.fillRect(345, 280, 5, 30);
		g.setColor(Color.BLACK);
		g.drawString("Ephraim's", 317, 266);
		g.drawString("Pyramid", 318, 276);
		//banner
		g.setColor(Color.RED);
		g.fillRect(127, 57, 100,20);
		g.setColor(Color.BLACK);
		g.drawString("GO SEASIDERS!", 130, 70);
		//plane and string
		g.drawLine(227, 60, 247, 60);
		g.setColor(Color.RED);
		g.fillOval(243, 40, 20, 30);
		g.fillOval(252, 58, 100,30 );
		g.fillOval(300, 35, 20, 70);
		g.setColor(Color.WHITE);
		g.fillOval(330, 60, 15,10);

		

	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Pyramid());
		window.setVisible(true);
	}
}