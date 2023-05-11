public class Spher extends Geometry implements Rollable,Expandable,Colorable{

    double radius;
    public Spher(double radius) {
        this.radius = radius;
    }
    protected double volume(){
        return (4/3)*3.1416*this.radius*this.radius*this.radius;
    }
    protected double surfcearea()
    {
        return 4*3.1416*this.radius*this.radius;
    }

    @Override
    public void showExpandable() {
        System.out.println("It can be expand");
    }

    @Override
    public void showsinkable() {
        System.out.println("It is also sinkable");
    }

    @Override
    public void showcolor() {
        System.out.println("It's color is gray");
    }
    public void showrollable(){
        System.out.println("It is rollable");
    }
}
