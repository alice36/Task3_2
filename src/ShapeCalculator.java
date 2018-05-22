public class ShapeCalculator {

    double squareArea(Square square){
        int pole = square.bok*square.bok;
        return pole;
    }
    double circleArea(Circle circle){
        double pole = Math.PI * Math.pow(circle.promien,2);
        return pole;
    }
    double trianglePerimeter(Triangle triangle){
        double pole = triangle.podstawa * triangle.wysokosc * 0.5;
        return pole;
    }
    double rectPerimeter(Rectangle rectangle){
        double pole = rectangle.BokDluzszy*rectangle.BokKrotszy;
        return pole;
    }
}
