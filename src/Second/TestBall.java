package Second;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball.toString());

        ball.setX(2.3);
        ball.setY(6.8);
        System.out.println(ball.toString());

        ball.setXY(4.3, 2.9);
        System.out.println(ball.toString());

        ball.move(2, 3);
        System.out.println(ball.toString());
    }
}
