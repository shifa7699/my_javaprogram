package com.java.unit.Junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_1 
{
    @Test
	  void test() 
    {
		    Max ob=new Max();
		    int arr[]= {90,80,40,20};
		    int actual=ob.maximum(arr);
		    int expected=90;
		    assertEquals(expected,actual);
		}
}
//Create a junit test case for finding the maximum value in an array
