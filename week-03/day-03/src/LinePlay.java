import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
        Color purple = new Color(176, 78, 240);
        Color green = new Color(68, 211, 81);
        int startX = 0;
        int endY = 0;
        for (int i = 0; i < 17; i++) {
            graphics.setColor(purple);
            graphics.drawLine(startX, 0 , WIDTH, endY);
            startX = startX + 20;
            endY = endY + 20;
        }

        int startY = HEIGHT;
        int endX = WIDTH;
        for (int i = 0; i < 17; i++) {
            graphics.setColor(green);
            graphics.drawLine(0, startY , endX, HEIGHT);
            endX = endX - 20;
            startY = startY - 20;
        }
    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
