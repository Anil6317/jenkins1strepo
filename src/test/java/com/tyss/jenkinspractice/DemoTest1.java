package com.tyss.jenkinspractice;

import org.testng.annotations.Test;

public class DemoTest1 
{
     @Test(groups="sanity")
     public void test1()
     {
    	 System.out.println("welcome to jenkins");
    	 System.out.println("i m adding new line for cross checking");
     }

}
