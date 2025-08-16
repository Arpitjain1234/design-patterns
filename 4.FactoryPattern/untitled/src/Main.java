public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();


        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("triangle");
        shape2.draw();
    }
}