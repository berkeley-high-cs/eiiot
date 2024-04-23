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

  public double areaOfTriangle(double b, double h) {
    return 0.5 * b * h;
  }

  public double areaOfTrapezoid(double b1, double b2, double h) {
    return (b1 + b2) * 0.5 * h;
  }

  public double areaOfCircle(double r) {
    return Math.PI * Math.pow(r, 2);
  }

  public double surfaceAreaOfSphere(double r) {
    return 4 * areaOfCircle(r);
  }

  public double volumeOfSphere(double r) {
    return Math.PI * Math.pow(r,3) * (4.0/3.0);
  }

  public double circumferenceOfCircle(double r) {
    return Math.PI * 2 * r;
  }

  public double curvedSurfaceAreaOfCylinder(double r, double h) {
    return h * circumferenceOfCircle(r);
  }
  
  public double totalSurfaceAreaOfCylinder(double r, double h) {
    return curvedSurfaceAreaOfCylinder(r, h) + 2 * areaOfCircle(r);
  }

  public double volumeOfCylinder(double r, double h) {
    return h * areaOfCircle(r);
  }

  public double curvedSurfaceAreaOfConeFromSlantHeight(double r, double sh) {
    return Math.PI * r * sh;
  }

  public double totalSurfaceAreaOfConeFromSlantHeight(double r, double sh) {
    return curvedSurfaceAreaOfConeFromSlantHeight(r, sh) + areaOfCircle(r);
  }

  public double totalSurfaceAreaOfConeFromHeight(double r, double h) {
    return totalSurfaceAreaOfConeFromSlantHeight(r, 
    hypotenuse(r, h)
    );
  }

  public double volumeOfCone(double r, double h) {
    return areaOfCircle(r) * (h/3);
  }
}
