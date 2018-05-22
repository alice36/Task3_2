public class AreaTest {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Rectangle rectangle1 = new Rectangle(2,5);
        Circle circle1 = new Circle(4);
        Triangle triangle1 = new Triangle(2,5);

        ShapeCalculator shapeCalc = new ShapeCalculator();

        double squareArea = shapeCalc.squareArea(square1);
        double rectangleeArea = shapeCalc.rectPerimeter(rectangle1);
        double circleArea = shapeCalc.circleArea(circle1);
        double triangleArea = shapeCalc.trianglePerimeter(triangle1);

        System.out.println("Pole kwadratu = " + squareArea);
        System.out.println("Pole prostokąta = " + rectangleeArea);
        System.out.printf("Pole koła = %.2f" , circleArea);
        System.out.println("");
        System.out.println("Pole trójkąta = " + triangleArea);

    }
}
