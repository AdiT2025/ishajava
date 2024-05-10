package rmiarea;

import java.rmi.*;
import java.rmi.registry.*;

import java.util.Scanner;


public class AreaClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		double r = sc.nextDouble();
		
		AreaInterface obj1 = (AreaInterface)Naming.lookup("rmi://localhost:2000/ABC");
		
		System.out.println("Area is : " + obj1.area(r));

	}

}