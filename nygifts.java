package com.epampgms.maven_java;
import java.util.*;
public class nygifts {
	String child;
    int ts,tc;
   
nygifts(String child,int ts,int tc){
this.child=child;
this.ts=ts;
this.tc=tc;
}
public static int count(Chocolate[] choc,int min,int max) {
int count=0;
for(int i=0;i<choc.length;i++)
if(choc[i].price>=min && choc[i].price<=max)
count+=choc[i].num;
return count;
}
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of children");
int n=sc.nextInt();
int total_s,total_c;
nygifts[] gift=new nygifts[n];
Sweet[] sweet;
Chocolate[] choc;
String child;
 
for(int i=0;i<n;i++) {
System.out.println("Enter name of child");
child=sc.next();

System.out.println("Enter total no of sweets");
   total_s=sc.nextInt();
System.out.println("Enter total no of chocolates");
  total_c=sc.nextInt();
sweet=new Sweet[total_s];
choc=new Chocolate[total_c];
   
gift[i]=new nygifts(child,total_s,total_c);
int cost,weight,tw=0,number=0;
System.out.println("Enter cost and weight and no.of sweets of same type");
for(int j=0;j<gift[i].ts;j++) {
cost=sc.nextInt();
weight=sc.nextInt();
number=sc.nextInt();
sweet[j]=new Sweet(number,cost,weight);
tw+=weight*number;
}

String type;
System.out.println("Enter cost,weight and no.of chocolates of same type");
for(int j=0;j<gift[i].tc;j++) {
cost=sc.nextInt();
weight=sc.nextInt();
number=sc.nextInt();
choc[j]=new Chocolate(number,cost,weight);
tw+=weight*number;
}


System.out.println("Total weight"+gift[i].child+" is: "+tw);

System.out.println("Sort the chocolates by Number of chocolates");


Arrays.sort(choc,new Sorting());
System.out.println("After sorting..");

for(int j=0;j<total_c;j++)
System.out.println(choc[j]);


System.out.println("Enter cost range ");
int start=sc.nextInt();
int end=sc.nextInt();

System.out.println("Number of chocolates in given range of price "+count(choc,start,end));
}
sc.close();
}
}
