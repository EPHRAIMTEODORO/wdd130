
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFileChooser;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.filechooser.FileNameExtensionFilter;
public class polyline extends JPanel {
    File f;
    public polyline() {
    
    }
    @Override
    public void paintComponent(Graphics g) {
        //choosing files
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();
            
        }
    
    
    try{
        //reading the content of file
        Scanner s = new Scanner(f);
        s.next();
        s.next();
        while (s.hasNext()==true){
            int n = s.nextInt();
            int [] x = new int [n];
            int [] y = new int [n];
            //distributing the x and y value
            for (int i = 0; i<n;i++){
                x[i]=s.nextInt();
                y[i]=s.nextInt();
            }
            g.drawPolyline(x,y,n);
        }


    } catch (FileNotFoundException e) {
        System.out.println("Sorry, I could not find " + f);}
    }


    
    public static void main(String[] args) {
        var window = new JFrame();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(400,400);
            window.setContentPane(new polyline());
            window.setVisible(true);
    }
    }


