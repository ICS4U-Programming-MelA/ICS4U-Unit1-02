/* Allows the user to enter the mass of an object and tells them how much energy would be
 * released if it was turned into energy.
 */
import java.util.InpuMismatchException;
import java.util.Scanner;

class EinsteinEquation {
  public static void main(String[] args) {
    System.out.print("This program calculates how much energy would be released from an object if"
                   + " it was turned into energy (using Einstein's equation, E = mc^2)."
                   + " To do so, it requires the mass of the object.");
    Scanner input = new Scanner(System.in);
    System.out.print("\n" + "Enter the mass of the object (kg): ");
    try {
      double userObjectMass = input.nextDouble();
      input.close();
      final double lightSpeed = 299800000.0;
      double objectEnergyRelease = userObjectMass * (Math.pow(lightSpeed, 2));
      System.out.print("\n" + "The energy this object would release is: " + objectEnergyRelease
                     + " J");
    } catch (InputMismatchException a) {
      System.out.print("\n" + "That isn't a number. Please try again.");
    } finally {
      System.out.print("\n");
    }
  }
}
