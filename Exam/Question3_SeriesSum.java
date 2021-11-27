/*
Write a java program to create a class Sum inside a package name Calculate which performs the sum of the following series

1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)

 Create another package Number having the class Check with only one variable as a primitive type which includes the following methods isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ) and isPrime(). Import these packages into a demo java program to demonstrate the usage of  user-defined packages.
*/

import Exam.Calculate.Sum; //defined in  it's own package
import Exam.Number.Check; //defined in it's own package
import java.util.*;

public class demo {
	public static void main(String args[]){
		Sum sumObj = new Sum(50);
		System.out.println(sumObj.getSum());
		
		Check checkObj = new Check(555);
		System.out.print(checkObj.isZero() , checkObj.isEven());

	}
}