package shapes;

public class Rectangle extends Quadrilateral {
	public Rectangle(int length, int width) {
		super(length, width);
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}
//	protected int length;
//	protected int width;
//
//	public Rectangle(int length, int width){
//		this.length = length;
//		this.width = width;
//	}
//
//	public int getArea(){
//		return this.length * this.width;
//	}
//
//	public int getPerimeter(){
//		return (this.length * 2) + (this.width * 2);
//	}
}
