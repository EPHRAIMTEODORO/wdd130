/*tells java the where to find the built in class JFrame, Jpanel, and Graphics */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class joke extends JPanel{
/*override the class and use own methods */
    @Override
    public void paintComponent(Graphics g) {
        g.drawString ("A: Knock Knock!",20,20);
        g.drawString ("B: Who's There?",20,40);
        g.drawString ("A: Boo",20,60);
        g.drawString ("B: Boo Who?",20,80);
        g.drawString ("A: Don't cry, its just a joke",20,100);
    
    
    
    }

    public static void main (String[]args){
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Set window to 400 x 400 pixels */
        window.setSize (400,400);
        window.setContentPane(new joke());
        window.setVisible(true);
    }
}