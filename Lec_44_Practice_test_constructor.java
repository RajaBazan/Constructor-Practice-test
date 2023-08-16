package hello.com;
class cylinder{
    double radius;
    double height;
    double pi;
    public double area(){
        return 2*pi*radius*height+2*pi*(radius*radius);
    }
    public double diameter(){
        return 2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }
}
public class Lec_44_Practice_test_constructor {
    public static void main(String[] args) {
        cylinder name = new cylinder();
        name.getHeight();
        name.setHeight(10);
        name.getRadius();
        name.setRadius(3);
        name.getPi();
        name.setPi(3.14);
        name.area();
        name.diameter();

        System.out.println("the area of cylinder is:  " + name.area());
        System.out.println("the perimeter of cylinder is:  " + name.diameter());
    }
}
