public class Rectengularsolid extends Geometry{

    double length, width, height ;

    public Rectengularsolid(double length,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    protected double volume(){
        return this.length*this.width*this.height;
    }
    protected double surfcearea()
    {
        return 2*(this.width*this.length+this.height*this.length+this.height*this.width);
    }
    protected void duplicate()
    {
        System.out.println("Length of the new Rectangularsolid is :" + (this.length*3));
        res = volume();
        System.out.println("Volume of the new Rectangularsolid is :" + res);
        res = surfcearea();
        System.out.println("Surface of the new Rectangularsolid is :" + res);
        System.out.println();
    }
}
