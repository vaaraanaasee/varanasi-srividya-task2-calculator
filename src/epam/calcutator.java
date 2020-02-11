/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam;

/**
 *
 * @author VARANASI
 */
import java.util.*;
public class calcutator {

            		public int add(int a,int b) {
			return (a+b);
		}
		public int multiply(int a,int b) {
			return (a*b);
		}
		public int divide(int a,int b) {
			return (a/b);
                }
		public int subtract(int a,int b) {
					return (a-b);
                }
	     public int modulus(int a,int b) {
					return (a%b);
				}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calcutator cc=new calcutator();
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=0;
		System.out.println("1.Addition\n"+"2.Substraction\n"+"3.Mutiplication\n"+"4.Division\n"+"5.modulo\n"+"6.Exit\n");
		while(n!=6)
		{
			System.out.println("choose any operation");
			 n=sc.nextInt();
			switch(n)
			{
			case 1:System.out.println("The Addition of Two numbers "+a+" and "+b+" is "+cc.add(a,b));break;
			case 2:System.out.println("The Subtraction of Two numbers "+a+" and "+b+" is "+cc.subtract(a,b));break;
			case 3:System.out.println("The Multiplication of Two numbers "+a+" and "+b+" is "+cc.multiply(a,b));break;
			case 4:System.out.println("The Division of Two numbers "+a+" and "+b+" is "+cc.divide(a,b));break;
			case 5:System.out.println("The Modulus of Two numbers "+a+" and "+b+" is "+cc.modulus(a,b));break;
			case 6:System.exit(0);
			default:System.exit(0);
			}
		}
		sc.close();
		
	}



    
}
