public class ShapeFactory {

    Shape getShape(String input){
        switch (input){
            case "triangle":
                return new Triangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            default:
                return null;
        }

    }
}
