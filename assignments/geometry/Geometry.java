/*
 * Just add test methods like the one shown below. (Oh, and maybe fix the bug in
 * subtract.) All numbers are double.
 */

public class Geometry {

  public double perimeterOfSquare(double side) {
    return side * 4;
  }

  public double midpoint(double n1, double n2) {
    return (n1 + n2) / 2;
  }

  public double hypotenuse(double n1, double n2) {
    return Math.sqrt(Math.pow(n1,2) + Math.pow(n2,2));
  }

  public double perimeterOfRectangle(double w, double h) {
    return 2 * w + 2 * h;
  }
  
  public double areaOfSquare(double s) {
    return Math.pow(s,2);
  }

  public double areaOfRectangle(double w, double h) {
    return w * h;
  }
}
