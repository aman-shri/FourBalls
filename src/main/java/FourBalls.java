import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;

    int y_coordinate = HEIGHT/5;
    Ball balls[] = new Ball[4];


    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    class Ball{
        int x;
        int y;
        int speed;

        Ball(int x, int y){
            this.x = x;
            this.y = y;
            this.speed = x;
        }

        void display(){
            ellipse(x, y, DIAMETER, DIAMETER);
        }

        void move(){
            x += speed;
        }
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        for(int i = 0; i<balls.length; i++){
            balls[i] = new Ball(i+1, y_coordinate * (i+1));
        }
    }

    @Override
    public void draw() {
        for(Ball ball : balls){
            ball.display();
            ball.move();
        }
    }

}
