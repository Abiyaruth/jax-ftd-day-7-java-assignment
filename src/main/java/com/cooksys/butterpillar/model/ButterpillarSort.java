package com.cooksys.butterpillar.model;

public class ButterpillarSort implements IButterpillar {
   private double length;
   private double leavesEaten;
 
public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}
@Override
public void setLeavesEaten(double leavesEaten) {
	this.leavesEaten=leavesEaten;
}

@Override
public double getLeavesEaten() {
	return leavesEaten;
}
@Override
public int compareTo(IButterpillar o) {
	/*if(this.length>o.getLength())
	{
	 return (length.compareTo(o.getLength())>0);
	 if(this.length >o.getLength())
	 {
		 return(length.compareTo(o.getLength()<0));
		 
	 }
	}*/
	if(this.length > o.getLength())
	{
		return 1;
	}
	
	if(this.length < o.getLength())
	{
		return -1;
	}else if(length == o.getLength())
	{		
	   if(this.leavesEaten>o.getLeavesEaten())
	   {
		   return 1;
	   }if(this.leavesEaten<o.getLeavesEaten())
	   {
		   return -1;
	 }else if(this.leavesEaten==o.getLeavesEaten())
	   return 0;
	   // consider leavesEaten here
	}
	return 0;
}

@Override
public String toString() {
	return "ButterpillarSort [length=" + length + ", leavesEaten=" + leavesEaten + "]";
}
}
