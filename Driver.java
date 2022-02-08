/**This is the Driver class that creates the sample RationalNumber and allows the user to create a new RationalNumber
 * It then prints out the functionality of all the methods available in RationalNumber
 * Driver class also uses function getInt() defined in Validator1 class which is multi-level inherited through RationalNUmber class
 * 
 * @author Ritu Raj Pradhan
*/

public class Driver{
	public static void main(String[] args){
		RationalNumber rationalObject = new RationalNumber(Validator1.getInt("Enter numerator: "), Validator1.getInt("Enter denominator: "));
		RationalNumber sample = new RationalNumber(6,7);
		RationalNumber temp;
		System.out.println("GCD: " + rationalObject.getGcd());
		System.out.println("Reduced Fraction: " + rationalObject.getNumerator() + "/" + rationalObject.getDenominator());
		System.out.println("Double Value: " + rationalObject.getDoubleValue());
		temp = rationalObject.multiply(sample);
		System.out.println("Multiplication Result: " + temp.getNumerator() + "/" + temp.getDenominator());
		temp = rationalObject.divide(sample);
		System.out.println("Division Result: " + temp.getNumerator() + "/" + temp.getDenominator());
		temp = rationalObject.add(sample);
		System.out.println("Addition Result: " + temp.getNumerator() + "/" + temp.getDenominator());
		temp = rationalObject.subtract(sample);
		System.out.println("Subtraction Result: " + temp.getNumerator() + "/" + temp.getDenominator());
	}
}