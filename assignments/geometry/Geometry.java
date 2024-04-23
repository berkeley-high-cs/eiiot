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
}
