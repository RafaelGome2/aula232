package model.entities;

public class Circle extends AbstractShape {
		private double Radius;
//-----------------------------------------------------	
	public Circle(Color color, double radius) {
			super(color);
			Radius = radius;
		}
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	
	
	@Override
	public double area() {//raio elevado a 2
	return Math.PI * Math.pow(Radius, 2);
	}
	
}
