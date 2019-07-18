package javaworkspace;

public class Rectangle extends Shape {
	int width;
	int length;
	
	public Rectangle(int length,int width)
	{
		this.width=width;
		this.length=length;
	}
	
	public void calArea()
	{
		System.out.println(this.length*this.width);
	}
	
	public static void main(String[] args) {
		Rectangle rect =new Rectangle(10, 5);
		rect.calArea();
	}
}
