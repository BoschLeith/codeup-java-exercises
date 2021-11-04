package shapes;

public class Square extends Quadrilateral{

	public Square(double side) {
		super(side, side);
	}

	@Override
	public double getPerimeter() {
		return length * 4;
	}

	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public void setLength(double side) {
		this.length = side;
	}

	@Override
	public void setWidth(double side) {
		this.width = side;
	}
//	protected int side;
//
//	public Square(int side) {
//		super(side, side);
//		this.side = side;
//	}
//
//	public int getArea(){
//		return side * side;
//	}
//
//	public int getPerimeter(){
//		return side * 4;
//	}
}
