package edu.brown.cs.student.main;


public class MathBot implements Collable{

  /**
   * Default constructor.
   */
  public MathBot() {

  }

  /**
   * Adds two numbers together.
   *
   * @param num1 the first number.
   * @param num2 the second number.
   * @return the sum of num1 and num2.
   */
  public double add(double num1, double num2) {
    return num1 + num2;
  }

  /**
   * Subtracts two numbers.
   *
   * @param num1 the first number.
   * @param num2 the second number.
   * @return the difference of num1 and num2.
   */
  public double subtract(double num1, double num2) {
    return num1 - num2;
  }

  @Override
  public Object run(String[] arguments) {
    if (arguments[0].equals("add")){
      return this.add(Double.valueOf(arguments[1]),Double.valueOf(arguments[2]));
    } else {
      return this.subtract(Double.valueOf(arguments[1]), Double.valueOf(arguments[2]));
    }
  }
}
