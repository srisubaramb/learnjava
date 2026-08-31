package Classwork.Aug28.Interface;

interface Shape{
    double calculateArea();
}
class Circle implements  Shape{
    private final double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; //pir2
    }
}
class Rectangle implements Shape{
    private  final double width;
    private  final  double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return width * height;
    }
}
public class ShapeInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Rectangle rect = new Rectangle(15,10);
        System.out.println(circle.calculateArea());
        System.out.println(rect.calculateArea());
    }
}
