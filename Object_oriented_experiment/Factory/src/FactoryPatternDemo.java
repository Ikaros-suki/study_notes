public class FactoryPatternDemo {
    public static void main(String[] args) {
    
    ShapeFactory shapeFactory;
    Shape shape;
    
    //获取 Circle 的对象，并调用它的 draw 方法
    shapeFactory = new CircleFactory();
    shape = shapeFactory.createShape();
    shape.draw();
    //获取 Rectangle 的对象，并调用它的 draw 方法
    shapeFactory = new RectangleFactory();
    shape = shapeFactory.createShape();
    shape.draw();
    //获取 Square 的对象，并调用它的 draw 方法
    // shapeFactory = new SquareFactory();
    shape = new SquareFactory().createShape();
    shape.draw();
    
    }
   }