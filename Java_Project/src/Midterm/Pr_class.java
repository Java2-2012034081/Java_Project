package Midterm;

import java.util.Scanner;

public class Pr_class {
	
	Pt_class ptc = new Pt_class();
	Scanner input = new Scanner(System.in);
	
	void f1(){
		int x, y, result=0;
		String op;
		System.out.print("input number 1: ");
		x = input.nextInt();
		System.out.print("input number 2: ");
		y = input.nextInt();
		System.out.print("input Operator: ");
		op = input.next();
		if(op.equals("+"))
			result=x+y;
		else if(op.equals("-"))
			result=x-y;
		else if(op.equals("*"))
			result=x*y;
		else if(op.equals("/"))
			result=x/y;
		else if(op.equals("%"))
			result=x%y;
		else System.out.println("You Babo");
		ptc.f3(x, y, result, op);
	}
	
	void f2(){
		String str1, str2;
		System.out.println("Input string 1: ");
		str1 = input.next();
		System.out.println("Input string 2: ");
		str2 = input.next();
		ptc.f3(str1.concat(str2));
	}

}
