/**
 * 
 */
package edu.lonestar.riroush.cosc1337;

/**
 * @author rjroush
 *
 */
public class Rectangle {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length){
		this.length =  length;
		this.width = width;
	
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	public double getArea(){
		return (width * length);
	}
	public String toString(){
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f", width, length, getArea()); 
	}

}