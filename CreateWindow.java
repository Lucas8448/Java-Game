import javax.swing.JFrame;
import java.awt.*;

public class CreateWindow {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        // print
        System.out.println(width);
        System.out.println(height);
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Game");
        frame.setVisible(true);

        while (true) {
            frame.repaint();
        }
    }
}
