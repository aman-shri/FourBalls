import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int y_coordinates[] = new int[4];
    int x_coordinates[] = new int[4];

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        for(int i = 0; i<4; i++){
            x_coordinates[i] = i+1;
            y_coordinates[i] = HEIGHT/5 * (i+1);
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            drawCircle(x_coordinates[i], y_coordinates[i]);
            x_coordinates[i]+=i+1;
        }
    }

    private void drawCircle(int x,int y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }
}
