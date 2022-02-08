/**
 * A rational number given by a numerator and denominator.
 *
 * @author Srivarun
 */
public class RationalNumber
{

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int numerator;

	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 1 if this RationalNumber is 0.
	 */
	private int denominator;

	private int gcd;

	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param numerator an arbitry integer number
	 * @param denominator an integer not equal to zero
	 */

	public RationalNumber(){
		this(0,1);
	}

	public RationalNumber(int num){
		this.numerator = num;
		this.denominator = 1;
		reduceFraction();
	}

	public RationalNumber(int num, int den) {
		this.numerator = num;
		if (num == 0) {
			denominator = 1;
		}
		if (den == 0) {
			throw new RuntimeException("Denominator is Zero");
		}else{
			this.denominator = den;
		}
		reduceFraction();
	}

	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */

	private int getGcd(int p, int q) {
			p = Math.abs(p);
			q = Math.abs(q);
			int r = p%q;
			while (r > 0) {
				p = q;
				q = r;
				r = p%q;
			}
			//System.out.println("GCD::"+q);
			return q;
	}

	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greatest common divisor.
	 */
	private void reduceFraction() {
		this.gcd = getGcd(Math.abs(numerator), denominator);
		//int num, den;

		if (gcd > 0) {
			numerator = numerator / gcd;
			denominator = denominator / gcd;

		}

	}

	public int getGcd(){
		return this.gcd;
	}

	/**
	 * Adds the given <code>rationaleNumber</code> to this RationalenNumber
	 * and returns the sum as a new RationalNumber.
	 */
	public RationalNumber add(RationalNumber rationaleNumber) {
		return new RationalNumber((numerator * rationaleNumber.denominator) + (denominator * rationaleNumber.numerator),
							      (denominator * rationaleNumber.denominator));
	}

	/**Subtracts the given rationaleNumber from this RationalNumber and returns the difference as a new RationalNumber
	 */
	public RationalNumber subtract(RationalNumber rationaleNumber){
		return new RationalNumber(this.numerator * rationaleNumber.denominator - this.denominator * rationaleNumber.numerator,
								  this.denominator * rationaleNumber.denominator);
	}

	/**Multiplies the given rationaleNumber to this RationalNumber and returns the product as a new RationalNumber
	 */
	public RationalNumber multiply(RationalNumber rationaleNumber){
		return new RationalNumber(this.numerator * rationaleNumber.numerator, this.denominator * rationaleNumber.denominator);
	}

	/**Creates a new RationalNumber by swapping the numerator and denominator of this RationalNumber and returns the new RationalNumber
	 */

	private RationalNumber reciprocal(){
		return new RationalNumber(this.denominator,this.numerator);
	}

	/**Calls reciprocal() function for the given rationaleNumber, and passes the returned object to this RationalNumber's multiply() function
	 * and returns the object returned from multiply()
	 */
	public RationalNumber divide(RationalNumber rationaleNumber){
		return(this.multiply(rationaleNumber.reciprocal()));
	}



	/**
	 * Returns the denominator of this RationalNumber.
	 * It is zero, if this RationalNumber is zero.
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Returns the numerator of this RationalNumber.
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the value of this RationalNumber as a double value.
	 */
	public double getDoubleValue() {
		return (double) numerator / (double) denominator;
	}

}