import java.awt.*;

public class Ball {
   private Color color;
    double weight;
    private boolean exits;

    public Ball(Color color, double weight) {

        this.weight = weight;
        this.color = color;
        exits = true;
    }
    public Ball(boolean exits)
    {
        this.exits = exits;
    }
    public void kill()
    {
        this.exits = false;
    }
   public void showdetalils()
    {
        if(this.exits)
        System.out.println("Weight : " + weight +",Color : " + color.toString());
        else
            System.out.println("!!!Doesn't Exist");
    }

    Ball collidewith(Ball a)
    {
        if(this.exits && a.exits){
            this.kill();
            a.kill();
            int r = (this.color.getRed() + a.color.getRed())/2;
            int g = (this.color.getGreen() + a.color.getGreen())/2;
            int b = (this.color.getBlue() + a.color.getBlue())/2;
            return new Ball(a.color,this.weight+a.weight);
        }
        else
            return new Ball(false);
    }
}
