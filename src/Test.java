public class Test {
    public static void main(String[] args) {
        ShapeFactiry shapeFactiry = new ShapeFactiry();

        Shape circle = shapeFactiry.getShape("Circle");
        Shape square = shapeFactiry.getShape("Square");
        Shape rectangle = shapeFactiry.getShape("Rectangle");

        circle.build();
        square.build();
        rectangle.build();
    }
}
