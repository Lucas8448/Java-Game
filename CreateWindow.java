import javax.swing.JFrame;

public class CreateWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Game");
        frame.setVisible(true);
    }
}