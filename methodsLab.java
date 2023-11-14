import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.awt.Color;
import java.util.*;
public class methodsLab extends JPanel {
 //this is a FIELD now. I can access variables anywhere in the class.
String choice =JOptionPane.showInputDialog("Please Type the file name: ");
String filename = choice;
	File f = new File(filename);
	ArrayList<String> pumpkin = new ArrayList<>();
public methodsLab() {

try {
	Scanner s = new Scanner(f);
	while (s.hasNext() == true) {
	String nom = s.nextLine();
	if (nom.startsWith("//")) {
	continue;
	}
	pumpkin.add(nom);
}
} catch (FileNotFoundException e) {
	System.out.println("Sorry, I could not find " + filename);
}

}
//for the comparisons and assignment of method
public void parseCommand(String command, Graphics g){
	String[] first = command.split(" ");
	if(first[0].equals("CIRCLE")){
		int x = Integer.parseInt(first[1]);
		int y = Integer.parseInt(first[2]);
		int r = Integer.parseInt(first[3]);
		drawCircle(x,y,r,g);
	}
	else if(first[0].equals("TRIANGLE")){
		int x1 = Integer.parseInt(first[1]);
		int y1 = Integer.parseInt(first[2]);
		int x2 = Integer.parseInt(first[3]);
		int y2 = Integer.parseInt(first[4]);
		int x3 = Integer.parseInt(first[5]);
		int y3 = Integer.parseInt(first[6]);
		drawTriangle(x1,y1,x2,y2,x3,y3,g);
	}
	else if(first[0].equals("COLOR")){
		int R = Integer.parseInt(first[1]);
		int G = Integer.parseInt(first[2]);
		int B = Integer.parseInt(first[3]);
		changeColor(R,G,B,g);
	}

}
//method for color
public void changeColor(int red, int green, int blue, Graphics g){
    g.setColor(new Color(red,green,blue));
}
//method for triangle
public void drawTriangle(int x1,int y1,int x2, int y2, int x3, int y3, Graphics g){
    g.drawLine(x1,y1,x2,y2);
    g.drawLine(x2,y2,x3,y3);
    g.drawLine(x3,y3,x1,y1);
}
//method for circle
public void drawCircle(int xc, int yc, int r, Graphics g){
    g.drawOval(xc-r,yc-r,r*2,r*2);
}

@Override
public void paintComponent(Graphics g) {
	for(String j:pumpkin){
		parseCommand(j, g);
	}

}
public static void main(String[] args) {
var window = new JFrame();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(400,400);
window.setContentPane(new methodsLab());
window.setVisible(true);
}
}