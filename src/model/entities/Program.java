package model.entities;

public class Program {

	public static void main(String[] args) {
	AbstractShape figura1 = new Circle(Color.WHITE, .5);
	System.out.println("area figura 1 = " +String.format("%.3f", figura1.area()));

	}

}
