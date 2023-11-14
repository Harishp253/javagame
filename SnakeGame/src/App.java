import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        int boardwidth =600;
        int boardhight = boardwidth;
        JFrame  frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth,boardhight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snake = new SnakeGame(boardhight, boardwidth);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }
}
