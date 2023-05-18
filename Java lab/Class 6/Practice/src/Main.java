import java.awt.*;

//Afzal
class Main{
    public static void main(String[] args) {

        Ball a = new Ball(Color.RED, 30);
        Ball b = new Ball(new Color(100,25,200),50);

        Ball test = a.collidewith(b);

        a.showdetalils();
        b.showdetalils();
        test.showdetalils();

        Ball test2 = a.collidewith(b);
        test2.showdetalils();

    }
}