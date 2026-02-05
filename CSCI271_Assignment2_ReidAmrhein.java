/*************************************************************************
* Assignment 2 for CSCI 271-001 Spring 2026
*
* Author: Reid Amrhein
* OS: Mac
* Compiler: javac 25.0.1
* Date: January 27, 2026
*
* Purpose
* Basically, we plan to avoid float number division by keeping the values as 
fractions, which means that we need several operations to implement the data 
type and implement the operations needed to perform the desired 
arithmetic manipulations.
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Reid Amrhein>
* Said not to include Student ID, so I didn't include it
********************************************************************/

// I used my notes and the powerpoints for help on this
public class CSCI271_Assignment2_ReidAmrhein{
    public class Fraction {
        private int numerator; // Stores the numerator of the fraction
        private int denominator; // Stores the denominator of the fraction

        // Task 1: COnstructors
        public Fraction (int a, int b){
            if (b == 0) {           // Infinity or NaN
                numerator = a;
                denominator = 0;
                return;
            }

            if (a == 0) {           // Normalize zero
                numerator = 0;
                denominator = 1;
                return;
            }

            if (b < 0) {            // Keep denominator positive
                a = -a;
                b = -b;
            }

            int g = gcd(a, b); // Greatest Common Denominator Function
            numerator = a / g;
            denominator = b / g;
        }

        public Fraction(int a) {
            this(a, 1);
        }
    }
    
    // Task 2: toString Function
    
    /***************************** toString ****************************
        * Description:
        * Converts the fraction to a String representation.
        *
        * Returns:
        * String representation of the fraction.
        *******************************************************************/

    public String toString() {
        if (denominator == 0) {
            if (numerator == 0) {
                return "NaN";
            }
            else if (numerator > 0) {
                return "Infinity";
            }
            else {
                return "-Infinity";
            }
        }

        if (denominator == 1) {
            return Integer.toString(numerator);
        }

        return numerator + "/" + denominator;
    }

    // Task 3: Arithmatic Operations

    /***************************** add *********************************
        * Description:
        * Adds this fraction to another fraction.
        *******************************************************************/
    
    public Fraction add(Fraction f){
        return new Fraction(numerator * f.denominator + f.numerator * denominator, denominator * f.denominator);
    }

    /***************************** subtract ****************************
        * Description:
        * Subtracts another fraction from this fraction.
        *******************************************************************/
    
    public Fraction subtract(Fraction f){
        return new Fraction(numerator * f.denominator - f.numerator * denominator, denominator * f.denominator);
    }

    /***************************** multiply ****************************
        * Description:
        * Multiplies this fraction by another fraction.
        *******************************************************************/

    public Fraction multiply(Fraction f){
        return new Fraction(numerator * f.numerator, denominator * f.denominator);
    }

    /***************************** divide ******************************
        * Description:
        * Divides this fraction by another fraction with cross multiplication.
        *******************************************************************/

    public Fraction divide(Fraction f){
        // To divide fractions, you cross multiply
        return new Fraction(numerator * f.denominator, denominator * f.numerator);
    }

    /***************************** negate ******************************
        * Description:
        * Returns the negative version of this fraction.
        *******************************************************************/

    public Fraction negate(){
        return new Fraction(-numerator, denominator);
    }

    /***************************** pow *********************************
        * Description:
        * Raises this fraction to the n-th power.
        *******************************************************************/

    public Fraction pow(int n){
        if (n == 0){
            return new Fraction(1);
        }

        int a = Math.pow(numerator, Math.abs(n));
        int b = Math.pow(denominator, Math.abs(n));

        if (n < 0) {
            return new Fraction(b, a);
        }

        return new Fraction(a, b);
    }
    // Task 4: Main Testing
    public static void main(String[] args){
    
    }
}