package shapes;

public class ShapesTest {
	public static void main(String[] args) {
//		Rectangle box1 = new Rectangle(5,4);
//		Rectangle box2 = new Square(5);
//
//		System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//		System.out.println("box1.getArea() = " + box1.getArea());
//
//		System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//		System.out.println("box2.getArea() = " + box2.getArea());
		Measurable myShape = new Square(5);
		System.out.println("myShape is a square");
		System.out.println("myShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
		System.out.println("myShape is a rectangle");
		myShape = new Rectangle(5,4);
		System.out.println("myShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
	}
}
