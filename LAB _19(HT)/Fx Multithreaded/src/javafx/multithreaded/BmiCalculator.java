package javafx.multithreaded;

public class BmiCalculator {

  private static final double FEET_TO_METRES_CONVERSION_FACTOR = 3.281;

  BmiCalculator() {
  }

  private static double feetToMetres(double heightInFeet) {
    return heightInFeet / FEET_TO_METRES_CONVERSION_FACTOR;
  }

  public static String calculateBMI(double weight, double height) {
    if (height <= 0 || weight <= 0) {
      throw new IllegalArgumentException("Height or weight must be a positive number!");
    }
    double bmiResult = weight / Math.pow(feetToMetres(height), 2);

    if (bmiResult <= 18.5) {
      return "UnderWeight";
    } 
    else if (bmiResult > 24.9 && bmiResult < 30) {
      return "Overweight";
    } 
    else if (bmiResult > 29.9) {
      return "Obese";
    }
    else{
      return "Normal";
    }

  }
}
