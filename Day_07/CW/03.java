import java.util.*;

abstract class Complex {
  double real, imag;

  Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  abstract Complex calculate(Complex o);

  abstract void display();

  static void display(double real, double imag) {
    if (Double.isNaN(imag) || imag < 0)
      System.out.printf("\t%.4f %.4f i\n", real, imag);
    else
      System.out.printf("\t%.4f +%.4f i\n", real, imag);
  }
}

class Addition extends Complex {

  Addition(double real, double imag) {
    super(real, imag);
  }

  Complex calculate(Complex o) {
    return new Addition(real + o.real, imag + o.imag);
  }

  void display() {
    System.out.println("Addition:");
    Complex.display(real, imag);
  }

}

class Subtraction extends Complex {
  Subtraction(double real, double imag) {
    super(real, imag);
  }

  Complex calculate(Complex o) {
    return new Subtraction(real - o.real, imag - o.imag);
  }

  void display() {
    System.out.println("Subtraction:");
    Complex.display(real, imag);
  }

}

class Multiplication extends Complex {
  Multiplication(double real, double imag) {
    super(real, imag);
  }

  Complex calculate(Complex o) {
    return new Multiplication(
        (real * o.real) + (imag * o.imag * -1),
        (real * o.imag) + (imag * o.real));
  }

  void display() {
    System.out.println("Multiplication:");
    Complex.display(real, imag);
  }

}

class Division extends Complex {
  Division(double real, double imag) {
    super(real, imag);
  }

  Complex calculate(Complex o) {
    Complex num = new Multiplication(real, imag)
        .calculate(new Multiplication(o.real, -o.imag));

    Complex dem = new Multiplication(o.real, o.imag)
        .calculate(new Multiplication(o.real, -o.imag));

    return new Division(num.real / dem.real, num.imag / dem.real);
  }

  void display() {
    System.out.println("Division:");
    Complex.display(real, imag);
  }

}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r1 = sc.nextInt();
    int im1 = sc.nextInt();
    int r2 = sc.nextInt();
    int im2 = sc.nextInt();

    Complex c1, c2;

    c1 = new Addition(r1, im1);
    c2 = new Addition(r2, im2);
    c1.calculate(c2).display();

    c1 = new Subtraction(r1, im1);
    c2 = new Subtraction(r2, im2);
    c1.calculate(c2).display();

    c1 = new Multiplication(r1, im1);
    c2 = new Multiplication(r2, im2);
    c1.calculate(c2).display();

    c1 = new Division(r1, im1);
    c2 = new Division(r2, im2);
    c1.calculate(c2).display();
  }
}