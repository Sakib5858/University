public class Balltest{
    String color;
    double weight;

    public Balltest(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    Balltest collidewith(Balltest a)
    {
       Balltest temp = new Balltest(a.color,this.weight+a.weight);
       return temp;
    }
}
