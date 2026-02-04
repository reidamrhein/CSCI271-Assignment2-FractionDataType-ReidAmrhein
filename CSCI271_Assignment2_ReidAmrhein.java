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

public class CSCI271_Assignment2_ReidAmrhein{
    private double numerator;
    private double denominator;

    // i have to name this class the same as the filename
    public CSCI271_Assignment2_ReidAmrhein(double a, double b){
        if (b == 0){
            numerator = a;
            denominator = 0; // to represent NaN
        }
        else if (b < 0) {
            // Normalize fraction so denominator > 0
            a = -a;
            b = -b;
        }
    }
    
    public static void main(String[] args){
    
    }
}