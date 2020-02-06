package com.epampgms.maven_java;

public class Chocolate extends Sweet{
	Chocolate(int num,int price,int weight)
	{
	super(num,price,weight);
	}
	public  String toString()
	{
	 String str="Price: "+this.price+" Weight: "+this.weight+" Total_Number: "+this.num;
	 return str;
	}  
}
